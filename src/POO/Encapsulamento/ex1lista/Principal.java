package POO.Encapsulamento.ex1lista;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis");

        System.out.println(livro.getTitulo());
        System.out.println(livro.getAutor());
    }
}
