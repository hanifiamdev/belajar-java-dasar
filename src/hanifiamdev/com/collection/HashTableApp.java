package hanifiamdev.com.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {

        Map<String, String> map = new Hashtable<>();

        map.put("Hanif", "Java");
        map.put("Joko", "PHP");
        map.put("Budi", "Golang");

        for (var key : map.keySet()) {
            System.out.println(key);
        }
    }
}
