/*Objetivo: a partir do exercício 6 (vetor classificado) solicitar um valor qualquer e verificar a sua existência no vetor (utilizar pesquisa binária).
Programador: Gabriel Rocha
Data: 05/07/2019
*/

package Vetores;

import java.util.*;

public class Vetores_07{
    
    public static void main(String[] args){
        
        Random R = new Random();
        Scanner input = new Scanner(System.in);
        
        int[] Vt = new int[20];
        int I, J, Aux, N, Min = 0, Max = 19;
        boolean Achou = false;
        
        for(I = 0; I <= 19; I++){
            Vt[I] = R.nextInt(1000);
        }
        
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
        
        System.out.print("\nDigite o número que deseja procurar no vetor: ");
        N = input.nextInt();
        
        while(Min <= Max && Achou == false){
            I = (Min + Max) / 2;
            if(Vt[I] == N){
                Achou = true;
                System.out.println("\nO número FOI encontrado! Vetor [" + I + "] = " + N);
            }else if(Vt[I] <= N){
                Min = I + 1;
            }else{
                Max = I - 1;
            }
        }
        
        if(Achou == false){
            System.out.println("\nO número " + N + " NÃO foi encontrado no vetor!");
        }
    }
}