/*Objetivo: calcular e mostrar quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
Programador: Gabriel Rocha
Data: 29/06/2019
*/

package Lt01_EstRep;

public class Lt01_EstRep43{
    
    public static void main(String[] args){
        
        int AltAna = 110, AltMaria = 150, Anos = 0;
        
        while(AltAna <= AltMaria){
            Anos++;
            AltAna = (110 + (3 * Anos));
            AltMaria = (150 + (2 * Anos));
        }
        
        System.out.print("Em " + Anos + " anos, a altura de Ana será maior que a de Maria\n");
    }
}