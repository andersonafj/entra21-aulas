package Basico.Encapsulamento.Ex3.ListaExer;

public class Pessoa {
  private String nome;
  int idade;

  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  void exibirDados() {
    System.out.println("Nome: " + this.nome);
    System.out.println("idade: " + this.idade + "anos");

  }


  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa ("Rita Maria", 34);
    Pessoa pessoa2 = new Pessoa  ("Julio Eduardo", 39);

    System.out.println("exiba os Dados da pessoa1");

  }
}