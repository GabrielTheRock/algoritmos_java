//Programador: Gabriel Rocha
//Data: 10/11/2019

package Contas_Correntes;

class ContasAtualizadas {
    
    int codContaA, tipoContaA;
    double saldoContaA, limiteContaA;
    String nomeClientesA;
    
    ContasAtualizadas() {
        this(0, 0, 0, 0, "");
    }
    
    ContasAtualizadas(int cod, double lim, int tip, double sal, String nom) {
        codContaA = cod;
        limiteContaA = lim;
        tipoContaA = tip;
        saldoContaA = sal;
        nomeClientesA = nom;
    }
}
