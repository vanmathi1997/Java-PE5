import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyKeyValuesTest {

    ModifyKeyValues obj;
    @Before
    public void setUp()
    {
        obj=new ModifyKeyValues();
    }
    @After
    public void tearDown()
    {
        obj=null;
    }
    @Test
    public void givenMaphouldReturnModifiedMap()//test case for modified key
    {
        Map<String,String> map=new HashMap<String,String>();
        map.put("val1","java");
        map.put("val2","c++");
        Map<String,String> expected=new HashMap<String,String>();
        expected.put("val1","");
        expected.put("val2","java");
        Map result=obj.modifyKey(map);
        assertEquals(expected,result);

    }
    @Test
    public void givenMapShouldNotReturnSameMap()//test case for not returning same value
    {
        Map<String,String> map=new HashMap<String,String>();
        map.put("val1","java");
        map.put("val2","c++");
        Map<String,String> expected=new HashMap<String,String>();
        expected.put("val1","java");
        expected.put("val2","c++");
        Map result=obj.modifyKey(map);
        assertNotEquals(expected,result);

    }
    @Test(expected = NullPointerException.class)//test case for null pointer exception
    public void givenNullShouldReturnNull()
    {
        Map<String,String> map=new HashMap<String,String>(null);
        obj.modifyKey(map);

    }


}