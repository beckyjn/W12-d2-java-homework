import Attractions.Rollercoaster;
import Others.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {
    Visitor tallAdult;
    Visitor shortAdult;
    Visitor tallChild;
    Visitor smallChild;
    Rollercoaster rollercoaster;

    @Before
    public void before(){
        tallAdult = new Visitor(28, 40, 180);
        shortAdult = new Visitor(40, 40, 144);
        tallChild = new Visitor(11, 10, 146);
        smallChild = new Visitor(5, 10, 100);
        rollercoaster = new Rollercoaster("Infinite Tape Hole");
    }

    @Test
    public void hasName() {
        assertEquals("Infinite Tape Hole", rollercoaster.getName());
    }

    @Test
    public void willLetTallAdultRide() {
        assertEquals(true, rollercoaster.isAllowedTo(tallAdult));
    }

    @Test
    public void wontLetShortAdultRide() {
        assertEquals(false, rollercoaster.isAllowedTo(shortAdult));
    }

    @Test
    public void wontLetTallChildRide() {
        assertEquals(false, rollercoaster.isAllowedTo(tallChild));
    }

    @Test
    public void wontLetTinyChildRide() {
        assertEquals(false, rollercoaster.isAllowedTo(smallChild));
    }
}
