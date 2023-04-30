import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo XC90");
        cars.add("BMW X5");
        cars.add("Ford Mustang");
        cars.add("Fiat Uno");

        cars.set(3, "Fiat Fastback");

        cars.remove("BMW X5");

        cars.add(JOptionPane.showInputDialog("Digite o nome do carro: "));

        System.out.println(cars);
        /*
        cars.clear();

        System.out.println(cars);

        if (cars.isEmpty()) {
            System.out.println("A lista de carros está vazia");
        } else {
            System.out.println("A lista de carros não está vazia");
        }
        */
        if (cars.contains("Fiat Fastback")) {
            for (int index = 0; index < cars.size(); index += 1) {
                if ("Fiat Fastback".equals(cars.get(index))) {
                    cars.set(index, "Lamborghini Urus");
                }
            }
        } else {
            System.out.println("O carro não foi encontrado");
        }

        System.out.println(cars);
    }
}
