/*Objetivo: calcular e mostrar quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
Programador: Gabriel Rocha
Data: 02/07/2019
*/

package Funções;

public class Lt01_EstRep43{
    
    public static void main(String[] args){
        
        int AltAna = 110, AltMaria = 150, Anos = 0;
        
        Anos = Altura(AltAna, AltMaria);
        
        System.out.print("Em " + Anos + " anos, a altura de Ana será maior que a de Maria\n");
    }
    
    public static int Altura(int Ana, int Maria){
        
        int Tempo = 0;
        
        while(Ana <= Maria){
            Tempo++;
            Ana = (110 + (3 * Tempo));
            Maria = (150 + (2 * Tempo));
        }
        
        return Tempo;
    }
}