package br.edu.unieuro.lpoo.dois;

import br.edu.unieuro.lpoo.um.Pessoa;
import java.time.LocalDate;

public class Agenda {
    
    private Pessoa[] pessoas;

    public Agenda() {
        pessoas = new Pessoa[10];
    }
    
    public void armazenaPessoa(String nome, LocalDate dataNascimento, float altura) throws Exception {
        pessoas[getProximaPosicaoVazia()] = new Pessoa(nome, dataNascimento, altura);
    }
    
    public void removePessoa(String nome) throws Exception {
        pessoas[buscaPessoa(nome)] = null;
    }
    
    public int buscaPessoa(String nome) throws Exception {
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getNome().equals(nome))
                return i;
        }
        throw new Exception("Pessoa não encontrada");
    }
    
    public void imprimeAgenda() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa != null)
                System.out.println(pessoa);
        }
    }
    
    public void imprimePessoa(int index) {
        System.out.println(pessoas[index]);
    }

    private int getProximaPosicaoVazia() throws Exception {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) return i;
        }
        throw new Exception("Acabou o espaço da agenda");
    }
}
