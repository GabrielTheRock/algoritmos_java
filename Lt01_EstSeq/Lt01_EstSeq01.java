/*Objetivo: coletar os lados de um quadrado. Calcular e mostrar sua área
Programador: Gabriel Rocha
Data: 18/06/2019
*/

package Lt01_EstSeq;

import java.util.*;

public class Lt01_EstSeq01{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int Lado, Area;
        
        System.out.print("Digite o valor do lado do quadrado: ");
        Lado = input.nextInt();
        
        Area = (Lado * Lado);
        
        System.out.println("Área do quadrado = " + Area);
    }
}
        