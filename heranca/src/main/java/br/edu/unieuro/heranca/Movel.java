package br.edu.unieuro.heranca;

public class Movel extends Telefone {

    private double tamanhoDaTela;

    public void mandaSMS() {
        System.out.println("Mandando SMS");
    }

    public double getTamanhoDaTela() {
        return tamanhoDaTela;
    }

    public void setTamanhoDaTela(double tamanhoDaTela) {
        this.tamanhoDaTela = tamanhoDaTela;
    }
}
