package hanifiamdev.com.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {

        SortedMap<String, String> sortedMap =  new TreeMap<>();

        sortedMap.put("Hanif", "Hanif");
        sortedMap.put("Joko", "Joko");
        sortedMap.put("Budi", "Budi");

        for (var key : sortedMap.keySet()) {
            System.out.println(key); //secara otomatis akan diurutkan
        }

        System.out.println("==================================");

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        SortedMap<String, String> sortedMap2 =  new TreeMap<>(stringComparator);

        sortedMap2.put("Hanif", "Hanif");
        sortedMap2.put("Joko", "Joko");
        sortedMap2.put("Budi", "Budi");

        for (var key : sortedMap2.keySet()) {
            System.out.println(key); //secara otomatis akan diurutkan
        }

        System.out.println("==================================");
        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable =  Collections.unmodifiableSortedMap(sortedMap);

       // immutable.put("Hanif", "Amrullah"); // Error karena sudah dibuat immutable




    }
}
