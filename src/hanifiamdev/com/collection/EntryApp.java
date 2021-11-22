package hanifiamdev.com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Hanif", "Java");
        map.put("Joko", "Phyton");
        map.put("Budi", "Golang");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for(var entry : entries) {
            System.out.println(entry.getKey() +  " : " + entry.getValue());
        }
    }
}
