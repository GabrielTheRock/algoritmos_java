/*Objetivo: receber o número da base e o expoente. Calcular a potência.
Programador: Gabriel Rocha
Data: 02/07/2019
*/

package Funções;

import java.util.*;

public class Lt01_EstRep44{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int Base, Exp;
        double Pot;
        
        System.out.println("Digite o número da base:");
        Base = input.nextInt();
        
        System.out.println("Digite o número do expoente:");
        Exp = input.nextInt();
        
        Pot = Calcula_Potencia(Base, Exp);
        
        System.out.println("\n" + Base + " ^ " + Exp + " = " + Pot);
    }
    
    public static double Calcula_Potencia(int B, int E){
        
        double P = 1;
        
        for(int Cont = 1; Cont <= E; Cont++){
            P = P * B;
        }
        
        return P;
    }
}

