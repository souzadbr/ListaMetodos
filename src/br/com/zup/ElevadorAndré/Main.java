package br.com.zup.ElevadorAndré;

public class Main {
    public static void main(String[] args) {
        Elevador objeto = new Elevador(0, 8, 10, 0);

        System.out.println(objeto.quantPessoasPresentes);
        objeto.entra(5);
        System.out.println(objeto.quantPessoasPresentes);
        objeto.entra(5);
        System.out.println(objeto.quantPessoasPresentes);
        objeto.sobe(1);
        System.out.println(objeto.andarAtual);
        objeto.sobe(5);
        System.out.println(objeto.andarAtual);
        objeto.desce(2);
        System.out.println(objeto.andarAtual);

    }
}
