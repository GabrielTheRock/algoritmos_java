/*Objetivo: mostrar todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7
Programador: Gabriel Rocha
Data: 29/06/2019
*/

package Lt01_EstRep;

public class Lt01_EstRep41{
    
    public static void main(String[] args){
        
        int D1, D2;
        
        System.out.println("Todas as possibilidades de 2 dados darem soma 7:\n");
        
        for(D1 = 1; D1 <= 6; D1++){
            for(D2 = 1; D2 <= 6; D2++){
                if((D1 + D2) == 7){
                    System.out.println("" + D1 + " e " + D2);
                }
            }
        }
    }
}
