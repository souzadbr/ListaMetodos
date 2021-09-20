package br.com.zup.ContaCorrente;

public class Contacorrente {
    String nomeDotitular;
    String cpf;
    String agencia;
    String numeroDeConta;
    double emprestimo = 900;
    double saldo = 0;

    public Contacorrente(String nomeDotitular, String cpf, String agencia, String numeroDeConta, double emprestimo, double saldo) {
        this.nomeDotitular = nomeDotitular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numeroDeConta = numeroDeConta;

    }

    //metodo com retorno vazio para mostrar dados.
    public void mostrarDados(){
        System.out.println("Nome do titular: " + nomeDotitular);
        System.out.println("CPF do titular: " + cpf);
        System.out.println("Agência: " + agencia);
        System.out.println("Numero da conta: " + numeroDeConta);
        System.out.println("Valor liberado para emprestimo: " + emprestimo);
        System.out.println("Saldo: " + saldo);
    }

    //metodos com retorno vazio para depositar
    public void depositar(double valorDeposito) {
        saldo = saldo + valorDeposito;
    }

    //metodos com retorno vazio para sacar
    public void sacar(double valorSaque){
        saldo = saldo - valorSaque;
    }

    //metodos liberação de emprestimo
    public void liberaEmprestimo(double valor){
        emprestimo = emprestimo - valor;
    }

    //metodo solicita emprestimo valida liberação ou não)
    public void solicitaemprestimo (double valor){
        if(valor>emprestimo){
            System.out.println("Este limite não está aprovado");
        }else{
            System.out.println("Este limite está aprovado");
            depositar(valor);
            liberaEmprestimo(valor);
        }
    }


}
