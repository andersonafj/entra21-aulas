package POO.Encapsulamento.ex3lista;

public class Identidade {
    private String nome;
    private int cpf;

    public Identidade(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public int getCpf() {
        return cpf;
    }
}
