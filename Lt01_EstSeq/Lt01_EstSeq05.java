/*Objetivo: receber os coeficientes A, B e C de uma equação, calcular e mostrar suas raízes
Programador: Gabriel Rocha
Data: 19/06/2019
*/

package Lt01_EstSeq;

import java.util.*;

public class Lt01_EstSeq05{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int A, B, C;
        double R1, R2;
        
        System.out.print("Digite o valor de A: ");
        A = input.nextInt();
        
        System.out.print("Digite o valor de B: ");
        B = input.nextInt();
        
        System.out.print("Digite o valor de C: ");
        C = input.nextInt();
        
        R1 = ((-B + Math.sqrt(Math.pow(B, 2) - 4 * A * C))) / (2 * A);
        
        R2 = ((-B - Math.sqrt(Math.pow(B, 2) - 4 * A * C))) / (2 * A);
        
        System.out.println("R1 = " + R1);
        System.out.println("R2 = " + R2);
    }
}