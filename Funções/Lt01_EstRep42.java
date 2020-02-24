/*Objetivo: calcular e mostrar a série 1 + 2/3 + 3/5 + ... + 50/99
Programador: Gabriel Rocha
Data: 02/07/2019
*/

package Funções;

public class Lt01_EstRep42{
    
    public static void main(String[] args){
        
        int Num, Den = -1;
        double N, Total = 0;
        
        for(Num = 1; Num <= 50; Num++){
            Den = Den + 2;
            N = Sequencia(Num, Den);
            System.out.println("" + Num + "/" + Den + " = " + N);
            Total = Total + N;
        }
        
        System.out.println("\nSoma desta sequência = " + Total);
    }
    
    public static double Sequencia(int N1, int D1){
        
        double Num = (double)N1 / D1;
        
        return Num;
    }
}