package br.com.zup.EncapsulamentoExercicio3;

public class Pessoa {
    private String nome;
    private int dataNascimento;
    private double altura;
    private int idade;

    public Pessoa(String nome, int dataNascimento, double altura, int idade) {
        this.altura = altura;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade(){
        return idade;
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
    public void setIdade(int idade){
        this.idade= idade;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mostrarDados() {
        System.out.println("Nome da pessoa é: " + getNome());
        System.out.println("Altura da pessoa é " + getAltura());
        System.out.println("A data de nascimento é: " + getDataNascimento());

    }


    public void idadeAtual (int anoAtual){
        setIdade(anoAtual-getDataNascimento());
        System.out.println("A idade da pessoa é: "+ getIdade());
    }


}
