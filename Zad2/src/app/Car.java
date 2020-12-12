package app;

public class Car extends WheelVehicle {
    private int doors;

    public Car(String fuel, int wheels, int doors) {
        super(fuel, wheels);
        this.doors = doors;
    }

    public Car(String fuel) {
        super(fuel);
    }


    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void printInfo() {
        System.out.println("Car info: \n" + "Fuel: " + getFuel() + " ,Wheels: " + getWheels() + " ,Doors: " + getDoors());
    }
}
