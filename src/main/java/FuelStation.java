
/**
 * Created by willhorton on 2/3/16.
 */
abstract class FuelStation {

    private int fuelAvailable = 10;

    public int getFuelAvailable() {
        return fuelAvailable;
    }

    abstract String dispenseFuel(Car car, int amount);

}