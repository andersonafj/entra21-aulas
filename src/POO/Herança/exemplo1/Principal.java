package POO.Herança.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Noah",3,"ajsdfnoiuasnf");

        aluno.apresentar();

        System.out.println("Nome aluno: " + aluno.getNome());
        System.out.println("Idade aluno: " + aluno.getIdade());
        System.out.println("Matrícula aluno: " + aluno.getMatricula());
    }
}
