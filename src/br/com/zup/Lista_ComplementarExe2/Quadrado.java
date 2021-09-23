package br.com.zup.Lista_ComplementarExe2;

public class Quadrado {
    private double tamanhoLado;

    public Quadrado (double tamanhoLado){
      this.tamanhoLado = tamanhoLado;
    }

    public double getTamanhoLado() {
        return tamanhoLado;
    }

    public void setTamanhoLado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    public double trocarTamanhoLado (double novoTamanhoLado){
        setTamanhoLado(novoTamanhoLado);
        return novoTamanhoLado;
    }

    public void mostrarDados(){
        System.out.println("O valor do lado é: "+ tamanhoLado);
    }

    public double areaQuadrado(double tamanhoLado){
      double calcularArea = getTamanhoLado()*getTamanhoLado();
      return calcularArea;
    }




}
