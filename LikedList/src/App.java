import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("Ford Mustang");
        cars.add("Shelby Cobra");
        cars.add("Chevrolet Camaro");

        cars.addFirst("Dodge Challenger");

        cars.addLast("Pontiac GTO");

        System.out.println(cars);

        cars.removeFirst();

        cars.removeLast();

        System.out.println(cars);

        System.out.println(cars.getFirst());

        System.out.println(cars.getLast());
    }
}
