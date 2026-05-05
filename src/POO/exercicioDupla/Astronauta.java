package POO.exercicioDupla;

public class Astronauta extends Pessoa {
    private String especialidade;

    public Astronauta(int id, String nome, String especialidade) {
        super(id, nome);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public String toString() {
        String id = "";
        return "ID: " + getId() + " | Nome: " + getNome() + " | Especialidade: " + especialidade;
    }
}