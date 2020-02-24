/*Objetivo: carregar códigos das peças em um tabuleiro de xadrez, onde:
Código  1       2       3       4       5       6       7
Peça   Peão   Torre    Bispo   Cavalo   Rainha  Rei    Vazio     *calcular e mostrar a somatória das peças sem usar estrutura de decisão
Programador: Gabriel Rocha
Data: 12/07/2019
*/

package Matrizes;

import java.util.*;

public class Matrizes_12{
    
    public static void main(String[] args){
        Random R = new Random();
        int[][] Mat = new int[8][8];
        int[] Pecas = new int[7];
        String[] Nomes = {"peões", "torres", "bispos", "cavalos", "rainhas", "reis", "vazios"};
        int I, J;
        java.util.Arrays.fill(Pecas, 0);
        for(I = 0; I <= 7; I++){
            for(J = 0; J <= 7; J++){
                Mat[I][J] = R.nextInt(7) + 1;
                Pecas[Mat[I][J] - 1]++;
            }
        }
        for(I = 0; I <= 7; I++){
            System.out.println(Mat[I][0] + " " + Mat[I][1] + " " + Mat[I][2] + " " + Mat[I][3] + " " + Mat[I][4] + " " + Mat[I][5] + " " + Mat[I][6] + " " + Mat[I][7]);
        }
        System.out.println();
        for(I = 0; I <= 6; I++){
            if(I != 6){
                System.out.println("Há " + Pecas[I] + " " + Nomes[I] + " neste tabuleiro!");
            }else{
                System.out.println("Há " + Pecas[I] + " espaços " + Nomes[I] + " neste tabuleiro!");
            }
        }
    }
}