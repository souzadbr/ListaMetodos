package br.com.zup.LevelUP_Encapsulamento;

public class Televisao {
    private int volume;
    private int canais;

    public Televisao(int volume, int canais) {
        this.volume = volume;
        this.canais = canais;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanais() {
        return canais;
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }


}
