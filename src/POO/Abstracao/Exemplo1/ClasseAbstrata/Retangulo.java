package POO.Abstracao.Exemplo1.ClasseAbstrata;

public class Retangulo extends FormaGeometricaAbstract{
   private double altura;
   private double largura;

   public Retangulo(double altura, double largura){

   }

    @Override
    double calcularArea(){
        return altura * largura;

    }

}
