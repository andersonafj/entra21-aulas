package POO.Polimorfismo.ExerciciosAnimaisesons;

public class Principal {

    static void main(String[] args) {
        Animal animal;

        animal = new Cachorro();
        animal.emitirSom();

        animal = new Gato();
        animal.emitirSom();



    }
}
