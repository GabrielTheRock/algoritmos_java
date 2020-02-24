/*Objetivo: receber um número. Calcular e mostrar a série 1 + 1/2 + 1/3 + ... + 1/N.
Programador: Gabriel Rocha
Data: 29/06/2019
*/

package Lt01_EstRep;

import java.util.*;

public class Lt01_EstRep33{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N, D;
        double Soma;
        
        Soma = 0;
                
        System.out.println("Digite um número:");
        N = input.nextInt();
        
        for(D = 1; D <= N; D++){
            Soma = (Soma + (1 / (double)D));
        }
        
        System.out.println("\nSoma da sequência = " + Soma);
    }
}