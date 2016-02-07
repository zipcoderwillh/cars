
/**
 * Created by willhorton on 2/3/16.
 */
public abstract class Car implements Driveable {

    private int fuelLevel = 10;
    boolean isOn = false;

    public String refuel(int newFuel) {

        String result = "";

        if(!isOn) {
            this.fuelLevel += newFuel;
            result = "Successfully refueled";
        } else {
            result = "Cannot refuel while car is on";
        }

        return result;

    }

    public int checkFuelLevel() {
        return fuelLevel;
    }

    abstract String turnOn();
    abstract String turnOff();


}
