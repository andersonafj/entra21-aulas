package ExerciciosPOO.Herança.Exemplo2;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(double salarioBase, String nome) {
        this.salarioBase = salarioBase;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}