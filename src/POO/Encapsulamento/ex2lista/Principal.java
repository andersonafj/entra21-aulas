package POO.Encapsulamento.ex2lista;

public class Principal {
    static void main() {

        Carro carro = new Carro("Fiat", "Uno");

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());

        carro.setModelo("Hilux");
        System.out.println(carro.getModelo());

        carro.setMarca("Volkswagen");
        System.out.println(carro.getMarca());

    }
}
