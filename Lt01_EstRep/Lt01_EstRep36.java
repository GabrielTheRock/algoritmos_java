/*Objetivo: receber um número N. Calcular e mostrar a série 1 + 1/1! + 1/2! + ... + 1/N!
Programador: Gabriel Rocha
Data: 29/06/2019
*/

package Lt01_EstRep;

import java.util.*;

public class Lt01_EstRep36{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N, Cont, Aux;
        double Soma = 1, Fat, Num;
        
        System.out.println("Digite um número inteiro:");
        N = input.nextInt();
        System.out.println("\n1    = 1.0\n");
        
        for(Cont = 1; Cont <= N; Cont++){
            Fat = Cont;
            for(Aux = Cont - 1; Aux >= 1; Aux--){
                Fat = Fat * Aux;
            }
            Num = 1 / Fat;
            System.out.println("1/" + Cont + "! = " + Num + "\n");
            Soma = Soma + Num;
        }
        
        System.out.println("\nSoma da sequência = " + Soma);
    }
}