import java.util.Scanner;

/*
    Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
    No final informar o nome do aluno e a sua média (aritmética);
 */

public class App {
    public static void main(String[] args) {
        String name;
        float grade01;
        float grade02;
        float grade03;
        float average;

        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Informe o nome do aluno");
            name = reader.nextLine();
            System.out.println("Informe a primeira nota do aluno");
            grade01 = reader.nextFloat();
            System.out.println("Informe a segunda nota do aluno");
            grade02 = reader.nextFloat();
            System.out.println("Informe a terceira nota do aluno");
            grade03 = reader.nextFloat();
        }
        average = (grade01 + grade02 + grade03) / 3;

        System.out.format("O aluno %s teve a média de %.2f%n", name, average);
    }
}
