package hanifiamdev.com.lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class forEachApp {
    public static void main(String[] args) {

        List<String> names = List.of("Hanif", "Adiba", "Orkhan", "Hafizah", "Fachri");

        // for loop
        System.out.println("============== for loop ==============");
        for (var name : names) {
            System.out.println(name);
        }

        // forEach anonymous class
        System.out.println("============== forEach anonymous class ==============");
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // Lambda cara 1
        System.out.println("============== Lambda cara 1 ==============");
        Consumer<String> lambda = value -> System.out.println(value);
        names.forEach(lambda);

        // Lambda cara 2
        System.out.println("============== Lambda cara 2 ==============");
        names.forEach(value -> System.out.println(value));

        // Lambda method reference
        System.out.println("============== Lambda method reference ==============");
        names.forEach(System.out::println);

    }
}
