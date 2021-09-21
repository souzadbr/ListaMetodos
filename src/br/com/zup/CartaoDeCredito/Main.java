package br.com.zup.CartaoDeCredito;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cartão1 = new CartaoCredito("Debora Rodrigues",1000, 500);
        cartão1.fatura();
        System.out.println("--------------------------");
        cartão1.aumentarLimite(2000);
        System.out.println("---------------------------");
        cartão1.realizarCompra(500);
        cartão1.fatura();
    }
}
