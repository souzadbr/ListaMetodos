package br.com.zup.EncapsulamentoExercicio3;

public class Pessoa {
    private String nome;
    private int dataNascimento;
    private double altura;

    public Pessoa(String nome, int dataNascimento, double altura) {
        this.altura = altura;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void identidade() {
        System.out.println("Nome da pessoa é: " + getNome());
        System.out.println("Altura da pessoa é " + getAltura());
        System.out.println("A data de nascimento é: " + getDataNascimento());
    }


    public int anosCompletos(int anoAtual) {
      int  idade = anoAtual - getDataNascimento();
        System.out.println("A idade da pessoa é "+ idade);
        return idade;
    }


}
