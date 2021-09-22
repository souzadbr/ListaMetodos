package br.com.zup.LevelUP_Encapsulamento;

public class ControleRemoto {
    private Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    public void aumentarVolume() {
        tv.setVolume(tv.getVolume() + 1);
    }

    public void diminuirVolume() {
        tv.setVolume(tv.getVolume() - 1);
    }

    public void aumentarCanal() {
        tv.setCanais(tv.getCanais() + 1);
    }

    public void diminuirCanal() {
        tv.setCanais(tv.getCanais() - 1);
    }

    public void canalInd(int canalIndicado) {
        tv.setCanais(canalIndicado);
    }

    public int mostrarCanal() {
        return tv.getCanais();
    }

    public int mostrarVolume() {
        return tv.getVolume();
    }

}

