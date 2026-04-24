package POO.Basico.exercicios;

public class ContaBancaria {
    double saldo;

    public ContaBancaria (double saldo) {
        if (saldo <=0){
            System.out.println("Saldo invalido");
            throw new IllegalArgumentException();
        }
        this.saldo = saldo;
    }

    void depositar (double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido");
        }else if (valor>saldo) {
            System.out.println("Saldo insuficiente!");
        }else {
            this.saldo = this.saldo - valor;
        }
    }

    String sacar (double valor ) {
        if (valor <= 0){
            return "Valor inválido";
        }else if (valor > saldo){
            return "Saldo insificiente";
        }else{
            this.saldo = this.saldo - valor;
            return "Saque efetuado, seu novo saldo é "+ this.saldo;
        }
    }
}

