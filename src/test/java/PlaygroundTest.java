import Attractions.Playground;
import Others.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Visitor visitorAdult;
    Visitor visitorChild;
    Playground playground;

    @Before
    public void before(){
        visitorAdult = new Visitor(30, 100.30, 180);
        visitorChild = new Visitor(10,15, 120);
        playground = new Playground("Whirly Fun");
    }


    @Test
    public void hasName() {
        assertEquals("Whirly Fun", playground.getName());
    }

    @Test
    public void willLetChildIn() {
        assertEquals(true, playground.isAllowedTo(visitorChild));
    }

    @Test
    public void wontLetAdultIn() {
        assertEquals(false, playground.isAllowedTo(visitorAdult));
    }
}
