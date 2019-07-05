import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayMap {

    public Map count(String[] inputString) {
            Map<String, Integer> original = new HashMap<String, Integer>();
            Map<String, Boolean> result = new HashMap<String, Boolean>();
            for ( String word : inputString ) {//count the occurence
                Integer Count = original.get(word);
                if (Count == null) {
                    Count = 0;
                }
                original.put(word, Count + 1);
                if((Count + 1) == 1)
                {
                    result.put(word, false); //insert false if the word occurs only once
                }
                else
                {
                    result.put(word, true); //insert true if the word occurs multiple times
                }
            }
            return result;
        }
    }

