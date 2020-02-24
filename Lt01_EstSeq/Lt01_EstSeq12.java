/*Objetivo: receber o ano de nascimento e o ano atual. Calcular e mostrar sua idade e quantos anos terá daqui a 17 anos
Programador: Gabriel Rocha
Data: 20/06/2019
*/

package Lt01_EstSeq;

import java.util.*;

public class Lt01_EstSeq12{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int Ano_Nas, Ano_At, Id, Id17;
        
        System.out.println("Digite o ano atual: ");
        Ano_At = input.nextInt();
        
        System.out.println("Digite o ano de nascimento: ");
        Ano_Nas = input.nextInt();
        
        Id = Ano_At - Ano_Nas;
        Id17 = Id + 17;
        
        System.out.println("Você tem " + Id + " anos! \nDaqui a 17 anos, você terá " + Id17 + "!");
    }
}
