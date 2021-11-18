package hanifiamdev.com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        // List<String> strings = new LinkedList<>();

        strings.add("Hanif");
        strings.add("Amrullah");

        strings.set(0, "Fachri");

        strings.remove(1);
        System.out.println(strings.get(0));

        for (var value : strings) {
            System.out.println(value);
        }


    }
}
