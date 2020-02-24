/*Objetivo: receber 2 números inteiros diferentes. Verificar e mostrar todos os números primos entre eles.
Programador: Gabriel Rocha
Data: 02/07/2019
*/

package Funções;

import java.util.*;

public class Lt01_EstRep40{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N1, N2, Maior, Menor, N,Primo;
        
        System.out.println("Digite um número inteiro:");
        N1 = input.nextInt();
        
        System.out.println("Digite outro inteiro:");
        N2 = input.nextInt();
        
        if(N1 > N2){
            Maior = N1;
            Menor = N2;
        }else{
            Maior = N2;
            Menor = N1;
        }
        
        System.out.println("\nNúmeros primos entre " + Menor + " e " + Maior + ":\n");
        
        for(N = Menor + 1; N <= Maior - 1; N++){
            Primo = Verifica_Primo(N);
            if(Primo != -1){
                System.out.println(Primo);
            }
        }
    }
    
    public static int Verifica_Primo(int N1){
        
        int Cont = 0, Resto, D;
        
        for(D = 1; D <= N1 - 1; D++){
            Resto = N1 % D;
            if(Resto == 0){
                Cont++;
            }
        }
        
        if(Cont == 1 && N1 != 1){
            return N1;
        }else{
            return -1;
        }
    }
}