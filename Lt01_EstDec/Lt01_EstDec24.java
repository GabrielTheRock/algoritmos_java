/*Objetivo: receber um número inteiro. Verificar e mostrar se ele é ou não divisível por 2 e 3
Programador: Gabriel Rocha
Data: 27/06/2019
*/

package Lt01_EstDec;

import java.util.*;

public class Lt01_EstDec24{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N;
        
        System.out.println("Digite um número inteiro:");
        N = input.nextInt();
        
        if ((N % 6) == 0){
            System.out.println("\n" + N + " É divisível por 2 e 3");
        }else{
            System.out.println("\n" + N + " NÃO é divisível por 2 e 3");
        }
    }
}