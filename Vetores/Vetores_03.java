/*Objetivo: criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
VT1 |1|2|3|     VT2|4|5|6|      VT3|1|2|3|4|5|6|
Programador: Gabriel Rocha
Data: 05/07/2019
*/

package Vetores;

import java.util.*;

public class Vetores_03{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int[] Vt1 = new int[3];
        int[] Vt2 = new int[3];
        int[] Vt3 = new int[6];
        int I;
        
        for(I = 0; I <= 5; I++){
            if(I <= 2){
                System.out.print("VT1 [" + I + "] = ");
                Vt1[I] = input.nextInt();
                Vt3[I] = Vt1[I];
            }else{
                System.out.print("VT2 [" + (I - 3) + "] = ");
                Vt2[I - 3] = input.nextInt();
                Vt3[I] = Vt2[I - 3];
            }
        }
        
        System.out.print("\n");
        
        for(I = 0; I <= 5; I++){
            System.out.println("VT3 [" + I + "] = " + Vt3[I]);
        }
        
    }
}