/*Objetivo: receber 4 notas bimestrais de um aluno. Calcular e mostrar a média aritmética segundo:
a. Se a média for >= 6,0 exibir “APROVADO”;
b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c. Se a média for < 3,0 exibir “RETIDO”.
Programador: Gabriel Rocha
Data: 30/06/2019
*/

package Procedimentos;

import java.util.*;

public class Lt01_EstDec21{
    
    static double N1, N2, N3, N4, Media;
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite sua primeira nota:");
        N1 = input.nextDouble();
        
        System.out.println("Digite sua segunda nota:");
        N2 = input.nextDouble();
        
        System.out.println("Digite sua terceira nota:");
        N3 = input.nextDouble();
        
        System.out.println("Digite sua quarta nota:");
        N4 = input.nextDouble();
        
        Calcula_Media();
    }
    
    public static void Calcula_Media(){
        
        Media = (N1 + N2 + N3 + N4) / 4;
        
        if (Media >= 6){
            System.out.println("\nVocê está APROVADO com média " + Media);
        }else{
            if (Media >= 3){
                System.out.println("\nVocê está de EXAME com média " + Media);
            }else{
                System.out.println("\nVocê está RETIDO com média " + Media);
            }
        }
    }
}