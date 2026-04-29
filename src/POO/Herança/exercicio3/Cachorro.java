package POO.Herança.exercicio3;

public class Cachorro extends Animal {
    private String raca;

    @Override
    public void informacoesPet() {
        super.informacoesPet();
        System.out.println("Raça: " + this.raca);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }
}
