package br.edu.unieuro.lpoo.quatro;

public class Televisao implements Controlavel {

    private int volume;
    private int canal;

    public Televisao() {
        canal = 1;
    }

    @Override
    public void aumentaVolume() {
        if (volume < 100)
            volume++;
    }

    @Override
    public void diminueVolume() {
        if (volume > 0)
            volume--;
    }

    @Override
    public int consultaVolume() {
        return volume;
    }

    @Override
    public void aumentaCanal() {
        canal++;
    }

    @Override
    public void diminuiCanal() {
        if (canal > 1)
            canal--;
    }

    @Override
    public void trocaCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public int consultaCanal() {
        return canal;
    }
}
