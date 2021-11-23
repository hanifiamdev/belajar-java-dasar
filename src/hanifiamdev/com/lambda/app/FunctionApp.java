package hanifiamdev.com.lambda.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        // Interface Function
        Function<String, Integer> functionLength = new Function<String, Integer>() {

            @Override
            public Integer apply(String value) {
                return value.length();
            }
        };

        System.out.println(functionLength.apply("Hanif"));

        // Jika menggunakan lambda

        Function<String, Integer> functionLength2 = value -> value.length();
        System.out.println(functionLength.apply("Fachri"));

    }
}
