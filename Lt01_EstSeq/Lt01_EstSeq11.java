/*Objetivo: receber o raio de uma circunferência. Calcular e mostrar seu comprimento.
Programador: Gabriel Rocha
Data: 20/06/2019
*/

package Lt01_EstSeq;

import java.util.*;

public class Lt01_EstSeq11{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int R, C;
        
        System.out.println("Digite o raio de uma circunferência: ");
        R = input.nextInt();
        
        C = 2 * R;
        
        System.out.println("Comprimento = " + C + "π");
    }
}