import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayTest {
    Array obj;
    @Before
    public void setUp()
    {
      obj=new Array();
    }
    @After
    public void tearDown()
    {
        obj=null;
    }
    @Test
    public void givenListShouldReturnUpdatedList()//test case to update value
    {
        List<String> elements=new ArrayList<>();
        elements.add("first");
        elements.add("second");
        elements.add("third");
        elements.add("last");
        List<String> expected=new ArrayList<String>();
        expected.add("updated first value");
        expected.add("second");
        expected.add("third");
        expected.add("last");
        List<String> result=obj.update(elements,"first");
        assertEquals(expected,result);
    }
    @Test
    public void givenListShouldReturnEmptyList()//test case to clear all values
    {
        List<String> elements=new ArrayList<>();
        elements.add("first");
        elements.add("second");
        elements.add("third");
        elements.add("last");
        List<String> result=obj.remove(elements);
        List<String> expected=new ArrayList<>();
    assertEquals(expected,result);
    }
    @Test
    public void givenListShouldNotReturnSameList()//test case to check it doesn't return values
    {
        List<String> elements=new ArrayList<>();
        elements.add("first");
        elements.add("second");
        elements.add("third");
        elements.add("last");
        List<String> result=obj.remove(elements);
        assertNotEquals("first",result);
    }
    @Test(expected = NullPointerException.class)
    public void givenListOfNullShouldReturnNull()//test case for  null
    {
        List<String> elements=new ArrayList<>(null);
        obj.remove(elements);
    }

}