package hanifiamdev.com.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Hanif");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Hanif");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);


        // membuat map , ini juga immutable
        Map<String, String> map = Map.of(
                "first", "Fachri",
                "middle", "Mufthi",
                "last", "Amrullah"
        );

        //map.put("a", "A"); // Error



    }
}
