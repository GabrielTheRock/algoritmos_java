/*Objetivo: criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
a. A quantidade de cada produto vendido no mês;
b. A quantidade de produtos vendidos por semana;
c. O total de produtos vendidos no mês.
Programador: Gabriel Rocha
Data: 11/07/2019
*/

package Matrizes;

import java.util.*;

public class Matrizes_08{
    
    public static void main(String[] args){
        
        Random R = new Random();
        
        int[][] Mat = new int[4][3];
        int[] Sem = new int[4];
        int[] Pro = new int[3];
        
        int I, J, Total = 0;
        Pro[0] = 0;
        Sem[0] = 0;
        
        for(I = 0; I <= 3; I++){
            for(J = 0; J <= 2; J++){
                Mat[I][J] = R.nextInt(1000);
                Total = Total + Mat[I][J];
                Sem[I] = Sem[I] + Mat[I][J];
                Pro[J] = Pro[J] + Mat[I][J];
            }
        }
        
        System.out.println("|" + Mat[0][0] + "|" + Mat[0][1] + "|" + Mat[0][2] + "|");
        System.out.println("|" + Mat[1][0] + "|" + Mat[1][1] + "|" + Mat[1][2] + "|");
        System.out.println("|" + Mat[2][0] + "|" + Mat[2][1] + "|" + Mat[2][2] + "|");
        System.out.println("|" + Mat[3][0] + "|" + Mat[3][1] + "|" + Mat[3][2] + "|\n");
        
        for(I = 0; I <= 3; I++){
            System.out.println("Total de produtos vendidos na semana " + (I + 1) + " = " + Sem[I]);
        }
        
        System.out.println();
        
        for(I = 0; I <= 2; I++){
            System.out.println("Foram vendidas " + Pro[I] + " unidades do produto " + (I + 1));
        }
        
        System.out.println("\nForam vendidos " + Total + " produtos no mês");
    }
}