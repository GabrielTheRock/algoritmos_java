/*Objetivo: receber o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcular e mostrar a velocidade média em km/h.
Programador: Gabriel Rocha
Data: 01/07/2019
*/

package Procedimentos;

import java.util.*;

public class Lt01_EstDec27{
    
    static float Voltas, Ext, T, Vm;
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o número de voltas do circuito:");
        Voltas = input.nextInt();
        
        System.out.println("Digite, em METROS, a extensão do circuito:");
        Ext = input.nextFloat();
        
        System.out.println("Digite, em MINUTOS, o tempo de duração do circuito:");
        T = input.nextFloat();
        
        Calcula_Vm();
    }
    
    public static void Calcula_Vm(){
        
        Vm = (float) (Voltas * (Ext / 1000)) / (T / 60);
        
        System.out.println("A velocidade média neste circuito foi de " + Vm + " Km/h");
    }
}

