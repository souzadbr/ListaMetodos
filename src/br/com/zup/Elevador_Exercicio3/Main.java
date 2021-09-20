package br.com.zup.Elevador_Exercicio3;

public class Main {
    public static void main(String[] args) {
        Elevador elevador1 = new Elevador(0, 10, 10, 5);
        elevador1.mostrarElevador();
        System.out.println("-----------------------");
        elevador1.entrarElevador(5);
        elevador1.sobeAndar(11);
        elevador1.mostrarElevador();
        System.out.println("-----------------------");
        elevador1.desceAndar(5);
        elevador1.sairElevador(11);
        elevador1.mostrarElevador();
        System.out.println("-----------------------");
        elevador1.desceAndar(4);
        elevador1.mostrarElevador();
        System.out.println("-----------------------");
        elevador1.sairElevador(9);
        elevador1.mostrarElevador();
        System.out.println("-----------------------");


    }
}
