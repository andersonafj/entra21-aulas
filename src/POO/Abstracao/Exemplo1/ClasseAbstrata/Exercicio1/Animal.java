package POO.Abstracao.Exemplo1.ClasseAbstrata.Exercicio1;

abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;

    }

    public abstract void emitirSom();
}