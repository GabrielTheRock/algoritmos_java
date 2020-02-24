/*Objetivo: receber 2 números inteiros, verificar qual o maior entre eles. Calcular e mostrar o resultado da somatória dos números ímpares entre esses valores.
Programador: Gabriel Rocha
Data: 02/07/2019
*/

package Funções;

import java.util.*;

public class Lt01_EstRep35{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N1, N2, Menor, Maior, Soma;
        
        System.out.println("Digite um número inteiro:");
        N1 = input.nextInt();
        
        System.out.println("Digite outro número inteiro:");
        N2 = input.nextInt();
        
        if(N1 > N2){
            Maior = N1;
            Menor = N2;
        }else{
            Maior = N2;
            Menor = N1;
        }
        
        Soma = Calcula_Soma(Menor, Maior);
        
        System.out.println("\nA somatória dos números ímpares entre " + Menor + " e " + Maior + " é igual a: \n" + Soma);
    }
    
    public static int Calcula_Soma(int Men, int Mai){
        
        int N, S = 0;
        
        if((Mai % 2) == 0){
            if((Men % 2) == 0){
                for(N = Men + 1; N <= Mai - 1; N = N + 2){              //ambos pares
                    S = S + N;
                }
            }else{
                for(N = Men + 2; N <= Mai - 1; N = N + 2){              //maior par e menor ímpar
                    S = S + N;
                }
            }
        }else{
            if((Men % 2) == 0){
                for(N = Men + 1; N <= Mai - 2; N = N + 2){              //maior ímpar e menor par
                    S = S + N;
                }
            }else{
                for(N = Men + 2; N <= Mai - 2; N = N + 2){              //ambos ímpares
                    S = S + N;
                }
            }
        }
        
        return S;
    }
}
