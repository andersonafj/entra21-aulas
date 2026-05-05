package POO.exercicioDupla;

    public class Principal {
        public static void main(String[] args) {

            gerenciadorExploracao g = new gerenciadorExploracao();

            g.adicionarMissao("Missão Marte", "Explorar", "2025-01-01", "Planejada");
            g.adicionarNave("Discovery", "Tripulada", 5);
            g.adicionarAstronauta("Neil Armstrong", "Comandante");

            g.associarNaveAMissao(1, 1);
            g.associarAstronautaAMissao(1, 1);

            g.listarMissoes();
        }
    }