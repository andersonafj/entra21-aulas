package POO.Encapsulamento.exemplo1;

public class Principal {
    static void main() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(null);
        pessoa.setNome("");
        pessoa.setNome("Anderson");

        pessoa.apresentar();
    }
}
