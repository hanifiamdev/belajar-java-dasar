package hanifiamdev.com.collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        List<String> list = new Vector<>();

        list.add("Fachri");
        list.add("Mufhti");
        list.add("Amrullah");

        for(var value : list) {
            System.out.println(value);
        }
    }
}
