/*Objetivo: receber um número inteiro. Calcular e mostrar seu fatorial
Programador: Gabriel Rocha
Data: 29/06/2019
*/

package Lt01_EstRep;

import java.util.*;

public class Lt01_EstRep32{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N, Cont;
        double Fat;
        
        System.out.println("Digite um número:");
        N = input.nextInt();
        
        Fat = 1;
        
        for(Cont = N; Cont >= 1; Cont--){
            Fat = (Fat * Cont);
        }
        
        System.out.println("\n" + N + "! = " + Fat);
    }
}
