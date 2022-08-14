package first;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car(320, "Mercedes"));
        cars.add(new Car(180, "Citroen"));
        cars.add(new Car(213, "Jeep"));
        cars.add(new Car(242, "Audi"));
        cars.add(new Car(198, "Tesla"));
        cars.add(new Car(277, "BMW"));
        cars.add(new Car(188, "Ford"));
        cars.add(new Car(160, "Renault"));

        for (Car c: cars)
            System.out.println(c);

        cars.sort(new CarComparator());
        System.out.println();

        for (Car c: cars)
            System.out.println(c);
    }
}
