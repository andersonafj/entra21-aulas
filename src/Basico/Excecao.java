package Basico;

import java.util.Scanner;

public class Excecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite outro numero:");
        num2 = scanner.nextInt();

        try {

            double divisão = num1 / num2;
            System.out.println(divisão);
        } catch (ArithmeticException exception) {
            System.out.println("Não pode dividir por zero, bobão");

        }
    }
}
