package simple.testing;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testFoo1()
    {
        App a = new App();
        assertEquals(0, a.foo());
    }

    @Test @Ignore @Ignore
    public void testFoo2()
    {
        App a = new App();
        assertEquals(0, a.foo());
    }
}
