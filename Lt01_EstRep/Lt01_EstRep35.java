/*Objetivo: receber 2 números inteiros, verificar qual o maior entre eles. Calcular e mostrar o resultado da somatória dos números ímpares entre esses valores.
Programador: Gabriel Rocha
Data: 29/06/2019
*/

package Lt01_EstRep;

import java.util.*;

public class Lt01_EstRep35{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N1, N2, Maior, Menor, N, Soma;
        Soma = 0;
        
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
        
        if((Maior % 2) == 0){
            if((Menor % 2) == 0){
                for(N = Menor + 1; N <= Maior - 1; N = N + 2){              //ambos pares
                    Soma = Soma + N;
                }
            }else{
                for(N = Menor + 2; N <= Maior - 1; N = N + 2){              //maior par e menor ímpar
                    Soma = Soma + N;
                }
            }
        }else{
            if((Menor % 2) == 0){
                for(N = Menor + 1; N <= Maior - 2; N = N + 2){              //maior ímpar e menor par
                    Soma = Soma + N;
                }
            }else{
                for(N = Menor + 2; N <= Maior - 2; N = N + 2){              //ambos ímpares
                    Soma = Soma + N;
                }
            }
        }
        
        System.out.println("\nA somatória dos números ímpares entre " + Menor + " e " + Maior + " é igual a: \n" + Soma);
    }
}