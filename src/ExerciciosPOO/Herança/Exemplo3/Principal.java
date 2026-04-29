package ExerciciosPOO.Herança.Exemplo3;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Boneco de brinquedo");
        produto.setPreco(100d);

        produto.exibirInformacoes();

        System.out.println("==============");

        Livro livro = new Livro();
        livro.setNome("Enão sobrou ninguém");
        livro.setPreco(59.90d);
        livro.setAutor("Agatha Chistie");

        livro.exibirInformacoes();
    }
}


