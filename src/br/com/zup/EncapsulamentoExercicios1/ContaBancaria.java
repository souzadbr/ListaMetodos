package br.com.zup.EncapsulamentoExercicios1;

public class ContaBancaria {

    private String nomeDotitular;
    private String numeroDeConta;
    private double saldo = 0;

    public ContaBancaria(String nomeDotitular, String numeroDeConta, double saldo) {
        this.nomeDotitular = nomeDotitular;
        this.numeroDeConta = numeroDeConta;
        this.saldo = saldo;

    }

    public String getNomeDotitular(){
        return nomeDotitular;
    }
    public String getNumeroDeConta(){
        return numeroDeConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setNomeDotitular(String nomeDoTitular){
        this.nomeDotitular = nomeDoTitular;
    }
    public void setNumeroDeConta(String numeroDeConta){
        this.numeroDeConta = numeroDeConta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void sacar(double saque){
        saldo = saldo - saque;
    }
    public void depositar (double deposito){
        saldo = saldo + deposito;
    }
    public void extrato(){
        System.out.println("Nome do correntista: "+nomeDotitular);
        System.out.println("Número da conta: "+numeroDeConta);
        System.out.println("Saldo: R$"+saldo);
    }



}


