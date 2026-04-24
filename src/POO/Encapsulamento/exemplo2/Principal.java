package POO.Encapsulamento.exemplo2;

public class Principal {
    static void main() {
        Estudante estudante = new Estudante("1");
        Estudante estudante1 = new Estudante("1",2);

        estudante.adicionarNotas(0,10);
        estudante.adicionarNotas(1,10);
        System.out.println(estudante.calcularMedia());
    }
}
