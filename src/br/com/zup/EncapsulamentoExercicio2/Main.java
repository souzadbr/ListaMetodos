package br.com.zup.EncapsulamentoExercicio2;

import br.com.zup.Elevador_Exercicio3.Elevador;

public class Main {
    public static void main(String[] args) {
        Elevador_Encap objeto = new Elevador_Encap(0, 10, 10, 1);
        objeto.getCapacidadeElevador();
        System.out.println(objeto.getCapacidadeElevador());
        objeto.sai(1);
        System.out.println(objeto.getQuantPessoasPresentes());
        objeto.entra(8);
        System.out.println(objeto.getQuantPessoasPresentes());
        objeto.sobe(2);
        System.out.println(objeto.getAndarAtual());

    }
}
