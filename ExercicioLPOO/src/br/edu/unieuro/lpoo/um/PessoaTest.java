/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unieuro.lpoo.um;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class PessoaTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        DateTimeFormatter padraoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Informe o nome: ");
        pessoa.setNome(scanner.nextLine());
        
        System.out.println("Infome a altura: ");
        pessoa.setAltura(Float.parseFloat(scanner.nextLine()));
        
        System.out.println("Infome a sua data de nascimento: ");
        pessoa.setDataDeNascimento(LocalDate.parse(scanner.nextLine(), padraoBrasileiro));
        
        System.out.println("======================================================");
        
        System.out.println(pessoa);
    }
}
