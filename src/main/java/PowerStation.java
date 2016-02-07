
/**
 * Created by willhorton on 2/3/16.
 */
public class PowerStation extends FuelStation {

    public String dispenseFuel(Car car, int amount) {

        String result = "";

        if(amount <= getFuelAvailable() && car instanceof ElectricCar) {
            car.refuel(amount);
            result = "Refueled electric car with " + amount + " fuel units.";
        } else {
            result = "Insufficient fuel available in this station. Only " + getFuelAvailable() + " fuel units remaining.";
        }

        return result;

    }

}
