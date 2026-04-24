package POO.Basico.exercicioUm;

public class Principal {
    static void main() {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Anderson";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Anderson2";

        aluno1.estudar();
        aluno2.estudar();
    }
}
