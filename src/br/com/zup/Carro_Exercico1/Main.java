package br.com.zup.Carro_Exercico1;

public class Main {
    public static void main(String[] args) {
    Carro carro1 = new Carro ("Fiat",500,"Fiat", "Vermelho Ferrari",45000);
    carro1.mostrarCarro();
        System.out.println("_____________________________");
    carro1.descontoCarro(5000);
    carro1.trocarCor("Verde");
    carro1.mostrarCarro();
        System.out.println("_____________________________");
    }
}
