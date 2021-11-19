package hanifiamdev.com.collection;

import java.util.*;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Hanif", "Fachri", "Orkhan", "Hafizah", "Adiba"));

        printResult(names, "Hasil NavigableSet");
        // reversed
        NavigableSet<String> namesReverse = names.descendingSet();
        printResult(namesReverse, "Hasil Reversed NavigableSet");
        // pencariana sampai elemen tertentu saja
        NavigableSet<String> hanif = names.headSet("Hanif", true);
        printResult(hanif, "Hasil Pencarian Sampai ketemu Suatu Elemen Yang dicari");
        NavigableSet<String> fachri = names.tailSet("Fachri", true);
        printResult(hanif, "Hasil Pencarian Dimulai dari Suatu Elemen Yang dicari sampai kebawahnya");

        // Navigableset Immutable
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        //immutable.add("Gagal Modifikasi");  // Error


    }


    public static void printResult(NavigableSet<String> navigableSet, String desc) {
        System.out.println("----------------------------------");
        System.out.println(desc);
        System.out.println("----------------------------------");

        for(var name : navigableSet) {
            System.out.println(name);
        }
        System.out.println("----------------------------------\n");
    }
}
