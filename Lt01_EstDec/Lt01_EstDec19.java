/*Objetivo: receber 2 valores reais. Calcular e mostrar o maior deles.
Programador: Gabriel Rocha
Data: 27/06/2019
*/

package Lt01_EstDec;

import java.util.*;

public class Lt01_EstDec19{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double N1, N2;
        
        System.out.println("Digite um número real:");
        N1 = input.nextDouble();
        
        System.out.println("Digite outro número real:");
        N2 = input.nextDouble();
        
        if (N1 > N2){
            System.out.println("\nMaior número digitado: " + N1);
        }else{
            System.out.println("\nMaior número digitado: " + N2);
        }
    }
}
