/*Objetivo: receber o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcular e mostrar o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
Programador: Gabriel Rocha
Data: 28/06/2019
*/

package Lt01_EstDec;

import java.util.*;

public class Lt01_EstDec29{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int Tipo;
        double V, Vf;
        
        System.out.println("Selecione o tipo de investimento:\nDigite 1 para poupança\nDigite 2 para renda fixa");
        Tipo = input.nextInt();
        
        System.out.println("\nDigite o valor do investimento:");
        V = input.nextFloat();
        
        if (Tipo == 1){
            Vf = (float) V * 1.03;
            
            System.out.println("\nEm 1 mês, haverá R$ " + Vf + " em sua conta");
        }else{
            if (Tipo == 2){
                Vf = (float) V * 1.05;
                
                System.out.println("\nEm 1 mês, haverá R$ " + Vf + " em sua conta");
            }else{
                System.out.println("\nTipo de investimento inválido!");
            }
        }
    }
}
