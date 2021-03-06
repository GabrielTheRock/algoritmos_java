//Programador: Gabriel Rocha
//Data: 08/11/2019

package Contas_Correntes;

import java.util.Random;
import java.io.*;
import java.text.NumberFormat;

public class Metodos {

    public ContasCorrentes[] CADASTRACONTAS(ContasCorrentes[] c) throws IOException {
        String fileName = "ContasCorrentes.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        NumberFormat n = NumberFormat.getCurrencyInstance();
        String[] let = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String nome = "";
        Random R = new Random();
        for (int i = 0; i <= 4; i++) {
            c[i] = new ContasCorrentes();
            for (int j = 0; j <= 4; j++) {
                nome = nome.concat(let[R.nextInt(10)]);
            }
            c[i].nomeClientesC = nome;
            c[i].codContaC = R.nextInt(9999) + 1001;
            c[i].saldoContaC = R.nextDouble() * 5000;
            c[i].tipoContaC = R.nextInt(4) + 1;
            c[i].limiteContaC = R.nextDouble() * 4000;
            nome = "";
        }
        c = CLASSIFICACONTAS(c);
        for(int i = 0; i <= 4; i++) {
            writer.write("Código da conta: " + Integer.toString(c[i].codContaC));
            writer.newLine();
            writer.write("Nome do cliente: " + c[i].nomeClientesC);
            writer.newLine();
            writer.write("Saldo da conta: " + n.format(c[i].saldoContaC));
            writer.newLine();
            writer.write("Limite da conta: " + n.format(c[i].limiteContaC));
            writer.newLine();
            writer.write("Tipo de conta: " + Integer.toString(c[i].tipoContaC));
            writer.newLine();
            writer.newLine();
        }
        writer.close();
        System.out.println("Contas cadastradas com SUCESSO!");
        return c;
    }
    
    public ContasCorrentes[] CLASSIFICACONTAS(ContasCorrentes[] c) {
        ContasCorrentes aux;
        for(int i = 0; i <= 3; i++) {
            for(int j = i + 1; j <= 4; j++) {
                if (c[i].codContaC > c[j].codContaC) {
                    aux = c[i];
                    c[i] = c[j];
                    c[j] = aux;
                }
            }
        }
        return c;
    }
    
    public MovimentoContas[] CLASSIFICAMOVIMENTOS(MovimentoContas[] mov) throws IOException {
        MovimentoContas aux;
        for(int i = 0; i <= 8; i++) {
            for(int j = i + 1; j <= 9; j++) {
                if (mov[i].codContaM > mov[j].codContaM) {
                    aux = mov[i];
                    mov[i] = mov[j];
                    mov[j] = aux;
                }
            }
        }
        return mov;
    }

    public MovimentoContas[] CADASTRAMOVIMENTOS(MovimentoContas[] mov, ContasCorrentes[] c) throws IOException {
        String fileName = "MovimentoContas.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        Random R = new Random();
        NumberFormat n = NumberFormat.getCurrencyInstance();
        for(int i = 0; i <= 9; i++) {
            mov[i] = new MovimentoContas();
            mov[i].codContaM = c[R.nextInt(5)].codContaC;
            mov[i].tipoMovimentoM = R.nextInt(2) + 1;
            mov[i].statusM = R.nextInt(2) + 1;
            mov[i].valorMovimentoM = R.nextDouble() * 10000;
        }
        mov = CLASSIFICAMOVIMENTOS(mov);
        for(int i = 0; i <= 9; i++) {
            writer.write("Código da conta: " + Integer.toString(mov[i].codContaM));
            writer.newLine();
            writer.write("Valor do movimento: " + n.format(mov[i].valorMovimentoM));
            writer.newLine();
            writer.write("Tipo de movimento: " + Integer.toString(mov[i].tipoMovimentoM));
            writer.newLine();
            writer.write("Status do movimento: " + Integer.toString(mov[i].statusM));
            writer.newLine();
            writer.newLine();
        }
        writer.close();
        System.out.println("Movimentos cadastrados com SUCESSO!");
        return mov;
    }

