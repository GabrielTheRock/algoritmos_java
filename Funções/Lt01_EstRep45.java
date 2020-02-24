/*Objetivo: Calcular e mostrar a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
Programador: Gabriel Rocha
Data: 01/07/2019
*/

package Funções;

public class Lt01_EstRep45{
    
    public static void main(String[] args){
        
        int Num, Den;
        double N, Soma = 0;
        
        for(Num = 1; Num <= 15; Num++){
            Den = Num * Num;
            N = Calcula_Sequencia(Num);
            Soma = Soma + N;
            if(Num % 2 == 0){
                System.out.println("- " + Num + "/" + Den + " = " + N);
            }else{
                System.out.println("+ " + Num + "/" + Den + " = " + N);
            }
        }
        
        System.out.println("\nSoma desta sequência = " + Soma);
    }
    
    public static double Calcula_Sequencia(int Num1){
        
        if(Num1 % 2 == 0){
            return -(double)Num1 / (Num1 * Num1); 
        }else{
            return (double)Num1 / (Num1 * Num1); 
        }
    }
}