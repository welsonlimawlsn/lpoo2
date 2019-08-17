package br.edu.unieuro.lpoo.um;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    
    private String nome;
    private LocalDate dataDeNascimento;
    private float altura;

    public Pessoa() {
    }

    public Pessoa(String nome, LocalDate dataDeNascimento, float altura) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }
    
    public int getIdade() {
        Period idade = Period.between(dataDeNascimento, LocalDate.now());
        return idade.getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome 
                + "\nData de Nascimento: " + dataDeNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + "\nAltura: " + altura
                + "\nIdade: " + getIdade();
    }
    
    
    
}
