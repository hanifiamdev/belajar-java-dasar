package hanifiamdev.com.lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();  // harus bikin mutable karena nanti akan dihapus
        names.addAll(List.of("Hanif", "Adiba", "Orkhan", "Hafizah", "Fachri"));

        //for loop
        /*System.out.println("=============== for loop ===============");
        for (var name : names) {
            System.out.println(name);
            if(name.length() > 5) {
                names.remove(name);
            }

        }*/

        /*
        * Ketka remove di call dia akan menghapus dalam hal ini Orkhan sehingga Hafizah dan Fachri akan bergeser
        * hal ini menyebabkan eror ConcurrentModificationException
        * */

        //remove if anonymous class\
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.length() > 5;
            }
        });
        System.out.println("=========== remove if anonymous class ===========");
        System.out.println(names);
        // lambda
        names.removeIf(name -> name.length() > 5);
        System.out.println("=========== remove if lambda ===========");
        System.out.println(names);


    }
}
