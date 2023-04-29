import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo XC90");
        cars.add("BMW X5");
        cars.add("Ford Mustang");
        cars.add("Fiat Uno");

        cars.set(3, "Fiat Fastback");

        cars.remove("BMW X5");

        System.out.println(cars);
    }
}
