package Basico;

import java.util.Scanner;

public class Excecao {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        try {
            double divisao = num1 / num2;
            System.out.println(divisao);
        } catch (ArithmeticException exception) {
            System.out.println("Não pode divir por zero!");
        }
    }
}
