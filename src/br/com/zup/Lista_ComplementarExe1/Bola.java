package br.com.zup.Lista_ComplementarExe1;

import org.w3c.dom.ls.LSOutput;

public class Bola {
    String cor;
    double circunferencia;
    String material;

    public Bola (String cor, double circunferencia, String material){
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.material = material;
    }
    public  void mostrartDados(){
        System.out.println("A cor é "+ cor);
        System.out.println("A circunferecia é "+circunferencia);
        System.out.println("O material é " + material);
    }
    public void trocarCor(String novaCor){
      cor = novaCor;

    }
    public void mostrarCor(){
        System.out.println("A cor da minha bola é: "+cor);
    }




}
