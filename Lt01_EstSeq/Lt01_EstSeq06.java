/*Objetivo: receber valores em X e Y. Efetuar a troca de seus valores e mostrá-los
Programador: Gabriel Rocha
Data: 19/06/2019
*/

package Lt01_EstSeq;

import java.util.*;

public class Lt01_EstSeq06{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int X, Y, Aux;
        
        System.out.println("Digite o valor de X: ");
        X = input.nextInt();
        
        System.out.println("Digite o valor de Y: ");
        Y = input.nextInt();
        
        Aux = X;
        X = Y;
        Y = Aux;
        
        System.out.println("Agora, X = " + X + " e Y = " + Y);
    }
}