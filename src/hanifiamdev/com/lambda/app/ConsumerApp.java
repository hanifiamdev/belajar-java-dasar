package hanifiamdev.com.lambda.app;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        // Interface Consumer
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        };
        consumer.accept("Hanif Amrullah");

        // jika dengan lambda
        Consumer<String> consumer2 = value -> System.out.println(value);
        consumer2.accept("Fachri Amrullah");
    }
}
