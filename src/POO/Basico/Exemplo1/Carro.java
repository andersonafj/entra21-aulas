package POO.Basico.Exemplo1;

public class Carro {
    String cor;
    String modelo;
    String marca;
    int ano;
    Pessoa dono;

    void ligar() {
        if (dono == null) {
            System.out.println("carro sem dono");

        }

         dono.apresentar();
         System.out.println("vrummm");

        }
    }