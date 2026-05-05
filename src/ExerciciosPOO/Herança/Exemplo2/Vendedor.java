package ExerciciosPOO.Herança.Exemplo2;

public class Vendedor extends Funcionario{

    private double comissao ;

    public Vendedor (String nome, double salarioBase, double comissao){
        super (salarioBase, nome);
        this.comissao = comissao;

    }

    public double getSalarioTotal() {
        return this.getSalarioBase() + this.comissao;
    }
  }
