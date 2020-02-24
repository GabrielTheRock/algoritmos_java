/*Objetivo: receber a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
Programador: Gabriel Rocha
Data: 21/06/2019
*/

package Lt01_EstSeq;

import java.util.*;

public class Lt01_EstSeq16{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int H, Vh, Desce;
        double Sal, Des;
        
        System.out.println("Digite a quantidade de horas trabalhadas:");
        H = input.nextInt();
        
        System.out.println("Digite o valor por hora:");
        Vh = input.nextInt();
        
        System.out.println("Digite o percentual de desconto:");
        Des = input.nextInt();
        
        System.out.println("Digite o número de descendentes:");
        Desce = input.nextInt();
        
        Sal = ((H * Vh) + (Desce * 100)) * ((100 - Des) / 100);
        
        System.out.println("Seu salário líquido será de R$ " + Sal);
    }
}