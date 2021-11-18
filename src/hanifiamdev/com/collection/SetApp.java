package hanifiamdev.com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

       // Set<String> names = new HashSet<>(); // datanya ngacak
        Set<String> names = new LinkedHashSet<>(); //penambahan data di urutan terakhir, data terurut
        names.add("Hanif");
        names.add("Fachri");
        names.add("Orkhan");
        names.add("Hanif");
        names.add("Fachri");
        names.add("Orkhan");

        for (var name : names) {
            System.out.println(name);
        }

    }
}
