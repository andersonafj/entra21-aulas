package POO.Abstracao.Exemplo1.ClasseAbstrata.Exercicio1;

public class Principal {
    static void main(String[]args) {
        Animal cachorro = new Cachorro("Bob");
        Animal gato = new Gato("Garfield");

        cachorro.emitirSom();
        gato.emitirSom();
    }
}
