/*Objetivo: criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a diagonal principal terá seus dados carregados no programa segundo:
|1| |  |  |
| |4|  |  |
| | |16|  |
| | |  |64|
Programador: Gabriel Rocha
Data: 11/07/2019
*/

package Matrizes;

import java.util.*;

public class Matrizes_09{
    
    public static void main(String[] args){
        
        Random R = new Random();
        
        int[][] Mat = new int[4][4];
        
        int I, J, Exp = -1;
        
        for(I = 0; I <= 3; I++){
            for(J = 0; J <= 3; J++){
                if(I == J){
                    Exp++;
                    Mat[I][J] = (int)Math.pow(4, Exp);
                }else{
                    Mat[I][J] = R.nextInt(100);
                }
            }
        }
        
        System.out.println(Mat[0][0] + " " + Mat[0][1] + " " + Mat[0][2] + " " + Mat[0][3]);
        System.out.println(Mat[1][0] + " " + Mat[1][1] + " " + Mat[1][2] + " " + Mat[1][3]);
        System.out.println(Mat[2][0] + " " + Mat[2][1] + " " + Mat[2][2] + " " + Mat[2][3]);
        System.out.println(Mat[3][0] + " " + Mat[3][1] + " " + Mat[3][2] + " " + Mat[3][3]);
    }
}
