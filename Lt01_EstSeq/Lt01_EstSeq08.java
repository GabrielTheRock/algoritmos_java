/*Objetivo: receber o valor de um depósito em poupança. Calcular e mostrar quanto haverá na conta após 1 mês, sendo 1,3% ao mês
Programador: Gabriel Rocha
Data: 20/06/2019
*/

package Lt01_EstSeq;

import java.util.*;

public class Lt01_EstSeq08{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int Vi;
        float Vf;
        
        System.out.println("Digite o valor do depósito: ");
        Vi = input.nextInt();
        
        Vf =(float) 1.013 * Vi;
        
        System.out.println("Após 1 mês, haverá R$ " + Vf + " na sua poupança");
    }
}