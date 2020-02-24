/*Objetivo: criar e coletar em um vetor [20] com números aleatórios. Classificar este vetor em ordem crescente e mostre os dados.
Programador: Gabriel Rocha
Data: 05/07/2019
*/

package Vetores;

import java.util.*;

public class Vetores_06{
    
    public static void main(String[] args){
        
        Random R = new Random();
        
        int[] Vt = new int[20];
        int I, J, Aux;
        
        for(I = 0; I <= 19; I++){
            Vt[I] = R.nextInt(1000);
            System.out.println("Vetor [" + I + "] = " + Vt[I]);
        }
        
        System.out.println("\nVetor já ordenado:\n");
        
        for(I = 0; I <= 18; I++){
            for(J = I + 1; J <= 19; J++){
                if(Vt[I] > Vt[J]){
                    Aux = Vt[I];
                    Vt[I] = Vt[J];
                    Vt[J] = Aux;
                }
            }
        }
        
        for(I = 0; I <= 19; I++){
            System.out.println("Vetor [" + I + "] = " + Vt[I]);
        }
    }
}