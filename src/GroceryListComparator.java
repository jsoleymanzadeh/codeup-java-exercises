import java.util.Comparator;
import java.util.HashMap;

public class GroceryListComparator implements Comparator<HashMap<String, String>> {
    public int compare(HashMap<String, String> item1, HashMap<String, String> item2) {
        return item1.get("name").compareTo(item2.get("name"));
    }
}