package app;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Diesel", 4, 5);
        car.printInfo();

        Boat boat = new Boat("Diesel", 50000.0);
        boat.printInfo();

        Plane plane = new Plane("Diesel",40);
        plane.printInfo();
    }
}
