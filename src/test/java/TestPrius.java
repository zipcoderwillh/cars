
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by willhorton on 2/3/16.
 */
public class TestPrius {

    Prius testCar;

    @Before
    public void initialize() {
        testCar = new Prius();
    }

    @Test
    public void testRefuel() {
        assertEquals(10, testCar.checkFuelLevel());
        testCar.refuel(5);
        assertEquals(15, testCar.checkFuelLevel());
        testCar.turnOn();
        assertEquals("Cannot refuel while car is on", testCar.refuel(5));
        assertEquals(15, testCar.checkFuelLevel());
    }

    @Test
    public void testOffOn() {
        assertEquals("Starting your Prius", testCar.turnOn());
        assertEquals("Turning off your Prius", testCar.turnOff());
    }

    @Test
    public void testDrive() {
        assertEquals("Prius must be on to drive", testCar.drive());
        testCar.turnOn();
        assertEquals("Driving your Prius", testCar.drive());
    }

}
