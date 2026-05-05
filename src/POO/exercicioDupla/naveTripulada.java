package POO.exercicioDupla;

public class naveTripulada extends Nave {
    public naveTripulada(int id, String nome, String tipo, int capacidade) {
        super(id, nome, tipo, capacidade);
    }

    @Override
    public void executarMissao() {
        System.out.println("Missão com astronautas em andamento!");
    }
}