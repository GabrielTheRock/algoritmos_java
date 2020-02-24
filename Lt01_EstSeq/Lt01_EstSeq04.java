/*Objetivo: receber uma temperatura em ºC e convertê-la para ºF
Programador: Gabriel Rocha
Data: 19/06/2019
*/

package Lt01_EstSeq;

import java.util.*;

public class Lt01_EstSeq04{
    
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double C, F;
        
        System.out.print("Digite a temperatura em ºC: ");
        C = input.nextDouble();
        
        F = ((9 * C) +160) /5;
        
        System.out.println("" + C + " ºC = " +F + " °F");
    }
}