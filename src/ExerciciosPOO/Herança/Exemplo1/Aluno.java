package ExerciciosPOO.Herança.Exemplo1;

public class Aluno extends Pessoa {

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public Aluno(int idade, String nome, String matricula) {
        super(nome,idade);
        this.matricula = matricula;

    }

    public void apresentar() {
        System.out.println("Meu nome é: "+ super.getNome() + " e sou aluno!") ;
    }
}
