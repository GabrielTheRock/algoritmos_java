/*Objetivo: receber 2 valores reais. Calcular e mostrar o maior deles.
Programador: Gabriel Rocha
Data: 30/06/2019
*/

package Procedimentos;

import java.util.*;

public class Lt01_EstDec19{
    
    static double V1, V2;
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um valor real:");
        V1 = input.nextDouble();
        
        System.out.println("Digite outro valor real:");
        V2 = input.nextDouble();
        
        Maior_Valor();
    }
    
    public static void Maior_Valor(){
        
        if(V1 > V2){
            System.out.println("\nMaior valor: " + V1);
        }else{
            System.out.println("\nMaior valor: " + V2);
        }
    }
}