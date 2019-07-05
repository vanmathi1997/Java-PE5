import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapCountTest {
    MapCount obj;
    @Before
    public void setUp()
    {
        obj=new MapCount();
    }
    @After
    public void tearDown()
    {
        obj=null;
    }
    @Test
    public void givenStringShouldReturnCount(){
        Map<String,Integer> result=obj.count("one one -one___two,,three,one @three*one?two");
        Map<String,Integer> expected=new HashMap<>();
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",2);
        assertEquals(expected,result);
    }
    @Test(expected = NullPointerException.class)
    public void givenNullShouldReturnNull(){
        Map<String,Integer> result=obj.count(null);

    }
    @Test
    public void no_of_count1() {
        String str = "one@one -@one___two,,three,one @three**************one?two";
        HashMap<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("a", 5);
        expected.put("b", 2);
        expected.put("c", 2);
        Map<String, Integer> result = obj.count(str);
        assertNotEquals(expected, result);
    }

}