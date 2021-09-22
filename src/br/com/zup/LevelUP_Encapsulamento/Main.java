package br.com.zup.LevelUP_Encapsulamento;

public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao(20, 5);
        ControleRemoto controle1 = new ControleRemoto(tv);

        System.out.println(tv.getCanais());
        System.out.println(tv.getVolume());
        controle1.aumentarVolume();
        System.out.println("O volume atual é ");
        System.out.println(tv.getVolume());
        controle1.diminuirVolume();
        System.out.println(tv.getVolume());
        controle1.aumentarCanal();
        System.out.println(tv.getCanais());
        controle1.diminuirCanal();
        System.out.println(tv.getCanais());
        System.out.println("----------------");
        controle1.canalInd(15);
        System.out.println(tv.getCanais());
        System.out.println("----------------");
        System.out.println(controle1.mostrarCanal());
        System.out.println(controle1.mostrarVolume());

    }
}
