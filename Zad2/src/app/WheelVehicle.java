package app;

public class WheelVehicle extends  Vehicle{
    private int wheels;

    public WheelVehicle(String fuel, int wheels) {
        super(fuel);
        this.wheels = wheels;
    }

    public WheelVehicle(String fuel) {
        super(fuel);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;

    }

}
