/*Objetivo: receber um número inteiro. Calcular e mostrar seu fatorial
Programador: Gabriel Rocha
Data: 02/07/2019
*/

package Funções;

import java.util.*;

public class Lt01_EstRep32{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N;
        double Fat;
        
        System.out.println("Digite um número:");
        N = input.nextInt();
        
        Fat = Fatorial(N);
        
        System.out.println("\n" + N + "! = " + Fat);
    }
    
    public static double Fatorial (int N1){
        
        double F = 1;
        int Cont;
        
        for(Cont = N1; Cont >= 1; Cont--){
            F = F * Cont;
        }
        
        return F;
    }
}