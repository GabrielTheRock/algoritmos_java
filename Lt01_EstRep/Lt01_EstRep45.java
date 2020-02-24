/*Objetivo: Calcular e mostrar a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
Programador: Gabriel Rocha
Data: 30/06/2019
*/

package Lt01_EstRep;

public class Lt01_EstRep45{
    
    public static void main(String[] args){
        
        int Num, Den, Resto;
        double N, Total = 0;
        
        for(Num = 1; Num <= 15; Num++){
            Den = Num * Num;
            Resto = Num % 2;
            if(Resto == 0){
                N = - Num / (double)Den;
                System.out.println("- " + Num + "/" + Den + " = " + N);
                Total = Total + N;
            }else{
                N = Num / (double)Den;
                System.out.println("+ " + Num + "/" + Den + " = " + N);
                Total = Total + N;
            }
        }
        
        System.out.println("\nSoma desta sequência = " + Total);
    }
}