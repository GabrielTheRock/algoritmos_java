/*Objetivo: receber 2 números inteiros. Calcular e mostrar a soma de seus quadrados
Programador: Gabriel Rocha
Data: 20/06/2019
*/

package Lt01_EstSeq;

import java.util.*;

public class Lt01_EstSeq09{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N1, N2;
        double Soma;
        
        System.out.println("Digite um número: ");
        N1 = input.nextInt();
        
        System.out.println("Digite outro número: ");
        N2 = input.nextInt();
        
        Soma = Math.pow(N1, 2) + Math.pow(N2, 2);
        
        System.out.println("" + N1 + "² + " + N2 + "² = " + Soma);
    }
}
