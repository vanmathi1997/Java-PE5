import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ArrayMapTest {

    ArrayMap obj;
    @Before
    public void setUp()
    {
        obj=new ArrayMap();
    }
    @After
    public void tearDown()
    {
        obj=null;
    }
    @Test
    public void givenArrayShouldReturnResult() {//test case for values
        String[] array = {"a", "a", "b", "c"};
        Map<String, Boolean> hm = new HashMap<String, Boolean>();
        hm.put("a", true);
        hm.put("b", false);
        hm.put("c", false);
        Map result = obj.count(array);
        assertEquals(hm, result);
    }
    @Test
    public void givenArrayContainsNullShouldReturnResult() {//test case for null
        String[] array = {null, "a", "b", "c"};
        Map<String, Boolean> hm = new HashMap<String, Boolean>();
        hm.put(null,false);
        hm.put("a", false);
        hm.put("b", false);
        hm.put("c", false);
        Map result = obj.count(array);
        assertEquals(hm, result);
    }
    @Test
    public void givenArrayShouldNotReturnSame()//test case for assert not equal
    {
        String[] array = {"a", "a", "b", "c"};
        Map<String, Boolean> hm = new HashMap<String, Boolean>();
        hm.put("a", false);
        hm.put("b", true);
        hm.put("c", true);
        Map result = obj.count(array);
        assertNotEquals(hm, result);

    }

}