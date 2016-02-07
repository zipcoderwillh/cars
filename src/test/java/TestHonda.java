
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by willhorton on 2/3/16.
 */
public class TestHonda {

    Honda testCar;

    @Before
    public void initialize() {
        testCar = new Honda();
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
        assertEquals("Starting your Honda", testCar.turnOn());
        assertEquals("Turning off your Honda", testCar.turnOff());
    }

    @Test
    public void testDrive() {
        assertEquals("Honda must be on to drive", testCar.drive());
        testCar.turnOn();
        assertEquals("Driving your Honda", testCar.drive());
    }

}