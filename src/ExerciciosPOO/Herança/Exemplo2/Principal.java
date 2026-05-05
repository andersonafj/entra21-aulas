package ExerciciosPOO.Herança.Exemplo2;

public class Principal {

        public static void main (String[] args) {
            Vendedor vendedor = new Vendedor(
                    "Jean", 100_000d, 500_000d);
            System.out.println("O salario total de "  + vendedor.getNome() + "é"  +
                    vendedor.getSalarioTotal ());
        }
    }

