/*Objetivo: receber um número. Calcular e mostrar sua tabuada.
Programador: Gabriel Rocha
Data: 29/06/2019
*/

package Lt01_EstRep;

import java.util.*;

public class Lt01_EstRep34{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N, T, Tab;
        
        System.out.println("Digite um número:");
        N = input.nextInt();
        System.out.println("\n");
        
        for(T = 1; T <= 10; T++){
            Tab = N * T;
            System.out.println("" + N + " x " + T + " = " + Tab);
        }
    }
}