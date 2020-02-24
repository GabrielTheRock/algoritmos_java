/*Objetivo: receber 2 valores inteiros. Calcular e mostrar a diferença entre o maior e o menor valor
Programador: Gabriel Rocha
Data: 27/06/2019
*/

package Lt01_EstDec;

import java.util.*;

public class Lt01_EstDec18{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int N1, N2, Dif;
        
        System.out.println("Digite um número inteiro:");
        N1 = input.nextInt();
        
        System.out.println("Digite outro número inteiro:");
        N2 = input.nextInt();
        
        if (N1 > N2){
            Dif = N1 - N2;
            System.out.println("" + N1 + " - " + N2 + " = " + Dif);
        }else{
            Dif = N2 - N1;
            System.out.println("" + N2 + " - " + N1 + " = " + Dif);
        }
    }
}