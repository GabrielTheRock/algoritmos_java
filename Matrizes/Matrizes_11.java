/*Objetivo: criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
| 1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 |
| 1 | 2 | 2 | 2 | 2 | 2 | 2 | 1 |
| 1 | 2 | 3 | 3 | 3 | 3 | 2 | 1 |
| 1 | 2 | 3 | 4 | 4 | 3 | 2 | 1 |
| 1 | 2 | 3 | 4 | 4 | 3 | 2 | 1 |
| 1 | 2 | 3 | 3 | 3 | 3 | 2 | 1 |
| 1 | 2 | 2 | 2 | 2 | 2 | 2 | 1 |
| 1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 |
Programador: Gabriel Rocha
Data: 11/07/2019
*/

package Matrizes;

public class Matrizes_11{
    
    public static void main(String[] args){
        
        int[][] Mat = new int [8][8];
        
        int I, J, K;
        
        for(K = 0; K <= 3; K++){
            for(I = K; I <= 7 - K ; I++){
                for(J = K; J <= 7 - K ; J++){
                    Mat[I][J] = K + 1;
                }
            }
        }
        
        for(I = 0; I <= 7; I++){
                System.out.println(Mat[I][0] + " " + Mat[I][1] + " " + Mat[I][2] + " " + Mat[I][3] + " " + Mat[I][4] + " " + Mat[I][5] + " " + Mat[I][6] + " " + Mat[I][7]);
        }
    }
}