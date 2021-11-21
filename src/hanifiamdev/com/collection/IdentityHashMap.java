package hanifiamdev.com.collection;

import java.util.Map;

public class IdentityHashMap {
    public static void main(String[] args) {

        Map<String, String> map = new java.util.IdentityHashMap<>();

        String key = "name.first";

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        System.out.println(key.equals(key2));
        System.out.println(key == key2);

        map.put(key, "Hanif");
        map.put(key2, "Hanif");

        System.out.println(map.size()); // size 2 padahal key dan key2 memiliki value yang sama yaitu "name.first", namun karena reference memorinya beda maka tetap ke put 2, jika ingin ke put satu sana gunakan HashMap bukan
    }
}
