/*Objetivo: receber a data atual e a data do nascimento de uma pessoa. Calcular e mostrar a sua idade atual em anos, meses e dias, considerando os anos bissextos.
Programador: Gabriel Rocha
Data: 03/08/2019
*/

package Lt01_30;

import java.util.Scanner;

public class Lt01_30_Dias {
    
    static int Dia_At, Mes_At, Ano_At, Dia_Nas, Mes_Nas, Ano_Nas, Dias = 0, Meses = 0, Anos = 0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o dia atual: ");
        Dia_At = input.nextInt();
        System.out.print("Digite o mês atual: ");
        Mes_At = input.nextInt();
        System.out.print("Digite o ano atual: ");
        Ano_At = input.nextInt();
        System.out.print("\nDigite o dia de seu nascimento: ");
        Dia_Nas = input.nextInt();
        System.out.print("Digite o mês de seu nascimento: ");
        Mes_Nas = input.nextInt(); 
        System.out.print("Digite o ano de seu nascimento: ");
        Ano_Nas = input.nextInt();        
        if(Ano_At > Ano_Nas) {
            Calcula_Normal();
        }else if(Ano_At == Ano_Nas) {
            if(Mes_At > Mes_Nas) {
                Calcula_Anormal();
            }else if(Mes_At == Mes_Nas && Dia_At >= Dia_Nas) {
                Calcula_Anormal();
            }else {
                System.out.println("\nDatas INCOERENTES!");
            }
        }else {
            System.out.println("\nDatas INCOERENTES!");
        }
        System.out.println("\nVocê tem " + Dias + " dias de idade!");
    }
    
    static void Calcula_Normal() {
        for(int Ano = Ano_Nas + 1; Ano <= Ano_At; Ano++) {
            int[] Dias_Mes = Verifica_Bissexto(Ano);
            for(int Mes = 1; Mes <= 12; Mes++) {
                if(Ano == Ano_At && Mes == Mes_At) {
                    Dias = Dias + Dia_At;
                    break;
                }else {
                    Dias = Dias + Dias_Mes[Mes];
                }
            }
        }
        for(int Mes = Mes_Nas; Mes <= 12; Mes++) {
            int[] Dias_Mes = Verifica_Bissexto(Ano_Nas);
            if(Mes == Mes_Nas) {
                Dias = Dias + (Dias_Mes[Mes] - Dia_Nas);
            }else {
                Dias = Dias + Dias_Mes[Mes];
            }
        }
    }
    
    static void Calcula_Anormal() {
        int[] Dias_Mes = Verifica_Bissexto(Ano_At);
        if(Mes_Nas == Mes_At) {
            Dias = Dia_At - Dia_Nas;
        }else {
            for(int Mes = Mes_Nas; Mes <= Mes_At; Mes++) {
                if(Mes == Mes_Nas) {
                    Dias = Dias + (Dias_Mes[Mes] - Dia_Nas);
                }else if(Mes == Mes_At) {
                    Dias = Dias + Dia_At;
                }else {
                    Dias = Dias + Dias_Mes[Mes];
                }
            }
        }
    }
    
    static int[] Verifica_Bissexto(int A) {
        int[] Mat1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] Mat2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(A % 4 == 0) {
            if(A % 100 == 0) {
                if(A % 400 == 0) {
                    return Mat2;
                }else {
                    return Mat1;
                }
            }else {
                return Mat2;
            }
        }
        return Mat1;
    }
}