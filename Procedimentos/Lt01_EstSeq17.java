/*Objetivo: calcular a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
Programador: Gabriel Rocha
Data: 30/06/2019
*/

package Procedimentos;

import java.util.*;

public class Lt01_EstSeq17{
    
    static int T, Vm;
    static double Litros;
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o tempo de viagem, em HORAS:");
        T = input.nextInt();
        
        System.out.println("Digite a velocidade média durante a viagem, em Km/h:");
        Vm = input.nextInt();
        
        Calcula_Litros();
    }
    
    public static void Calcula_Litros(){
        
        Litros = ((double)Vm * T) / 12;
        
        System.out.println("\nForam gastos " + Litros + " litros de gasolina nesta viagem!");
    }
}