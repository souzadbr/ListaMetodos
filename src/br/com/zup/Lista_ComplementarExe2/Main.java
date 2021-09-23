package br.com.zup.Lista_ComplementarExe2;

public class Main {
    public static void main(String[] args) {
        Quadrado quadro1 = new Quadrado(2);
        quadro1.mostrarDados();
        System.out.println("--------");
        quadro1.trocarTamanhoLado(5);
        quadro1.mostrarDados();
        System.out.println("-------------");
        quadro1.trocarTamanhoLado(10);
        quadro1.mostrarDados();
        System.out.println("-------------");
        quadro1.areaQuadrado(quadro1.getTamanhoLado());
        System.out.println("O valor do calculo de área é ");
        System.out.println(quadro1.areaQuadrado(quadro1.getTamanhoLado()));


    }
}
