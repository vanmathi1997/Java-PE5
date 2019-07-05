import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortSetTest {
    SortSet obj;
    @Before
    public void setUp()
    {
        obj=new SortSet();
    }
    @After
    public void tearDown()
    {
        obj=null;
    }
    @Test
    public void givenArrayShouldReturnResult() {//test case for array sort
        String[] array = {"Harry", "Olive", "Alice", "Bluto", "Eugene"};
        ArrayList expected = new ArrayList();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        ArrayList result = obj.sort(array);
        assertEquals(expected, result);
    }
    @Test(expected = NullPointerException.class)//test case for null pointer exception
    public void givenNullShouldReturnException() {
        obj.sort(null);

    }
    @Test
    public void givenArrayShouldReturnSame() {//test case for assert not equals
        String[] array = {"Alice", "Bluto", "Eugene", "Harry", "Olive"};
        ArrayList expected = new ArrayList();
        expected.add("Alice");
        expected.add("Bluto");
        ArrayList result = obj.sort(array);
        assertNotEquals(expected, result);
    }
}