/*Objetivo: receber 100 números reais positivos. Mostrar o maior e o menor valor entre eles.
Programador: Gabriel Rocha
Data: 29/06/2019
*/

package Lt01_EstRep;

import java.util.*;

public class Lt01_EstRep38{
    
    public static void main(String[] args){
        
        Random R = new Random();
        
        double N, Maior, Menor;
        int Cont;
        
        N = R.nextDouble() * 1000;
        Maior = N;
        Menor = N;
        System.out.println(N);
        
        for(Cont = 1; Cont <= 99; Cont++){
            N = R.nextDouble() * 1000;
            System.out.println(N);
            if(N > Maior){
                Maior = N;
            }else{
                if(N < Menor){
                    Menor = N;
                }
            }
        }
        System.out.println("\nMaior número entre eles: " + Maior + "\nMenor número entre eles: " + Menor);
    }
}