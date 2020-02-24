/*Objetivo: receber um número inteiro. Verificar e mostrar se ele é ou não divisível por 2 e 3
Programador: Gabriel Rocha
Data: 01/07/2019
*/

package Procedimentos;

import java.util.*;

public class Lt01_EstDec24{
    
    static int N;
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        N = input.nextInt();
        
        Divide_2e3();
    }
    
    public static void Divide_2e3(){
        
        if ((N % 6) == 0){
            System.out.println("\n" + N + " É divisível por 2 e 3");
        }else{
            System.out.println("\n" + N + " NÃO é divisível por 2 e 3");
        }
    }
}

