import java.util.Scanner;

// Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida
//a distância total percorrida pelo automóvel e o total de combustível gasto;

public class App {
    static float mileage;
    static float fuel;
    static float middle;

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Qual a quilometragem percorrida, em km?");
            mileage = reader.nextFloat();
            System.out.println("Qual o consumo do combustível, em litros?");
            fuel = reader.nextFloat();
        }
        middle = mileage / fuel;
        System.out.format("O consumo médio é %.2f%n", middle);
    }
}
