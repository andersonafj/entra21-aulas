package POO.exercicioDupla;

import java.util.ArrayList;
import java.util.List;

public class Missao {
    private int id;
    private String nome;
    private String objetivo;
    private String dataLancamento;
    private String status;
    private Nave nave;
    private List<Astronauta> astronautas;

    public Missao(int id, String nome, String objetivo, String dataLancamento, String status) {
        this.id = id;
        this.nome = nome;
        this.objetivo = objetivo;
        this.dataLancamento = dataLancamento;
        this.status = status;
        this.astronautas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }

    public void atualizarStatus(String status) {
        this.status = status;
    }

    public void associarNave(Nave nave) {
        this.nave = nave;
    }

    public void adicionarAstronauta(Astronauta astronauta) {
        if (astronautas.size() >= 5) {
            System.out.println("Capacidade máxima atingida!");
            return;
        }
        astronautas.add(astronauta);
    }

    @Override
    public String toString() {
        String nomesAstronautas = astronautas.isEmpty() ? "N/A" :
                astronautas.stream()
                .map(a -> a.getNome() + " (" + a.getEspecialidade() + ")")
                .reduce((a, b) -> a + ", " + b)
                .orElse("N/A");

        return "ID: " + id +
                " | Nome: " + nome +
                " | Status: " + status +
                " | Nave: " + (nave != null ? nave.getNome() : "N/A") +
                " | Astronautas: " + nomesAstronautas;
    }
}