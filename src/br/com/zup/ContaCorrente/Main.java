package br.com.zup.ContaCorrente;

import br.com.zup.ContaCorrente.Contacorrente;

public class Main {

    public static void main(String[] args) {

        //String sempre com aspas duplas.
        Contacorrente conta1 = new Contacorrente("Débora Rodrigues", "35058733811", "12514", "12548", 0, 0);
        conta1.mostrarDados();
        conta1.depositar(100);
        conta1.mostrarDados();
        conta1.sacar(50);
        conta1.mostrarDados();
        conta1.solicitaemprestimo(910);
        conta1.mostrarDados();
    }
}
