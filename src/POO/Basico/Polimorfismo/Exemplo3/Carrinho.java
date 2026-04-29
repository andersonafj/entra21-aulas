package POO.Basico.Polimorfismo.Exemplo3;

public class Carrinho {

    private double valorCompra;

    public Carrinho(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void realizarCompra(MetodoPagamento metodoPagamento) {
        metodoPagamento.pagaraVista();
        System.out.println("Compra realizada com sucesso");
    }
}
