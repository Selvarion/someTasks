package app;

public class Boat extends Vehicle {
    private double displacemnet;

    public Boat(String fuel, double displacemnet) {
        super(fuel);
        this.displacemnet = displacemnet;
    }

    @Override
    public void moveType() {
        System.out.println("The boat is sailing on the sea");
    }

    @Override
    public void printInfo() {
        System.out.println("Boat info: \n" + "Fuel: " + getFuel() + " ,Displacement: " + getDisplacemnet());
    }

    public double getDisplacemnet() {
        return displacemnet;
    }

    public void setDisplacemnet(double displacemnet) {
        this.displacemnet = displacemnet;
    }
}
