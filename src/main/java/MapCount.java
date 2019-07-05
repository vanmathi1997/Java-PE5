import java.util.HashMap;
import java.util.Map;

public class MapCount {
    public Map count(String input)
    {String string="";
       String[] list= input.split("[\\W_]+");
        Map<String, Integer> hm=new HashMap<String,Integer>();
        for(String i:list)//count the occurance
        {
            Integer j=hm.get(i);
            hm.put(i,(j==null)?1:j+1);

        }return hm;
    }
}
