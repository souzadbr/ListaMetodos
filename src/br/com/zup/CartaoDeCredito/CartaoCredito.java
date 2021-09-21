package br.com.zup.CartaoDeCredito;
//finalizar
public class CartaoCredito {
    String nomeCliente;
    double limite;
    double saldo;

    //Métodos construtor
    public CartaoCredito(String nomeCliente, double limite, double saldo) {
        this.nomeCliente = nomeCliente;
        this.limite = limite;
        this.saldo = saldo;

    }

    //Métodos exibe dados do cartão do cliente
    public void exibirDados(){
        System.out.println("Nome do titular do cartão: "+ nomeCliente);
        System.out.println("Saldo da fatura: "+saldo);
        System.out.println("Este é o limite que o cliente tem no seu cartão "+ limite);
    }

    //Método aumenta limite

    public void aumentaLimite (double aumentandoLiminte){
        limite = limite + aumentandoLiminte;
    }
    //Métodos diminui limite

    public void diminiuLimite (double diminuindoLimite){
        limite = limite - diminuindoLimite;
    }
    //Método realizar compra

    public void realizaCompra (double compraRealizada){
       if (compraRealizada<= limite) {
           System.out.println("Compra realizada com sucesso");
           limite = limite - compraRealizada;
           saldo = saldo + compraRealizada;
       }else{
           System.out.println("Saldo insuficiente");
       }
    }
    public void imprimirFaturaCartão (){
        System.out.println("Limite do cartão é: "+limite);
        System.out.println("Sua fatura atual é: "+ saldo);
    }
}
