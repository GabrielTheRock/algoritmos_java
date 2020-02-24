/*Objetivo: receber a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.
Programador: Gabriel Rocha
Data: 01/07/2019
*/

package Procedimentos;

import java.util.*;

public class Lt01_EstDec25{
    
    static int Hi, Mi, Hf, Mf, Th, Tm;
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a hora de início do jogo: ");
        Hi = input.nextInt();
        
        System.out.println("Digite o minuto de início do jogo: ");
        Mi = input.nextInt();
        
        System.out.println("Digite a hora do fim do jogo: ");
        Hf = input.nextInt();
        
        System.out.println("Digite o minuto do fim do jogo: ");
        Mf = input.nextInt();
        
        if(Hf > Hi){
            Hora_Maior();
        }else{
            if(Hf == Hi){
                Hora_Igual();
            }else{
                Hora_Menor();
            }
        }
        
        if(Th != 0){
            if (Tm != 0){
                System.out.println("\nO jogo durou " + Th + " horas e " + Tm + " minutos!");
            }else{
                System.out.println("\nO jogo durou " + Th + " horas");
            }
        }else{
            if (Tm != 0){
                System.out.println("\nO jogo durou " + Tm + " minutos!");
            }else{
                System.out.println("\nEste jogo NÃO existiu!");
            }
        }
    }
    
    public static void Hora_Maior(){
        if (Mf > Mi){                   //hora maior e minuto maior
            Th = Hf - Hi;
            Tm = Mf - Mi;
        }else{
            if (Mf == Mi){              //hora maior e minuto igual
                Th = Hf - Hi;
                Tm = 0;
            }else{                      //hora maior e minuto menor
                Th = Hf - Hi - 1;       
                Tm = (Mf + 60) - Mi;
            }
        }        
    }
    
    public static void Hora_Igual(){
        if (Mf > Mi){               //hora igual e minuto maior
            Th = 0;
            Tm = Mf - Mi;
        }else{
            if (Mf == Mi){          //hora igual e minuto igual
                Th = 0;
                Tm = 0;
            }else{                  //hora igual e minuto menor
                Th = 23;
                Tm = (60 + Mf) - Mi;
            }
        }        
    }
    
    public static void Hora_Menor(){
        if (Mf > Mi){               //hora menor e minuto maior
            Th = Hf + (24 - Hi);
            Tm = Mf - Mi;
        }else{
            if (Mf == Mi){          //hora menor e minuto igual
                Th = Hf + (24 - Hi);
                Tm = 0;
            }else{                  //hora menor e minuto menor
                Th = Hf + (23 - Hi);
                Tm = (60 + Mf) - Mi;
            }
        }
    }
}