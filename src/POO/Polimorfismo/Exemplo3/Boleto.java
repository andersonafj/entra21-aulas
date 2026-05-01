package POO.Polimorfismo.Exemplo3;

public class Boleto extends MetodoPagamento{

    @Override
    public void pagarAVista() {

    }

    @Override
    public void pagarAvista() {
        System.out.println("Pagando com Boleto!");

    }
}
