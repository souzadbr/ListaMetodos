package br.com.zup.Elevador_Exercicio3;

public class Elevador {

    double terreo = 0;
    double andaresPredio;
    double capacidadeElevador;
    double pessoasPresentesDentroElevador;

    public Elevador(double terreo, double andaresPredio, double capacidadeElevador, double pessoasPresentesDentroElevador){
        this.andaresPredio = andaresPredio;
        this.capacidadeElevador = capacidadeElevador;
        this.pessoasPresentesDentroElevador = pessoasPresentesDentroElevador;
        this.terreo = terreo;
    }

    public void mostrarElevador (){

        System.out.println("O elevador está no andar: "+ andaresPredio);
        System.out.println("O elevador tem capacidade de: "+capacidadeElevador+" pessoas");
        System.out.println("Atualmente temos "+pessoasPresentesDentroElevador+ " pessoas dentro do elevador");
    }
    public void entrarElevador(double pessoaEntrando) {
        if (pessoaEntrando >= capacidadeElevador) {
            System.out.println("Você não pode entrar, elevador com capacidade máxima!");
        } else {
            pessoasPresentesDentroElevador = pessoasPresentesDentroElevador + pessoaEntrando;
        }
    }
    public void sairElevador (double pessoaSaindo){
        if (pessoasPresentesDentroElevador>= pessoaSaindo){
            pessoasPresentesDentroElevador = pessoasPresentesDentroElevador - pessoaSaindo;
        }else{
            System.out.println("Não tem pessoas para sair do elevador.");
        }
    }
    public void sobeAndar(double andarAcima){
        if (andarAcima>=andaresPredio){
            System.out.println("Você está no ultimo andar!");
        }else {
            andaresPredio = andaresPredio+andarAcima;
        }
    }
    public void desceAndar (double andarAbaixo){
        if (andarAbaixo == 0){
            System.out.println("Você está no terreo, não temos subsolo!");
        }else {
            andaresPredio = andaresPredio - andarAbaixo;
        }
    }

}
