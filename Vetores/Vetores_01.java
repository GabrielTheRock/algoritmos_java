/*Objetivo: criar e coletar um vetor [50] inteiro. Calcular e exibir:
a. A média dos valores entre 10 e 200;
b. A soma dos números ímpares.
Programador: Gabriel Rocha
*/

package Vetores;

import java.util.*;

public class Vetores_01 {
    
    public static void main(String[] args){
        
        Random R = new Random();
        
        int[] Numeros = new int[50];
        int I, Num10200 = 0, Impares = 0;
        double Media = 0;
        
        for(I = 0; I <= 49; I++){
            Numeros[I] = R.nextInt(1000);
            System.out.println("Vetor [" + I + "] = " + Numeros[I]);
            
            if(Numeros[I] > 10 && Numeros[I] < 200){
                Num10200 = Num10200 + Numeros[I];
                Media++;
            }
            
            if(Numeros[I] % 2 != 0){
                Impares = Impares + Numeros[I];
            }
        }
        
        Media = Num10200 / Media;
        System.out.println("\nMédia dos números entre 10 e 200 neste vetor = " + Media);
        System.out.println("\nSoma dos números ímpares neste vetor = " + Impares);
    }
}
