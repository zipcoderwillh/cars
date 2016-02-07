
import java.util.ArrayList;

/**
 * Created by willhorton on 2/3/16.
 */
public class Honda extends Car {

    public String drive() {

        String result = "";

        if(checkFuelLevel() > 0 && isOn) {
            result = "Driving your Honda";
        } else {
            result = "Honda must be on to drive";
        }

        return result;

    }

    public String turnOn() {

        String result = "";

        if( checkFuelLevel() > 0 && !isOn ) {
            result = "Starting your Honda";
            isOn = true;
        } else if(isOn) {
            result = "Honda is already on";
        } else {
            result = "Honda is out of fuel";
        }

        return result;

    }

    public String turnOff() {
        return "Turning off your Honda";
    }

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<Car>();
        //cars.add(new Honda());
        cars.add(new Prius());
        cars.add(new Tesla());
        GasStation gasStation = new GasStation();
        PowerStation powerStation = new PowerStation();

        //System.out.println(powerStation.dispenseFuel(cars.get(0), 2));

        Car tesla = new Tesla();
        //Car honda = new Honda();
        System.out.println(powerStation.dispenseFuel(tesla, 4));
        //System.out.println(powerStation.dispenseFuel(honda, 4));

        /*
        for (Car car : cars) {
            System.out.println(car.turnOn());
            System.out.println(car.drive());

            powerStation.dispenseFuel( ((ElectricCar)car), 6);
            gasStation.dispenseFuel(car, 5);

            System.out.println(car.drive());
            System.out.println(car.checkFuelLevel());
        }
        */


    }

}
