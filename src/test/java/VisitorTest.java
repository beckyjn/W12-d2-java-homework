import Others.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(25, 49.50, 170);
    }

    @Test
    public void visitorHasAge() {
        assertEquals(25, visitor.getAge());
    }

    @Test
    public void visitorHasMoney() {
        assertEquals(49.50, visitor.getMoney(), 0.1);
    }

    @Test
    public void visitorHasHeight() {
        assertEquals(170, visitor.getHeight());
    }
}
