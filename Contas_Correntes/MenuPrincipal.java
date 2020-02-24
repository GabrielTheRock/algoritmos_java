//Programador: Gabriel Rocha
//Data: 08/11/2019

package Contas_Correntes;

import java.io.IOException;
import javax.swing.JOptionPane;

public class MenuPrincipal {
    
    public static void main(String[] args) throws IOException {
        ContasCorrentes[] c = new ContasCorrentes[5];
        MovimentoContas[] mov = new MovimentoContas[10];
        ContasAtualizadas[] ca = new ContasAtualizadas[5];
        Metodos m = new Metodos();
        int opc = 0;
        while(opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("    MENU PRINCIPAL    \n\n1 - Cadastrar contas correntes\n2 - Cadastrar movimento\n3 - Gerar contas atualizadas\n4 - Consultar cadastros\n9 - Finalizar\n"));
            switch(opc) {
                case 1: c = m.CADASTRACONTAS(c);
                break;
                case 2: mov = m.CADASTRAMOVIMENTOS(mov, c);
                break;
                case 3: ca = m.BALANCELINE(c, mov, ca);
                break;
                case 4: CONSULTACADASTROS(m, c, mov, ca);
                break;
                case 9: JOptionPane.showMessageDialog(null, "FIM!");
                break;
                default: JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
            }
        }
    }
    
    static void CONSULTACADASTROS(Metodos m, ContasCorrentes[] c, MovimentoContas[] mov, ContasAtualizadas[] ca) throws IOException {
        int opc = 0;
        while(opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("   CONSULTAR CADASTROS   \n\n1 - Contas correntes\n2 - Movimento de contas\n3 - Contas atualizadas\n9 - Finalizar\n"));
            switch(opc) {
                case 1: m.CONSULTACORRENTES(c);
                break;
                case 2: m.CONSULTAMOVIMENTOS(mov);
                break;
                case 3: m.CONSULTAATUALIZADAS(ca);
                break;
                case 9:
                break;
                default: JOptionPane.showMessageDialog(null, "Valor inválido!");
            }
        }
    }
}
