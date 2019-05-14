import Stalls.BeerStall;
import Others.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeerStallTest {

    Visitor visitorAdult;
    Visitor visitorChild;
    BeerStall beerStall;

    @Before
    public void before(){
        visitorAdult = new Visitor(30, 100.30, 180);
        visitorChild = new Visitor(10,15, 120);
        beerStall = new BeerStall("Beers and Beers", "Billy Beerman", 30, 70);
    }


    @Test
    public void hasName() {
        assertEquals("Beers and Beers", beerStall.getName(), 60);
    }

    @Test
    public void wontLetChildIn() {
        assertEquals(false, beerStall.isAllowedTo(visitorChild));
    }

    @Test
    public void willLetAdultIn() {
        assertEquals(true, beerStall.isAllowedTo(visitorAdult));
    }
}
