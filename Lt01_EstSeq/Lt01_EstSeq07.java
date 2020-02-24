/*Objetivo: receber o comprimento, largura e altura de um paralelepípedo. Calcular e mostrar sua área
Programador: Gabriel Rocha
Data: 20/06/2019
*/

package Lt01_EstSeq;

import java.util.*;

public class Lt01_EstSeq07{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int C, Lar, Alt, Area;
        
        System.out.println("Digite o comprimento: ");
        C = input.nextInt();
        
        System.out.println("Digite a largura: ");
        Lar = input.nextInt();
        
        System.out.println("Digite a altura: ");
        Alt = input.nextInt();
        
        Area = C * Lar * Alt;
        
        System.out.println("Área do paralelepípedo = " + Area);
    }
}