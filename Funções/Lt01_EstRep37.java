/*Objetivo: receber um número inteiro. Calcular e mostrar a série de Fibonacci até o seu enésimo termo
Programador: Gabriel Rocha
Data: 02/07/2019
*/

package Funções;

import java.util.*;

public class Lt01_EstRep37{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N, Cont, Fib = 1, Ant = 0, Aux;
        
        System.out.println("Digite um número inteiro:");
        N = input.nextInt();
        System.out.println("\nPrepare-se para a sequência de Fibonacci com " + N + " termos...\n");
        
        for(Cont = 1; Cont <= N; Cont++){
            Fib = Fibonacci(Fib, Ant);
            System.out.println(Fib);
            Aux = Fib;
            Fib = Ant;
            Ant = Aux;
        }
    }
    
    public static int Fibonacci(int Atual, int Anterior){
        
        return Atual + Anterior;
    }
}