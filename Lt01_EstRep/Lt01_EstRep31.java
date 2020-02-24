/*Objetivo: calcular e mostrar o quadrado dos números entre 10 e 150
Programador: Gabriel Rocha
Data: 29/06/2019
*/

package Lt01_EstRep;

public class Lt01_EstRep31{
    
    public static void main(String[] args){
        
        int N;
        double Q;
        
        for(N = 10; N <= 150; N++){
            Q = Math.pow(N, 2);
            System.out.println(Q);
        }
    }
}
