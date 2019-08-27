package br.edu.unieuro.heranca;

public class Telefone extends DispositivoEletronico {

    private String numero;

    public void realizaLigacao(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void recebeLigacao() {
        System.out.println("Recebendo ligação");
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
