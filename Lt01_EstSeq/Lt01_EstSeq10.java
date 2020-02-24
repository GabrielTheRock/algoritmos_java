/*Objetivo: receber 2 números reais. Calcular e mostrar a diferença entre esses números
Programador: Gabriel Rocha
Data: 20/06/2019
*/

package Lt01_EstSeq;

import java.util.*;

public class Lt01_EstSeq10{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double N1, N2, Dif;
        
        System.out.println("Digite o valor de um número: ");
        N1 = input.nextInt();
        
        System.out.println("Digite o valor de outro número: ");
        N2 = input.nextInt();
        
        Dif = N1 - N2;
        
        System.out.println("" + N1 + " - " + N2 + " = " + Dif);
    }
}