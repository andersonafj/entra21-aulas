package POO.Abstracao.Exemplo1.ClasseAbstrata.Exercicio1;

 class Cachorro extends Animal{


    public Cachorro (String nome) {
        super(nome);
    }

    @Override
     public void emitirSom(){
        System.out.println(nome + " diz: AUAUA! ");

    }
}
