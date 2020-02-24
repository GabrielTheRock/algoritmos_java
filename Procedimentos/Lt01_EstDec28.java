/*Objetivo: receber o preço atual e a média mensal de um produto. Calcular e mostrar o novo preço sabendo que:
Venda Mensal                    Preço Atual                 Preço Novo
< 500                               < 30                       + 10%
>= 500 e < 1000                  >= 30 e < 80                  +15%
>= 1000                             >= 80                      - 5%
Obs.: para outras condições, preço novo será igual ao preço atual.
Programador: Gabriel Rocha
Data:01/07/2019
*/

package Procedimentos;

import java.util.*;

public class Lt01_EstDec28{
    
    static double Pat, Med, Pno;
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o preço atual do produto:");
        Pat = input.nextInt();
        
        System.out.println("Digite a média mensal do produto:");
        Med = input.nextInt();
        
        Calcula_Novo_Preco();
        
        if (Pno == Pat){
            System.out.println("\nO preço atual do produto não será alterado! Continuará em R$ " + Pat);
        }else{
            System.out.println("\nO novo preço do produto será de R$ " + Pno);
        }
    }
    
    public static void Calcula_Novo_Preco(){
        
        if (Med < 500 && Pat < 30){
            Pno = Pat * 1.1;
        }else{
            if (Med >= 500 && Med < 1000 && Pat >= 30 && Pat < 80){
                Pno = Pat * 1.15;
            }else{
                if (Med >= 1000 && Pat >= 80){
                    Pno = Pat * 0.95;
                }else{
                    Pno = Pat;
                }
            }
        }
    }
}