    public ContasAtualizadas[] BALANCELINE(ContasCorrentes[] c, MovimentoContas[] mov, ContasAtualizadas[] ca) throws IOException {
        for(int i = 0; i <= 4; i++) {
            for(int j = 0; j <= 9; j++) {
                if(c[i].codContaC == mov[j].codContaM) {
                    if(mov[i].statusM == 1) {
                        ca[i] = new ContasAtualizadas();
                        ca[i].codContaA = c[i].codContaC;
                        ca[i].nomeClientesA = c[i].nomeClientesC;
                        ca[i].saldoContaA = c[i].saldoContaC - mov[i].valorMovimentoM;
                        ca[i].limiteContaA = c[i].limiteContaC;
                        ca[i].tipoContaA = c[i].tipoContaC;
                    }else {
                        ca[i] = new ContasAtualizadas();
                        ca[i].codContaA = c[i].codContaC;
                        ca[i].nomeClientesA = c[i].nomeClientesC;
                        ca[i].tipoContaA = c[i].tipoContaC;
                        if(mov[i].tipoMovimentoM == 2) {
                            ca[i].saldoContaA = c[i].saldoContaC - mov[i].valorMovimentoM;
                            ca[i].limiteContaA = c[i].limiteContaC;
                        }else {
                            ca[i].saldoContaA = c[i].saldoContaC - mov[i].valorMovimentoM;
                            switch(c[i].tipoContaC) {
                                case 1: ca[i].limiteContaA = 0;
                                break;
                                case 2: ca[i].limiteContaA = c[i].limiteContaC;
                                break;
                                case 3: ca[i].limiteContaA = c[i].limiteContaC + (0.5 * c[i].saldoContaC);
                                break;
                                case 4: ca[i].limiteContaA = c[i].limiteContaC + c[i].saldoContaC;
                            }
                        }
                    }
                }
            }
        }
        String fileName = "ContasAtualizadas.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        NumberFormat n = NumberFormat.getCurrencyInstance();
        for(int j = 0; j <= 4; j++) {
            writer.write("Código da conta: " + Integer.toString(ca[j].codContaA));
            writer.newLine();
            writer.write("Nome do cliente: " + ca[j].nomeClientesA);
            writer.newLine();
            writer.write("Saldo da conta: " + n.format(ca[j].saldoContaA));
            writer.newLine();
            writer.write("Limite da conta: " + n.format(ca[j].limiteContaA));
            writer.newLine();
            writer.write("Tipo de conta: " + Integer.toString(ca[j].tipoContaA));
            writer.newLine();
            writer.newLine();
        }
        writer.close();
        System.out.println("Contas atualizadas geradas com SUCESSO!");
        return ca;
    }

    public void CONSULTACORRENTES(ContasCorrentes[] c) throws IOException {
        String fileName = "ContasCorrentes.txt";
        BufferedReader ler = new BufferedReader(new FileReader(fileName));
        System.out.println("\nLEITURA DO ARQUIVO DE CONTAS CORRENTES\n");
        for(int i = 0; i <= 29; i++) {
            System.out.println(ler.readLine());
        }
        ler.close();
    }

    public void CONSULTAMOVIMENTOS(MovimentoContas[] mov) throws IOException {
        String fileName = "MovimentoContas.txt";
        BufferedReader ler = new BufferedReader(new FileReader(fileName));
        System.out.println("\nLEITURA DO ARQUIVO DE MOVIMENTOS DE CONTAS\n");
        for(int i = 0; i <= 49; i++) {
            System.out.println(ler.readLine());
        }
        ler.close();
    }

    public void CONSULTAATUALIZADAS(ContasAtualizadas[] ca) throws IOException {
        String fileName = "ContasAtualizadas.txt";
        BufferedReader ler = new BufferedReader(new FileReader(fileName));
        System.out.println("\nLEITURA DO ARQUIVO DE CONTAS ATUALIZADAS\n");
        for(int i = 0; i <= 29; i++) {
            System.out.println(ler.readLine());
        }
        ler.close();
    }
}
