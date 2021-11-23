package hanifiamdev.com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(List.of("Hanif", "Orkhan", "Hafizah", "Adiba", "Fachri"));

        System.out.println(list);
        System.out.println("\n============ reverse ============");
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("\n============ shuffle ============");
        Collections.shuffle(list);
        System.out.println(list);
    }
}
