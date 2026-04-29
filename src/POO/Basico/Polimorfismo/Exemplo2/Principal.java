package POO.Basico.Polimorfismo.Exemplo2;

public class Principal {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        gerente.setSalarioBase(10_000d);

        System.out.println("O salario do gerente é : " + gerente.calcularPagamento());

        Funcionario funcionarioComum = new Funcionario();
        funcionarioComum.setSalarioBase(3000d);
        System.out.println("O salario do funcionario é: " + funcionarioComum.calcularPagamento());

        Funcionario vendedor = new Vendedor(2000d, 3000d);
        System.out.println("o salario do vendedor é: " + vendedor.calcularPagamento());
        vendedor.setSalarioBase(2000d);

    }

}
