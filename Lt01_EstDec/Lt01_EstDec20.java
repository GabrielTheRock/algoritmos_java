/*Objetivo: receber os coeficientes A, B e C de uma equação de 2º grau. Calcular e mostrar suas raízes, caso elas existam
Programador: Gabriel Rocha
Data: 27/06/2019
*/

package Lt01_EstDec;

import java.util.*;

public class Lt01_EstDec20{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double A, B, C, Disc, R1, R2;
        
        System.out.println("Digite o valor de A:");
        A = input.nextDouble();
        
        System.out.println("Digite o valor de B:");
        B = input.nextDouble();
        
        System.out.println("Digite o valor de C:");
        C = input.nextDouble();
        
        Disc = Math.pow(B, 2) - 4 * A * C;
        
        if (Disc > 0){
            R1 = (- B + Math.sqrt(Disc)) / (2 * A);
            R2 = (- B - Math.sqrt(Disc)) / (2 * A);
            
            System.out.println("\nRaízes reais da equação: " + R1 + " e " + R2);
        }else{
            if (Disc == 0) {
                R1 = (- B) / (2 * A);
                
                System.out.println("\nÚnica raiz real da equação: " + R1);
            }else{
                System.out.println("\nEsta equação não possui raiz real!");
            }
        }
    }
}