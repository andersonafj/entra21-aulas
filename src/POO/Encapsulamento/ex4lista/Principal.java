package POO.Encapsulamento.ex4lista;

public class Principal {
    public static void main(String[] args) {
        Idade idade = new Idade(33);

        System.out.println(idade.getAnos());

        idade.setAnos(75);
        idade.setAnos(200);
    }
}
