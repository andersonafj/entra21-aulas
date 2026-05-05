package POO.Abstracao.Exemplo1.ClasseAbstrata.Exercicio1;

  class Gato extends Animal{

      public Gato (String nome){
          super (nome);
      }
  @Override
      public void emitirSom() {
          System.out.println(nome + " diz : COMPRE RACAO !");
  }
}
