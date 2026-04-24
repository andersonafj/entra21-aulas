package POO.Basico.Exemplo1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Fernando" ,18);


        Pessoa pessoa2 = new Pessoa("Luigi" , 58);


        pessoa1.apresentar();
        pessoa2.apresentar();

        Carro carro1 = new Carro();
        carro1.ano = 1994;
        carro1.cor = "vermelho";
        carro1.marca = "Mazda";
        carro1.modelo = "Miada MX-5";
        carro1.dono = pessoa1;

        carro1.ligar();
    }
}


