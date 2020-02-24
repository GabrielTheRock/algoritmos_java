/*Objetivo: receber a quantidade de alimento em quilos. Calcular e mostrar quantos dias durará esse alimento, sabendo que a pessoa consome 50g ao dia
Programador: Gabriel Rocha
Data: 20/06/2019
*/

package Lt01_EstSeq;

import java.util.*;

public class Lt01_EstSeq13{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double Q, Dias;
        
        System.out.println("Digite a quantidade de alimento [Kg]: ");
        Q = input.nextInt();
        
        Dias = (Q * 20);
        
        System.out.println("Esta comida durará " + Dias + " dias");
    }
}