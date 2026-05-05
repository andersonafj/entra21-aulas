package ExerciciosPOO.Herança.Exemplo3;

public class Livro extends Produto {

    private String autor;

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Autor: " + this.autor);
    }
}
