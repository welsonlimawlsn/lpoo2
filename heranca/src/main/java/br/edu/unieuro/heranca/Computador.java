package br.edu.unieuro.heranca;

public class Computador extends DispositivoEletronico {

    private String padraoDoTeclado;

    public void programaJava() {
        System.out.println("Programando em Java");
    }

    public void criaDocumento() {
        System.out.println("Criando documento");
    }

    public String getPadraoDoTeclado() {
        return padraoDoTeclado;
    }

    public void setPadraoDoTeclado(String padraoDoTeclado) {
        this.padraoDoTeclado = padraoDoTeclado;
    }
}
