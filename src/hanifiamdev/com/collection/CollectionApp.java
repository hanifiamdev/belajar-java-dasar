package hanifiamdev.com.collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        // Menambah data
        collection.add("Hanif");
        collection.add("Java");
        collection.add("Programmer");
        collection.addAll(List.of("Wahana", "Koding", "Foundation"));

        for (var value : collection) {
            System.out.println(value);
        }

        // Menghapus data
        System.out.println("REMOVE");
        collection.remove("Hanif"); // true
        collection.remove("Budi"); // false
        collection.removeAll(List.of("Wahana", "Foundation")); // true

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("CHECK DATA");
        System.out.println(collection.contains("Java"));
        System.out.println(
                collection.containsAll(List.of("Koding", "Foundation"))
        );

        // size collection
        System.out.println(collection.size());
    }
}
