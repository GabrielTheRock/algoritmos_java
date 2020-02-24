/*Objetivo: ciketar a base e altura de um triângulo. Calcular e mostrar sua área
Programador: Gabriel Rocha
Data: 19/06/2019
*/

package Lt01_EstSeq;

import java.util.*;

public class Lt01_EstSeq03{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int Base, Alt, Area;
        
        System.out.print("Digite o valor da base do triângulo: ");
        Base = input.nextInt();
        
        System.out.print("Digite o valor da altura do triângulo: ");
        Alt = input.nextInt();
        
        Area = (Base * Alt) / 2;
        
        System.out.println("Área do triângulo = " + Area);
    }
}