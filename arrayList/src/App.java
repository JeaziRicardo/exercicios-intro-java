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
            System.out.println("fiat");
        }
    }
}
