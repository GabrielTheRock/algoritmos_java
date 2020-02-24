/*Objetivo: receber o número da base e o expoente. Calcular a potência.
Programador: Gabriel Rocha
Data: 29/06/2019
*/

package Lt01_EstRep;

import java.util.*;

public class Lt01_EstRep44{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int Base, Exp, Cont;
        double Pot = 1;
        
        System.out.println("Digite o número da base:");
        Base = input.nextInt();
        
        System.out.println("Digite o número do expoente:");
        Exp = input.nextInt();
        
        for(Cont = 1; Cont <= Exp; Cont++){
            Pot = Pot * Base;
        }
        
        System.out.println("\n" + Base + " ^ " + Exp + " = " + Pot);
    }
}