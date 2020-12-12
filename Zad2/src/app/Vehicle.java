package app;

public abstract class Vehicle {

    private String fuel;

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
    public void moveType(){
        System.out.println("The vehicle is moving");
    }
    public void printInfo(){
        System.out.println("Vehicle info: \n" + "Fuel: " + getFuel());
    }

    public Vehicle(String fuel) {
        this.fuel = fuel;
    }
}
