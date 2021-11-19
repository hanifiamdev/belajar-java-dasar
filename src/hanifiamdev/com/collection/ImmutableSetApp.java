package hanifiamdev.com.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Hanif");

        Set<String> mutable = new HashSet<>();
        mutable.add("Hanif");
        mutable.add("Amrullah");
        Set<String> imutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Hanif", "Java", "Programmer");

        //set.add("Fachri"); error
        //set.remove("hanif"); error
    }
}
