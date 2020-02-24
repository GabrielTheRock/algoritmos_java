/*Objetivo: receber um número. Calcular e mostrar sua tabuada.
Programador: Gabriel Rocha
Data: 02/07/2019
*/

package Funções;

import java.util.*;

public class Lt01_EstRep34{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N, T, Tab;
        
        System.out.println("Digite um número:");
        N = input.nextInt();
        System.out.println("\n");
        
        for(T = 1; T <= 10; T++){
            Tab = Tabuada(N, T);
            System.out.println("" + N + " x " + T + " = " + Tab);
        }
    }
    
    public static int Tabuada(int N1, int T1){
        
        return N1 * T1;
    }
}
