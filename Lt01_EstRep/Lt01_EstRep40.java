/*Objetivo: receber 2 números inteiros diferentes. Verificar e mostrar todos os números primos entre eles.
Programador: Gabriel Rocha
Data: 29/06/2019
*/

package Lt01_EstRep;

import java.util.*;

public class Lt01_EstRep40{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N1, N2, Maior, Menor, N, Den, Resto, Cont = 0;
        
        System.out.println("Digite um número inteiro:");
        N1 = input.nextInt();
        
        System.out.println("Digite outro inteiro:");
        N2 = input.nextInt();
        
        if(N1 > N2){
            Maior = N1;
            Menor = N2;
        }else{
            Maior = N2;
            Menor = N1;
        }
        
        System.out.println("\nNúmeros primos entre " + Menor + " e " + Maior + ":\n");
        
        for(N = Menor + 1; N <= Maior - 1; N++){
            for(Den = 1; Den <= (N - 1); Den++){
                Resto = N % Den;
                if(Resto == 0){
                    Cont++;
                }
            }if(Cont == 1 && N != 1){
                System.out.println(N);
                Cont = 0;
            }else{
                Cont = 0;
            }
        }
    }
}