package br.edu.unieuro.lpoo.dois;

import br.edu.unieuro.lpoo.um.Pessoa;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgendaTest {

    private static Scanner scanner;
    private static Agenda agenda;

    static {
        scanner = new Scanner(System.in);
        agenda = new Agenda();
    }

    public static void main(String[] args) {
        int opcaoMenu;
        do {
            opcaoMenu = getOpcaoMenu();
            try {
                switch (opcaoMenu) {
                    case 1:
                        adicionaPessoa();
                    case 2:
                        removePessoa();
                    case 3:
                        procuraPorNome();
                    case 4:
                        imprimeAgenda();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (opcaoMenu != 5);
    }

    public static int getOpcaoMenu() {
        System.out.println("1 - Adicionar");
        System.out.println("2 - Remover");
        System.out.println("3 - Procurar por nome");
        System.out.println("4 - Imprimir Agenda");
        System.out.println("5 - Sair");
        return Integer.parseInt(scanner.nextLine());
    }

    private static void adicionaPessoa() throws Exception {
        Pessoa pessoa = new Pessoa();
        DateTimeFormatter padraoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Informe o nome: ");
        pessoa.setNome(scanner.nextLine());

        System.out.println("Infome a altura: ");
        pessoa.setAltura(Float.parseFloat(scanner.nextLine()));

        System.out.println("Infome a sua data de nascimento: ");
        pessoa.setDataDeNascimento(LocalDate.parse(scanner.nextLine(), padraoBrasileiro));
        agenda.armazenaPessoa(pessoa.getNome(), pessoa.getDataDeNascimento(), pessoa.getAltura());
    }

    private static void removePessoa() throws Exception {
        agenda.removePessoa(scanner.nextLine());
    }

    private static void procuraPorNome() throws Exception {
        agenda.imprimePessoa(agenda.buscaPessoa(scanner.nextLine()));
    }

    private static void imprimeAgenda() {
        agenda.imprimeAgenda();
    }
}
