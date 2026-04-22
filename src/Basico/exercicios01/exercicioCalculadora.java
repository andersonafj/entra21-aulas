package Basico.exercicios01;

import java.util.Scanner;

public class exercicioCalculadora {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num, result;

        do {
            System.out.println("\nMenu: ");
            System.out.println("\n1 - Soma");
            System.out.println("\n2 - Subtração");
            System.out.println("\n3 - Multiplicação");
            System.out.println("\n4 - Divisão");
            System.out.println("\n0 - Sair");

            num = sc.nextInt();

            if (num == 0) {
                System.out.println("Programa encerrado!");
                break;
            }
            if (num < 0 || num > 4) {
                System.out.println("Opção inválida, tente novamente!");
                continue;
            }
            System.out.println("Digite o primeiro número: ");
            int num1 = sc.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = sc.nextInt();

            switch(num) {
                case 1 :
                    result = num1 + num2;
                    System.out.println("Resultado: " + result);
                    break;
                case 2 :
                    result = num1 - num2;
                    System.out.println("Resultado: " + result);
                    break;
                case 3 :
                    result = num1 * num2;
                    System.out.println("Resultado: " + result);
                    break;
                case 4 :
                    result = num1 / num2;
                    System.out.println("Resultado: " + result);
                    break;
            } break;
        } while (num != 0);
    }
}
