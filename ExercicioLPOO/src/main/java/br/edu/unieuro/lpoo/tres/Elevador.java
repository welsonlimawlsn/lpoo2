package br.edu.unieuro.lpoo.tres;

public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int totalPessoas;

    public static Elevador inicializa(int capacidade, int totalAndares) {
        Elevador elevador = new Elevador();
        elevador.setCapacidade(capacidade);
        elevador.setTotalAndares(totalAndares);
        return elevador;
    }

    public void entra() throws Exception {
        if (totalPessoas == capacidade) {
            throw new Exception("Elevador já chegou na sua capacidade máxima.");
        }
        totalPessoas++;
    }

    public void sai() throws Exception {
        if (totalPessoas == 0) {
            throw new Exception("Elevador está vazio.");
        }
        totalPessoas--;
    }

    public void sobe() throws Exception {
        if (andarAtual == totalAndares) {
            throw new Exception("O elevador já está no andar mais alto.");
        }
        andarAtual++;
    }

    public void dece() throws Exception {
        if (andarAtual == 0) {
            throw new Exception("O elevador já se encontra no terreo.");
        }
        andarAtual--;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getTotalPessoas() {
        return totalPessoas;
    }

    public void setTotalPessoas(int totalPessoas) {
        this.totalPessoas = totalPessoas;
    }

    @Override
    public String toString() {
        return "Elevador{" +
                "andarAtual=" + andarAtual +
                ", totalAndares=" + totalAndares +
                ", capacidade=" + capacidade +
                ", totalPessoas=" + totalPessoas +
                '}';
    }
}
