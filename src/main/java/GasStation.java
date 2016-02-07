
/**
 * Created by willhorton on 2/3/16.
 */
public class GasStation extends FuelStation {

    public String dispenseFuel(Car car, int amount) {

        String result = "";

        if(amount <= getFuelAvailable() && car instanceof Honda) {
            car.refuel(amount);
            result = "Refueled Honda with " + amount + " fuel units.";
        } else {
            result = "Insufficient fuel available in this station. Only " + getFuelAvailable() + " fuel units remaining.";
        }

        return result;

    }

}
