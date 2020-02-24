/*Objetivo: receber os coeficientes A, B e C de uma equação de 2º grau. Calcular e mostrar suas raízes, caso elas existam
Programador: Gabriel Rocha
Data: 30/06/2019
*/

package Procedimentos;

import java.util.*;

public class Lt01_EstDec20{
    
    static int A, B, C;
    static double Disc, R1, R2;
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o coeficiente A da equação:");
        A = input.nextInt();
        
        System.out.println("Digite o coeficiente B da equação:");
        B = input.nextInt();
        
        System.out.println("Digite o coeficiente C da equação:");
        C = input.nextInt();
        
        Calcula_Raizes();
    }
    
    public static void Calcula_Raizes(){
        
        Disc = Math.pow(B, 2) - 4 * A * C;
        
        if(Disc < 0){
            System.out.println("\nEsta equação não possui nenhuma raiz real!");
        }else{
            if(Disc == 0){
                R1 = (- B) / (2 * A);
                System.out.println("\nA única raiz real desta equação é: \n" + R1);
            }else{
                R1 = ((- B) + Math.sqrt(Disc)) / (2 * A);
                R2 = ((- B) - Math.sqrt(Disc)) / (2 * A);
                System.out.println("\nAs duas raízes reais desta equação são:\n" + R1 + " e " + R2);
            }
        }
    }
}