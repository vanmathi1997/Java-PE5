import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SortSet {
    public ArrayList<String> sort(String[] input)//sort using treeset
    {
        Set set=new TreeSet();
        for(String i:input)
        {
            set.add(i);
        }return new ArrayList<>(set);//return the sorted list
    }
}
