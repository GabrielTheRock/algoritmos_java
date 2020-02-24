/*Objetivo: receber a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
Programador: Gabriel Rocha
Data: 30/06/2019
*/

package Procedimentos;

import java.util.*;

public class Lt01_EstSeq16{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int H, Vh, Des, Desce;

        System.out.println("Digite o número de horas trabalhadas:");
        H = input.nextInt();
        
        System.out.println("Digite o valor da hora trabalhada:");
        Vh = input.nextInt();
        
        System.out.println("Digite o percentual de desconto:");
        Des = input.nextInt();
        
        System.out.println("Digite o número de descendentes:");
        Desce = input.nextInt();
        
        Calc_Salario(H, Vh, Des, Desce);
    }
    
    public static void Calc_Salario(int H, int Vh, int Des, int Desce){
        
        double Sal;
        
        Sal = (H * Vh) * ((100 - (double)Des) / 100) + 100 * Desce;
        
        System.out.println("\nO salário a ser recebido é de R$ " + Sal);
    }
}