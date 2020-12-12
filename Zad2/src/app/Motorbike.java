package app;

public class Motorbike extends WheelVehicle {
    private String startType;

    public Motorbike(String fuel, int wheels, String startType) {
        super(fuel, wheels);
        this.startType = startType;
    }

    public Motorbike(String fuel) {
        super(fuel);
    }

    public String getStartType() {
        return startType;
    }

    public void setStartType(String startType) {
        this.startType = startType;
    }
}
