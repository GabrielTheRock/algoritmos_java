package Lt01_30;

import java.util.Scanner;

public class Lt01_30 {
    
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
            Ano_Maior();
        }else if(Ano_At == Ano_Nas) {
            if(Mes_At > Mes_Nas) {
                Ano_Igual();
            }else if(Mes_At == Mes_Nas && Dia_At >= Dia_Nas) {
                Ano_Igual();
            }else {
                System.out.println("\nDatas INCOERENTES!");
            }
        }else {
            System.out.println("\nDatas INCOERENTES!");
        }
        Mostra_Idade();
    }
    
    static void Ano_Maior() {
        if(Mes_At > Mes_Nas) {
            if(Dia_At >= Dia_Nas) {
                Anos = Ano_At - Ano_Nas;
                Meses = Mes_At - Mes_Nas;
                Dias = Dia_At - Dia_Nas;
            }else {
                Anos = Ano_At - Ano_Nas;
                Meses = Mes_At - Mes_Nas - 1;
                Dias = Dia_At + (Dias_Mes(Mes_Nas) - Dia_Nas);
            }
        }else if(Mes_At == Mes_Nas) {
            if(Dia_At >= Dia_Nas) {
                Anos = Ano_At - Ano_Nas;
                Meses = 0;
                Dias = Dia_At - Dia_Nas;
            }else {
                Anos = Ano_At - Ano_Nas - 1;
                Meses = 11;
                Dias = Dia_At + (Dias_Mes(Mes_Nas) - Dia_Nas);
            }
        }else {
            if(Dia_At >= Dia_Nas) {
                Anos = Ano_At - Ano_Nas - 1;
                Meses = 12 + Mes_At - Mes_Nas;
                Dias = Dia_At - Dia_Nas;
            }else {
                Anos = Ano_At - Ano_Nas - 1;
                Meses = 11 + Mes_At - Mes_Nas;
                Dias = Dia_At + (Dias_Mes(Mes_Nas) - Dia_Nas);
            }
        }
    }
    
    static void Ano_Igual() {
        if(Mes_At > Mes_Nas) {
            if(Dia_At >= Dia_Nas) {
                Anos = 0;
                Meses = Mes_At - Mes_Nas;
                Dias = Dia_At - Dia_Nas;
            }else {
                Anos = 0;
                Meses = Mes_At - Mes_Nas - 1;
                Dias = Dia_At + (Dias_Mes(Mes_Nas) - Dia_Nas);
            }
        }else {
            if(Dia_At > Dia_Nas) {
                Anos = 0;
                Meses = 0;
                Dias = Dia_At - Dia_Nas;
            }
        }
    }
    
    static int Dias_Mes(int M) {
        if(M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 12) {
            return 31;
        }else if(M == 2) {
            return 28;
        }else {
            return 30;
        }
    }
    
    static void Mostra_Idade() {
        if(Anos > 0) {
            if(Meses > 0) {
                if(Dias > 0) {
                    System.out.println("\nVocê tem " + Anos + " anos, " + Meses + " meses e " + Dias + " dias de idade!");
                }else {
                    System.out.println("\nVocê tem " + Anos + " anos e " + Meses + " meses de idade!");
                }
            }else if(Dias > 0) {
                System.out.println("\nVocê tem " + Anos + " anos e " + Dias + " dias de idade!");
            }else {
                System.out.println("\nVocê tem " + Anos + " anos de idade!");
            }
        }else if(Meses > 0) {
            if(Dias > 0) {
                System.out.println("\nVocê tem " + Meses + " meses e " + Dias + " dias de idade!");
            }else {
                System.out.println("\nVocê tem " + Meses + " meses de idade!");
            }
        }else if(Dias > 0) {
            System.out.println("\nVocê tem " + Dias + " dias de idade!");
        }
    }
}
