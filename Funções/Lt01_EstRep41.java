/*Objetivo: mostrar todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7
Programador: Gabriel Rocha
Data: 02/07/2019
*/

package Funções;

public class Lt01_EstRep41{
    
    public static void main(String[] args){
        
        int D1, D2, Dado;
        
        System.out.println("Todas as possibilidades de 2 dados darem soma 7:\n");
        
        for(D1 = 1; D1 <= 6; D1++){
                D2 = Verifica_7(D1);
                if(D2 != -1){
                    System.out.println("" + D1 + " e " + D2);
                }
        }
    }
    
    public static int Verifica_7(int N1){
        
        int N2;
        
        for(N2 = 1; N2 <= 6; N2++){
            if(N1 + N2 == 7){
                return N2;
            }
        }
        
        return -1;
    }
}
