/*Objetivo: calcular a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
Programador: Gabriel Rocha
Data: 21/06/2019
*/

package Lt01_EstSeq;

import java.util.*;

public class Lt01_EstSeq17{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int T, Vm;
        double L;
        
        System.out.println("Digite o tempo de viagem, em horas:");
        T = input.nextInt();
        
        System.out.println("Digite a velocidade média da viagem, em Km/h:");
        Vm = input.nextInt();
        
        L = (Vm * T) / 12;
        
        System.out.println("Você gastou " + L + " litros de gasolina nesta viagem!");
    }
}