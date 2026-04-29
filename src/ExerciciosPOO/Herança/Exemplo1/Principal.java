package ExerciciosPOO.Herança.Exemplo1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa  = new Pessoa ( "Fernando", 18);
        Aluno aluno  = new Aluno ( 18, "Luigi" ,"hbvxcvlxnv");

        aluno.apresentar();

        System.out.println("Nome aluno: " + aluno.getNome());
        System.out.println("Idade aluno: " + aluno.getIdade());
        System.out.println("Matricula aluno: " + aluno.getMatricula());

    }
}
