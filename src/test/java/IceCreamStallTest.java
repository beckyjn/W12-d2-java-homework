import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Isla's Ices", "Isla Indigo", 15, 70);
        }

    @Test
    public void canGetName() {
        assertEquals("Isla's Ices", iceCreamStall.getName());
    }

    @Test
    public void canGetOwner() {
        assertEquals("Isla Indigo", iceCreamStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(15, iceCreamStall.getParkingSpot());
    }

    @Test
    public void canGetRating() {
        assertEquals(70, iceCreamStall.getRating());
    }
}
