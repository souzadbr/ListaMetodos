package br.com.zup.CartaoDeCredito;

public class CartaoCredito {
    String nomeCliente;
    double limite = 1000;
    double saldo;

    public CartaoCredito (String nomeCliente, double limite, double saldo){
        this.nomeCliente = nomeCliente;
        this.limite = limite;
        this.saldo = saldo;

    }
    public void fatura (){
        System.out.println("Nome do cliente: "+ nomeCliente);
        System.out.println("Limite disponivel: R$ " +limite);
        System.out.println("Saldo: R$ "+saldo);
    }
    public void aumentarLimite (double aumentandoLimite){
        limite = limite + aumentandoLimite;
    }
    public void diminuiLimite (double diminuindoLimite){
        limite = limite -diminuindoLimite;
    }
    public void realizarCompra(double comprar){
        if (saldo == limite){
        saldo = limite - comprar;
        }else{
            System.out.println("Você não tem limite o sufiente, ajuste seu limite!");
        }
    }


}
