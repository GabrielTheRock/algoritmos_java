/*Objetivo: receber um número N. Calcular e mostrar a série 1 + 1/1! + 1/2! + ... + 1/N!
Programador: Gabriel Rocha
Data: 02/07/2019
*/

package Funções;

import java.util.*;

public class Lt01_EstRep36{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N, Cont;
        double Soma = 1, Fat, Num;
        
        System.out.println("Digite um número inteiro:");
        N = input.nextInt();
        System.out.println("\n1    = 1.0\n");
        
        for(Cont = 1; Cont <= N; Cont++){
            Fat = Fatorial(Cont);
            Num = 1 / Fat;
            System.out.println("1/" + Cont + "! = " + Num + "\n");
            Soma = Soma + Num;
        }
        
        System.out.println("\nSoma da sequência = " + Soma);
    }
    
    public static double Fatorial(int N1){
        
        double F = 1;
        int C;
        
        for(C = N1; C >= 1; C--){
            F = F * C;
        }
        
        return F;
    }
}