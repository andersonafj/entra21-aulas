package POO.Herança.exercicio2;

public class Pessoa {
    private String nome;
    private String email;

    public Pessoa(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void informacoesProfessor() {
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
    }
}
