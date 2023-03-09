import java.util.Scanner;

/*
Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
 */

public class App {
    static String name;
    static float salary;
    static float sales;
    static float totalSalary;

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Qual o nome do vendedor?");
            name = reader.nextLine();
            System.out.println("Qual o salário fixo?");
            salary = reader.nextFloat();
            System.out.println("Qual o total de vendas desse vendedor?");
            sales = reader.nextFloat();
        }
        totalSalary = salary + (sales * 0.15f);
        System.out.println("O vendedor " + name + " recebe o salario fixo de R$" + salary + " e um salario total de R$" + totalSalary);
    }
}
