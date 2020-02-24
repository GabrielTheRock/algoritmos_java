/*Objetivo: criar e coletar um vetor [100] inteiro e exibir:
a. O maior e o menor valor;
b. A média dos valores.
Programador: Gabriel Rocha
Data: 05/07/2019
*/

package Vetores;

import java.util.*;

public class Vetores_02{
    
    public static void main(String[] args){
        
        Random R = new Random();
        
        int[] Vt = new int[100];
        int I, Maior, Menor;
        double Media = 0;
        
        Vt[0] = R.nextInt(1000);
        Maior = Vt[0];
        Menor = Vt[0];
        Media = Media + Vt[0];
        System.out.println("Vetor [0] = " + Vt[0]);
        
        for(I = 1; I <= 99; I++){
            Vt[I] = R.nextInt(1000);
            Media = Media + Vt[I];
            System.out.println("Vetor [" + I + "] = " + Vt[I]);
            if(Vt[I] > Maior){
                Maior = Vt[I];
            }else{
                if(Vt[I] < Menor){
                    Menor = Vt[I];
                }
            }
        }
        
        Media = Media / 100;
        System.out.println("\nO menor número deste vetor é: " + Menor);
        System.out.println("\nO maior número deste vetor é: " + Maior);
        System.out.println("\nA média dos valores deste vetor é: " + Media);
    }
}