/*Objetivo: receber 2 valores inteiros e diferentes. Mostrá-los em ordem crescente.
Programador: Gabriel Rocha
Data: 27/06/2019
*/

package Lt01_EstDec;

import java.util.*;

public class Lt01_EstDec22{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N1, N2;
        
        System.out.println("Digite um número inteiro:");
        N1 = input.nextInt();
        
        System.out.println("Digite outro número inteiro:");
        N2 = input.nextInt();
        
        if (N1 > N2){
            System.out.println("\n" + N2 + " < " + N1);
        }else{
            System.out.println("\n" + N1 + " < " + N2);
        }
    }
}