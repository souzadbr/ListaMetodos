package br.com.zup.CartaoDeCredito;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cartao1 = new CartaoCredito("Débora Rodrigues", 2000, 500);
        cartao1.imprimirFaturaCartão();
        cartao1.realizaCompra(200);
        cartao1.imprimirFaturaCartão();
}}
