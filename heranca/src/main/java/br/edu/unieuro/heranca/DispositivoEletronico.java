package br.edu.unieuro.heranca;

public class DispositivoEletronico {

    private String cor;

    public void ligaDispositivo() {
        System.out.println("Ligando dispositivo");
    }

    public void desligaPositivo() {
        System.out.println("Desligando dispositivo");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
