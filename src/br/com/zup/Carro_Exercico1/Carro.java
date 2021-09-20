package br.com.zup.Carro_Exercico1;

public class Carro {

    String nome;
    double peso;
    String fabricante;
    String cor;
    double valor;

    public Carro (String nome, double peso, String fabricante, String cor, double valor){
        this.nome =nome;
        this.peso =peso;
        this.fabricante =fabricante;
        this.cor =cor;
        this.valor=valor;

    }
    public void mostrarCarro() {
        System.out.println("O nome do carro é: "+ nome);
        System.out.println("O peso do carro é: "+peso);
        System.out.println("O Fabricante do carro é: "+fabricante);
        System.out.println("A cor do carro é: "+cor);
        System.out.println("O valor do carro é: R$"+valor);
    }
    public void trocarCor(String novaCor){
        cor = novaCor;
    }
    public void descontoCarro(double valorDesconto){
        valor = valor - valorDesconto;
    }
}


