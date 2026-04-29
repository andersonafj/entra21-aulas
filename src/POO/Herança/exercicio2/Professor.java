package POO.Herança.exercicio2;

public class Professor extends Pessoa {

    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor(String email, String nome, String disciplina) {
        super(email, nome);
        this.disciplina = disciplina;
    }
    }

