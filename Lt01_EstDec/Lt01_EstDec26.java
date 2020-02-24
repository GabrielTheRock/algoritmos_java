/*Objetivo: receber 2 números inteiros. Verificar e mostrar se o maior é múltiplo do menor
Programador: Gabriel Rocha
Data: 27/06/2019
*/

package Lt01_EstDec;

import java.util.*;

public class Lt01_EstDec26{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N1, N2;
        
        System.out.println("Digite um número:");
        N1 = input.nextInt();
        
        System.out.println("Digite outro número:");
        N2 = input.nextInt();
        
        if (N1 > N2){
            if ((N1 % N2) == 0){
                System.out.println("\n" + N1 + " É múltiplo de " + N2);
            }else{
                System.out.println("\n" + N1 + " NÃO é múltiplo de " + N2);
            }
        }else{
            if ((N2 % N1) == 0){
                System.out.println("\n" + N2 + " É múltiplo de " + N1);
            }else{
                System.out.println("\n" + N2 + " NÃO é múltiplo de " + N1);
            }
        }
    }
}