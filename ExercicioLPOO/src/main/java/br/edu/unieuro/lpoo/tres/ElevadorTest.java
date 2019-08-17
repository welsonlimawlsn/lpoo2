package br.edu.unieuro.lpoo.tres;

public class ElevadorTest {

    public static void main(String[] args) {

        Elevador elevador = Elevador.inicializa(10, 15);

        try {
            System.out.println(elevador);
            elevador.entra();
            elevador.entra();
            elevador.entra();
            System.out.println(elevador);
            elevador.sobe();
            elevador.sobe();
            elevador.sai();
            elevador.dece();
            System.out.println(elevador);
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
            elevador.sobe();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
