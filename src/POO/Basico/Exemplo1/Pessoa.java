package POO.Basico.Exemplo1;

import java.security.PublicKey;

public class Pessoa {
    String nome;
    int idade;
    double peso ;

    //CONSTRUTOR VAZIO
    public Pessoa (){}

    //CONSTRUTOR COM PARAMETROS
    public Pessoa(String nome, int idade) {
        this.nome = nome;
         this.idade = idade;

    }

    void apresentar() {
        System.out.println("Olá meu nome é " + this.nome);
    }
}
