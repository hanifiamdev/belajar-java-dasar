package hanifiamdev.com.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "Fachri");
        map.put("last", "Amrullah");
        map.put("middle", "Mufhti");

        Set<String> keys = map.keySet();
        for(var key : keys) {
            System.out.println(key); // urutannya bisa predeksi dan pasti FIFO, beda klw hashMap
        }

    }
}
