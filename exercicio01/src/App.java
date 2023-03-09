import java.util.Scanner;

// Faça um algoritmo que receba dois números e exiba o resultado da sua soma;

public class App {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int total;

        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Informe o primeiro número.");
            numberOne = reader.nextInt();
            System.out.println("Informe o segundo número.");
            numberTwo = reader.nextInt();
        }
        total = numberOne + numberTwo;
        System.out.println("A soma é " + total);
    }
}
