package br.edu.unieuro.heranca;

public class App {

    public static void main(String[] args) {

        Computador computador = new Computador();
        computador.setCor("Preto");
        computador.setPadraoDoTeclado("ABNT2");
        computador.ligaDispositivo();
        computador.criaDocumento();
        computador.programaJava();
        computador.desligaPositivo();

        Fixo fixo = new Fixo();
        fixo.setTelefoneSemFio(false);
        fixo.setCor("Branco");
        fixo.setNumero("33794012");
        fixo.ligaDispositivo();
        fixo.realizaLigacao("081346998");
        fixo.recebeLigacao();
        fixo.desligaPositivo();

        Movel movel = new Movel();
        movel.setNumero("981346998");
        movel.setTamanhoDaTela(6.2);
        movel.setCor("Cinza");
        movel.ligaDispositivo();
        movel.realizaLigacao("33794012");
        movel.recebeLigacao();
        movel.mandaSMS();
        movel.desligaPositivo();
    }
}
