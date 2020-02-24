/*Objetivo: Receber o salário de um funcionário e mostrá-lo com 15% de reajuste
Programador: Gabriel Rocha
Data: 19/06/2019
*/

package Lt01_EstSeq;

import java.util.*;

public class Lt01_EstSeq02{
    
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int Sal1;
        float Sal2;
        
        System.out.print("Digite o salário atual: ");
        Sal1 = input.nextInt();
        
        Sal2 = (float) (Sal1 * 1.15);
        
        System.out.println("Com 15% de reajuste, seu salário será de R$ " + Sal2);
    }
}