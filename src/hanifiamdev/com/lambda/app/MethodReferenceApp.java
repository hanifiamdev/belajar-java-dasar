package hanifiamdev.com.lambda.app;

import hanifiamdev.com.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        //Metthod Reference Static
        // Anonymous class
        Predicate<String> predicateIsLowerCase = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return StringUtil.isLoweCase(s);
            }
        };

        System.out.println(predicateIsLowerCase.test("hanif"));
        System.out.println(predicateIsLowerCase.test("Hanif"));

        System.out.println("================= lambda =================");
        // Lambda
        Predicate<String> predicateIsLowerCase2 = value -> StringUtil.isLoweCase(value);
        System.out.println(predicateIsLowerCase.test("fachri"));
        System.out.println(predicateIsLowerCase.test("Fachri"));

        System.out.println("================= lambda versi method reference =================");
        // Lambda
        Predicate<String> predicateIsLowerCase3 = StringUtil::isLoweCase;
        System.out.println(predicateIsLowerCase.test("adiba"));
        System.out.println(predicateIsLowerCase.test("Adiba"));

        // Mthod refeerence
        Function<String, String> functionUpper = new Function<String, String>() {
            @Override
            public String apply(String value) {
                return value.toUpperCase();
            }
        };

        // withlambda
        Function<String, String> functionUpper2 = value -> value.toUpperCase();

        // Yang lebih simple lagi
        Function<String, String> functionUpper3 = String::toUpperCase;


        System.out.println(functionUpper.apply("Hafizah"));

    }

    // Metthod Reference non Static
    public void run(){
        // Anonymous class
        Predicate<String> predicateIsLowerCase = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return MethodReferenceApp.this.isLoweCase(value);
            }
        };

        System.out.println(predicateIsLowerCase.test("adiba"));
        System.out.println(predicateIsLowerCase.test("Adiba"));

        // versi lambda
        Predicate<String> predicateIsLowerCase2 = value -> MethodReferenceApp.this.isLoweCase(value);

        // versi lambda lebih simple
        Predicate<String> predicateIsLowerCase3 = MethodReferenceApp.this::isLoweCase;

        // versi lambda lebih simpleagi
        Predicate<String> predicateIsLowerCase4 = this::isLoweCase;

    }

    // Contoh Method Reference Object
    public void run2(){
        MethodReferenceApp app = new MethodReferenceApp();
        // versi lambda lebih simpleagi
        Predicate<String> predicateIsLowerCase6 = app::isLoweCase;
        System.out.println(predicateIsLowerCase6.test("hanif"));
        System.out.println(predicateIsLowerCase6.test("Hanif"));

    }

    public boolean isLoweCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    };
}
