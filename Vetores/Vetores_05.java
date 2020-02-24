/*Objetivo: criar e coletar em um vetor [20] inteiro. Calcular e exibe, segundo:
10
∑ (A[I] – A[21–I])
i = 1
Programador: Gabriel Rocha
Data: 05/07/2019
*/

package Vetores;

import java.util.*;

public class Vetores_05{
    
    public static void main(String[] args){
        
        Random R = new Random();
        
        int[] A = new int[21];
        int I, N, Soma = 0;
        
        for(I = 1; I <= 20; I++){
            A[I] = R.nextInt(1000);
            System.out.println("A[" + I + "] = " + A[I]);
        }
        
        System.out.println("\nSegue a sequência:\n");
        
        for(I = 1; I <= 10; I++){
            N = A[I] - A[21 - I];
            System.out.println("A[" + I + "] - A[" + (21 - I) + "] = " + N);
            Soma = Soma + N;
        }
        
        System.out.println("\nSomatória desta sequência = " + Soma);
    }
}