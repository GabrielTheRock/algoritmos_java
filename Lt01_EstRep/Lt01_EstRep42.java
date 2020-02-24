/*Objetivo: calcular e mostrar a série 1 + 2/3 + 3/5 + ... + 50/99
Programador: Gabriel Rocha
Data: 29/06/2019
*/

package Lt01_EstRep;

public class Lt01_EstRep42{
    
    public static void main(String[] args){
        
        int Num, Den = -1;
        double Soma = 0, N;
        
        for(Num = 1; Num <= 50; Num++){
            Den = Den + 2;
            N = (double)Num / Den;
            System.out.println("" + Num + "/" + Den + " = " + N);
            Soma = Soma + N;
        }
        
        System.out.println("\nSoma desta sequência = " + Soma);
    }
}