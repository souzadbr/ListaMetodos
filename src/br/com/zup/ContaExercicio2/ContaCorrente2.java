package br.com.zup.ContaExercicio2;

public class ContaCorrente2 {
    String nomeCorrentista;
    String numeroConta;
    double saldo;

    public ContaCorrente2 (String nomeCorrentista, String numeroConta, double saldo){
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldo = saldo;

    }
    public void extratoConta(){
        System.out.println("O nome do correntista é: "+nomeCorrentista);
        System.out.println("O número da conta é: "+numeroConta);
        System.out.println("saldo: R$"+saldo);
    }
    public void saqueConta(double saque){
        saldo = saldo - saque;
    }
    public void depositoConta(double deposito){
        saldo = saldo + deposito;
    }
}
