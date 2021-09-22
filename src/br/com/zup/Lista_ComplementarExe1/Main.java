package br.com.zup.Lista_ComplementarExe1;

public class Main {
    public static void main(String[] args) {
        Bola bola1 = new Bola("Azul",1.1, "Plástico");
        bola1.mostrartDados();
        System.out.println("---------");
        bola1.trocarCor("Vermelho");
        bola1.mostrartDados();


    }
}
