package hanifiamdev.com.collection;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class EnumHashMapApp {
    public static  enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<Level, String>(Level.class);
        map.put(Level.FREE, "Hanif");
        map.put(Level.VIP, "Amrullah");

        for (var key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }

}
