package POO.Polimorfismo.Exemplo1;

public class Principal {
    public static void main(String[] args) {
        Animal AnimalGenerico = new Animal();
        Animal rex  = new Cachorro();
        Animal sushi = new Gato();

        AnimalGenerico.emitirSom();
        rex.emitirSom();
        sushi.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.perserguirCarteiro();

    }

}
