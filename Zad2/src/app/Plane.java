package app;

public class Plane extends Vehicle {
    private int numberOfSeats;

    public Plane(String fuel, int numberOfSeats) {
        super(fuel);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void moveType() {
        System.out.println("The plane is flying int the sky");
    }

    @Override
    public void printInfo() {
        System.out.println("Plane info: \n" + "Fuel: " + getFuel() + " ,Number of seats: " + getNumberOfSeats());
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
