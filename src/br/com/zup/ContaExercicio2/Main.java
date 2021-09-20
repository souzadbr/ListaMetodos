package br.com.zup.ContaExercicio2;

public class Main {
    public static void main(String[] args) {
        ContaCorrente2 conta1 = new ContaCorrente2("Debora Rodrigues", "25544-5",100);
        conta1.extratoConta();
        System.out.println("-------------------");
        conta1.depositoConta(500);
        conta1.extratoConta();
        System.out.println("-------------------");
        conta1.saqueConta(75);
        System.out.println("-------------------");
        conta1.extratoConta();
    }
}
