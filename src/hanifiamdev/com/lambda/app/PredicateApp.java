package hanifiamdev.com.lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {


        Predicate<String> predicateCheckBlank = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isBlank();
            }
        };

        System.out.println(predicateCheckBlank.test(""));
        System.out.println(predicateCheckBlank.test("Hanif"));

        // jika menggunakan lambda
        Predicate<String> predicateCheckBlank2 = value -> value.isBlank();
        System.out.println(predicateCheckBlank.test(""));
        System.out.println(predicateCheckBlank.test("Fachri"));
    }
}
