package POO.Herança.exercicio2;

public class Principal {
    public static void main(String[] args) {
        Professor professor = new Professor("joaodasilva@hotmail.com","João da Silva","História ");

        professor.informacoesProfessor();

        System.out.println("E minha disciplina é: " + professor.getDisciplina());
    }
}
