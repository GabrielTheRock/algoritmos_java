/*Objetivo: criar e carregar uma matriz segundo:
Casa    1|2|3|4...64     Exibir a soma dos valores também
Valor   1|2|4|8
*/

package Matrizes;

public class Matrizes_10{
    
    public static void main(String[] args){
        
        double[][] Mat = new double[8][8];
        
        int I, J, Exp = -1;
        double Total = 0;
        
        for(I = 0; I <= 7; I++){
            for(J = 0; J <= 7; J++){
                Exp++;
                Mat[I][J] = Math.pow(2, Exp);
                Total = Total + Mat[I][J];
                System.out.println("Matriz [" + I + "][" + J + "] = " + Mat[I][J]);
            }
        }
        
        System.out.println("\nSoma dos valores desta matriz = " + Total);
    }
}

