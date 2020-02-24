/*Objetivos: criar e coletar em um vetor [30] real e calcular e exibir:
a. A média do grupo;
b. A quantidade de notas acima do grupo;
c. As posições dos valores abaixo da média do grupo.
Programador: Gabriel Rocha
Data: 05/07/2019
*/

package Vetores;

import java.util.*;
import java.text.DecimalFormat;

public class Vetores_04{
    
    public static void main(String[] args){
        
        Random R = new Random();
        DecimalFormat df = new DecimalFormat("###,##0.00");     //formatando as notas em 0,00
        
        double[] Notas = new double[30];
        int I, Acima = 0;
        double Media = 0;
        
        for(I = 0; I <= 29; I++){
            Notas[I] = R.nextDouble() * 10;
            System.out.println("Notas [" + I + "] = " + df.format(Notas[I]));
            Media = Media + Notas[I];
        }
        
        Media = Media/30;
        System.out.println("\nMédia do grupo = " + df.format(Media) + "\n");
        
        for(I = 0; I <= 29; I++){
            if(Notas[I] > Media){
                Acima++;
            }else if(Notas[I] < Media){
                System.out.println("O aluno [" + I + "] está com nota abaixo da média!");
            }
        }
        
        System.out.println("\nHá " + Acima + " alunos acima da média!");
    }
}