/*Objetivo: receber 2 catetos de um triângulo retângulo. Calcular e mostrar o valor da hipotenusa
Programador: Gabriel Rocha
Data: 20/06/2019
*/

package Lt01_EstSeq;

import java.util.*;

public class Lt01_EstSeq15{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int C1, C2;
        
        double Hip;
        
        System.out.println("Digite o valor de um cateto: ");
        C1 = input.nextInt();
        
        System.out.println("Digite o valor do outro cateto: ");
        C2 = input.nextInt();
        
        Hip = Math.sqrt(Math.pow(C1, 2) + Math.pow(C2, 2));
        
        System.out.println("Hipotenusa = " + Hip);
    }
}