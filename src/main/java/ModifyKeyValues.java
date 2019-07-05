import java.util.Map;
import java.util.Set;

public class ModifyKeyValues {
    public Map<String, String> modifyKey(Map<String,String> input)
    {
        Set keys=input.keySet();
        String value1 = (String) input.get("val1");
        input.replace("val1","");
        input.replace("val2",value1);


        return input;

    }
}
