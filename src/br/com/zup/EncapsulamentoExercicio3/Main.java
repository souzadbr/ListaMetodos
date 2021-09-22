package br.com.zup.EncapsulamentoExercicio3;

public class Main {
    public static void main(String[] args) {
        Pessoa humano = new Pessoa("Debora", 1992, 1.65);
        humano.identidade();
        System.out.println(humano.anosCompletos(2021));



    }
}
