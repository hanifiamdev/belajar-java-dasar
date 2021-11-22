package hanifiamdev.com.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Hanif", "Hanif");
        map.put("Joko", "Joko");
        map.put("Budi", "Budi");

        for (var key : map.keySet()) {
            System.out.println(key); //secara otomatis akan diurutkan
        }

        System.out.println("==================================");
        System.out.println(map.lowerKey("Hanif")); //key ang kurang dari Hanif
        System.out.println(map.higherKey("Hanif")); //key yang lebih dari Hanif
        System.out.println(map.higherKey("Hanif")); //key yang lebih dari Hanif
        System.out.println(map.floorKey("Nugroho")); //key kurang dari Nugaraha atau N adalah Joko, walupun Nugraha tidak ada di Map tetaep bisa di dapat hasilnya
        System.out.println(map.ceilingKey("Nugroho")); //key lebih dari Nugaraha atau N adalah null

        System.out.println("==================================");
        NavigableMap<String, String> mapDesc = map.descendingMap(); //reversed NavigableMap

        for (var key : mapDesc.keySet()) {
            System.out.println(key); //secara otomatis akan diurutkan
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

        // immutable.put("Fachri", "Fachri"); // Error


    }
}
