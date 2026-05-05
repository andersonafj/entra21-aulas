package POO.exercicioDupla;

public class naveCarga extends Nave {

    public naveCarga(int id, String nome, String tipo, int capacidade) {
        super(id, nome, tipo, capacidade);
    }

    @Override
    public void executarMissao() {
        System.out.println("Transportando carga...");
    }
    }

