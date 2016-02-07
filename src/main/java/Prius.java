
/**
 * Created by willhorton on 2/3/16.
 */
public class Prius extends ElectricCar {

    public String drive() {

        String result = "";

        if(checkFuelLevel() > 0 && isOn) {
            result = "Driving your Prius";
        } else {
            result = "Prius must be on to drive";
        }

        return result;

    }

    public String turnOn() {

        String result = "";

        if( checkFuelLevel() > 0 && !isOn ) {
            result = "Starting your Prius";
            isOn = true;
        } else if(isOn) {
            result = "Prius is already on";
        } else {
            result = "Prius is out of fuel";
        }

        return result;

    }

    public String turnOff() {
        return "Turning off your Prius";
    }

}
