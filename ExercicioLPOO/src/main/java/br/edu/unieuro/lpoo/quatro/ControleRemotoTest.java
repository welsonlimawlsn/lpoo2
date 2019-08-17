package br.edu.unieuro.lpoo.quatro;

public class ControleRemotoTest {

    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        ControleRemoto controleRemoto = new ControleRemoto(televisao);
        System.out.println("Volume: " + controleRemoto.consultaVolume());
        System.out.println("Canal: " + controleRemoto.consultaCanal());

        controleRemoto.aumentaVolume();
        controleRemoto.aumentaVolume();
        controleRemoto.aumentaVolume();
        controleRemoto.aumentaVolume();
        controleRemoto.aumentaVolume();
        controleRemoto.aumentaVolume();
        controleRemoto.aumentaVolume();
        controleRemoto.aumentaVolume();
        controleRemoto.aumentaVolume();
        controleRemoto.aumentaVolume();

        System.out.println("Volume: " + controleRemoto.consultaVolume());

        controleRemoto.diminueVolume();
        controleRemoto.diminueVolume();

        System.out.println("Volume: " + controleRemoto.consultaVolume());

        controleRemoto.aumentaCanal();
        controleRemoto.aumentaCanal();
        controleRemoto.aumentaCanal();
        controleRemoto.aumentaCanal();
        controleRemoto.aumentaCanal();

        System.out.println("Canal: " + controleRemoto.consultaCanal());

        controleRemoto.diminuiCanal();

        System.out.println("Canal: " + controleRemoto.consultaCanal());

        controleRemoto.trocaCanal(10);

        System.out.println("Canal: " + controleRemoto.consultaCanal());
    }
}
