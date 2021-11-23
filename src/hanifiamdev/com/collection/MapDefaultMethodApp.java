package hanifiamdev.com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Hanif", "Java");
        map.put("Orkhan", "Golang");
        map.put("Adiba", "Kotlin");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key  + " : " + value);
            }
        });
        // Akan dibahas di materi lambda, ini lebih simple
        System.out.println("=========== Default Method Map With Lambda ===========");
        map.forEach((key, value) -> System.out.println(key  + " : " + value));
    }
}
