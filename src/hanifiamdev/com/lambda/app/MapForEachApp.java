package hanifiamdev.com.lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {

        Map<String, String> map =  new HashMap<>();
        map.put("first_name", "Hanif");
        map.put("middle_name", "Java");
        map.put("last_name", "Programmer");

        //for loop
        System.out.println("============ for loop ============");
        for(var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //forEach anonymous class
        System.out.println("============ forEach anonymous class ============");
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ":" + value);

            }
        });

        //lambda
        System.out.println("============ lambda ============");
        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
