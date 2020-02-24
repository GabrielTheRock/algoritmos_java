/*Objetivo: calcular e mostrar o quadrado dos números entre 10 e 150
Programador: Gabriel Rocha
Data: 01/07/2019
*/

package Funções;

public class Lt01_EstRep31{
    
    public static void main(String[] args){
        
        int N;
        double Qua;
        
        for(N = 10; N <= 150; N++){
            Qua = Calcula_Quadrados(N);
            System.out.println(Qua);
        }
    }
    
    public static double Calcula_Quadrados(int N1){
        
        double Q;
        
        Q = Math.pow(N1, 2);
        
        return Q;
    }
}