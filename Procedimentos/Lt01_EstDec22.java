/*Objetivo: receber 2 valores inteiros e diferentes. Mostrá-los em ordem crescente.
Programador: Gabriel Rocha
Data: 01/07/2019
*/

package Procedimentos;

import java.util.*;

public class Lt01_EstDec22{
    
    static int V1, V2;
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        V1 = input.nextInt();
        
        System.out.println("Digite outro número inteiro:");
        V2 = input.nextInt();
        
        Mostra_Crescente();
    }
    
    public static void Mostra_Crescente(){
        
        if (V1 > V2){
            System.out.println("\n" + V2 + " < " + V1);
        }else{
            System.out.println("\n" + V1 + " < " + V2);
        }
    }
}