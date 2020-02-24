/*Objetivo: receber 2 ângulos de um triângulo. Calcular e mostrar o valor do 3° ângulo
Programador: Gabriel Rocha
Data: 20/06/2019
*/

package Lt01_EstSeq;

import java.util.*;

public class Lt01_EstSeq14{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int A1, A2, A3;
        
        System.out.println("Digite o valor do 1° ângulo: ");
        A1 = input.nextInt();
        
        System.out.println("Digite o valor do 2° ângulo: ");
        A2 = input.nextInt();
        
        A3 = 180 - A1 - A2;
        
        System.out.println("O 3° ângulo deste triângulo vale " + A3 + "º");
    }
}