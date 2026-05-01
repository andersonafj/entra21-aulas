package POO.Abstracao.Exemplo2;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorDaCompra = sc.nextDouble();

        System.out.println("Escolha uma forma de pagamento; ");
        System.out.println("[1] - Pix");
        System.out.println("[2] - Boleto");
        int formadePagameto = sc.nextInt();
        if (formadePagameto == 1) {
            Pagamento pagamento = new Pix(valorDaCompra);
            pagamento.processar();
        } else if (formadePagameto == 2) {
            Pagamento pagamento = new Boleto(valorDaCompra);
            pagamento.processar();
        } else {
            System.out.println("Digite certo ai mano!");
        }
    }
}



