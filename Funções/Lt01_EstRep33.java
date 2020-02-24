/*Objetivo: receber um número. Calcular e mostrar a série 1 + 1/2 + 1/3 + ... + 1/N.
Programador: Gabriel Rocha
Data: 02/07/2019
*/

package Funções;

import java.util.*;

public class Lt01_EstRep33{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N;
        double Soma;
        
        System.out.println("Digite um número:");
        N = input.nextInt();
        
        Soma = Sequencia(N);
        
        System.out.println("\nSoma da sequência = " + Soma);
    }
    
    public static double Sequencia(int N1){
        
        int D;
        double S = 1;
        
        for(D = 1; D <= N1; D++){
            S = (S + (1 / (double)D));
        }
        
        return S;
    }
}
