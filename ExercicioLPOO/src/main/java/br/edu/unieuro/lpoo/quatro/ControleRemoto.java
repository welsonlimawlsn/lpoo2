package br.edu.unieuro.lpoo.quatro;

public class ControleRemoto {

    private Controlavel controlavel;

    public ControleRemoto(Controlavel controlavel) {
        this.controlavel = controlavel;
    }

    public void aumentaVolume() {
        controlavel.aumentaVolume();
    }

    public void diminueVolume() {
        controlavel.diminueVolume();
    }

    public int consultaVolume() {
        return controlavel.consultaVolume();
    }

    public void aumentaCanal() {
        controlavel.aumentaCanal();
    }

    public void diminuiCanal() {
        controlavel.diminuiCanal();
    }

    public void trocaCanal(int canal) {
        controlavel.trocaCanal(canal);
    }

    public int consultaCanal() {
        return controlavel.consultaCanal();
    }

    public Controlavel getControlavel() {
        return controlavel;
    }

    public void setControlavel(Controlavel controlavel) {
        this.controlavel = controlavel;
    }
}
