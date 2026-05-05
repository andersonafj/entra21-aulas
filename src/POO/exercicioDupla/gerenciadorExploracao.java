package POO.exercicioDupla;

import java.util.ArrayList;
import java.util.List;

public class gerenciadorExploracao {

    private List<Missao> missoes = new ArrayList<>();
    private List<Nave> naves = new ArrayList<>();
    private List<Astronauta> astronautas = new ArrayList<>();

    private int idMissao = 1;
    private int idNave = 1;
    private int idAstronauta = 1;

    // ------------------ ADICIONAR ------------------

    public void adicionarMissao(String nome, String objetivo, String data, String status) {
        missoes.add(new Missao(idMissao++, nome, objetivo, data, status));
    }

    public void adicionarNave(String nome, String tipo, int capacidade) {
        Nave novaNave;

        if (tipo.equalsIgnoreCase("Tripulada")) {
            novaNave = new naveTripulada(idNave++, nome, tipo, capacidade);
        } else {
            novaNave = new naveCarga(idNave++, nome, tipo, capacidade);
        }

        naves.add(novaNave);
    }

    public void adicionarAstronauta(String nome, String especialidade) {
        astronautas.add(new Astronauta(idAstronauta++, nome, especialidade));
    }

    // ------------------ LISTAR ------------------

    public void listarMissoes() {
        if (missoes.isEmpty()) {
            System.out.println("Nenhuma missão cadastrada.");
        } else {
            missoes.forEach(System.out::println);
        }
    }

    public void listarNaves() {
        if (naves.isEmpty()) {
            System.out.println("Nenhuma nave cadastrada.");
        } else {
            naves.forEach(System.out::println);
        }
    }

    public void listarAstronautas() {
        if (astronautas.isEmpty()) {
            System.out.println("Nenhum astronauta cadastrado.");
        } else {
            astronautas.forEach(System.out::println);
        }
    }

    // ------------------ BUSCAR ------------------

    public Missao buscarMissao(int id) {
        return missoes.stream()
                .filter(m -> m.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Nave buscarNave(int id) {
        return naves.stream()
                .filter(n -> n.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Astronauta buscarAstronauta(int id) {
        return astronautas.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // ------------------ ASSOCIAÇÕES ------------------

    public void associarNaveAMissao(int idMissao, int idNave) {
        Missao missao = buscarMissao(idMissao);
        Nave nave = buscarNave(idNave);

        if (missao != null && nave != null) {
            missao.associarNave(nave);
            System.out.println("Nave associada com sucesso!");
        } else {
            System.out.println("Missão ou nave não encontrada.");
        }
    }

    public void associarAstronautaAMissao(int idMissao, int idAstronauta) {
        Missao missao = buscarMissao(idMissao);
        Astronauta astronauta = buscarAstronauta(idAstronauta);

        if (missao != null && astronauta != null) {
            missao.adicionarAstronauta(astronauta);
            System.out.println("Astronauta associado com sucesso!");
        } else {
            System.out.println("Missão ou astronauta não encontrado.");
        }
    }

    // ------------------ ATUALIZAR ------------------

    public void atualizarStatusMissao(int idMissao, String novoStatus) {
        Missao missao = buscarMissao(idMissao);

        if (missao != null) {
            missao.atualizarStatus(novoStatus);
            System.out.println("Status atualizado!");
        } else {
            System.out.println("Missão não encontrada.");
        }
    }
}