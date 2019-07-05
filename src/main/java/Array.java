import java.util.ArrayList;
import java.util.List;

public class Array {
    public List update(List<String> elements,String check) {//for updating the value
       int i=elements.indexOf(check);
        elements.set(i,"updated first value");
        return elements;
    }

    public List remove(List<String> elements)//for removing the elements
    {
    elements.clear();
    return elements;
}
}
