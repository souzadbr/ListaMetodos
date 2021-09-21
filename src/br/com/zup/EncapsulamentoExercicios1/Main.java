package br.com.zup.EncapsulamentoExercicios1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Debora", "01254",0);
        conta1.extrato();
        conta1.depositar(200);
        System.out.println("-------");
        conta1.extrato();
        conta1.sacar(20);
        conta1.extrato();

    }
}
