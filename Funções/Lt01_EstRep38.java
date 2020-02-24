/*Objetivo: receber 100 números reais positivos. Mostrar o maior e o menor valor entre eles.
Programador: Gabriel Rocha
Data: 02/07/2019
*/

package Funções;

import java.util.*;

public class Lt01_EstRep38{
    
    public static void main(String[] args){
        
        Random R = new Random();
        
        double N, Maior, Menor;
        int Cont;
        
        N = R.nextDouble() * 10000;
        Maior = N;
        Menor = N;
        System.out.println(N);
        
        for(Cont = 1; Cont <= 99; Cont++){
            N = R.nextDouble() * 1000;
            System.out.println(N);
            Maior = Verifica_Maior(N, Maior);
            Menor = Verifica_Menor(N, Menor);
        }
        
        System.out.println("\nMaior número entre eles: " + Maior + "\nMenor número entre eles: " + Menor);
    }
    
    public static double Verifica_Maior(double N1, double Mai){
        
        if(N1 > Mai){
            return N1;
        }else{
            return Mai;
        }
    }
    
    public static double Verifica_Menor(double N2, double Men){
        
        if(N2 < Men){
            return N2;
        }else{
            return Men;
        }
    }
}
