package POO.Basico.Polimorfismo.Exemplo3;

public class CartaoCredito extends MetodoPagamento{
    @Override
    public void pagarAVista(){
        System.out.println("Pagando com Cartao de Credito");
       }

    @Override
    public void pagarAvista() {

    }
}
