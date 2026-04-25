package POO.Encapsulamento.ex4lista;

public class Idade {
    private int anos;

    public Idade(int anos) {
        this.anos = anos;
    }

    public void setAnos(int anos) {
        if (anos < 0 || anos > 150) {
            System.out.println("Idade inválida");
        } else {
            this.anos = anos;
        }
    }
    public int getAnos() {
        return anos;
    }
}
