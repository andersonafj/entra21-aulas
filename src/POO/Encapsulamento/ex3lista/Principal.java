package POO.Encapsulamento.ex3lista;

public class Principal {
    static void main() {
        Identidade identidade = new Identidade("Anderson",123456789);

        System.out.println(identidade.getNome());
        System.out.println(identidade.getCpf());
    }
}
