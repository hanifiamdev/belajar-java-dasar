package hanifiamdev.com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Hanif");
        mutable.add("Amrullah");
        List<String> immutable = Collections.unmodifiableList(mutable); // membuat menjadi immutable
       // immutable.add("dfsaf");/// error tidak bisa di tambahkan

        mutable.add("ss");
        for(var str : mutable) {
            System.out.println(str);
        }
        List<String> elements = List.of("Hanif", "Amrullah"); // ini juga immutable


    }
}
