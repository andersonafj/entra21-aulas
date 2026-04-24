package POO.Basico.exercicioDois;

public class PrincipalExercicioDois {
    static void main() {
        ContaBancaria cb = new ContaBancaria(100);

        System.out.println(cb.sacar(20));

        System.out.println(cb.sacar(30));

        System.out.println(cb.sacar(-10));

        System.out.println(cb.sacar(50));

        System.out.println(cb.sacar(10));
    }
}
