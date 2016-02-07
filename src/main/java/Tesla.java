
/**
 * Created by willhorton on 2/3/16.
 */
public class Tesla extends ElectricCar {

    public String drive() {

        String result = "";

        if(checkFuelLevel() > 0 && isOn) {
            result = "Driving your Tesla";
        } else {
            result = "Tesla must be on to drive";
        }

        return result;

    }

    public String turnOn() {

        String result = "";

        if( checkFuelLevel() > 0 && !isOn ) {
            result = "Starting your Tesla";
            isOn = true;
        } else if(isOn) {
            result = "Tesla is already on";
        } else {
            result = "Tesla is out of fuel";
        }

        return result;

    }

    public String turnOff() {
        return "Turning off your Tesla";
    }

}
