package hanifiamdev.com.lambda.app;


import java.util.Optional;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Hanif");
        //sayHello(null); // ini akan kena Error NullPointerException, makannya perlu menggunakan optional class
        // optinal
        sayHelloWithOptional("Fachri");
        sayHelloWithOptional(null); // sudah tidak Error sayHelloWithOptionalSimple

        sayHelloWithOptionalSimple("AdibA");
        sayHelloWithOptionalSimple(null);

        sayHelloWithOptionalSimpleElse("Orkhan");
        sayHelloWithOptionalSimpleElse(null);

        sayHelloWithOptionalSimpleorElse("Orkhan");
        sayHelloWithOptionalSimpleorElse(null);

    }

    public static void sayHello(String name) {
        String nameUpper = name.toUpperCase();
        System.out.println("Hello " + nameUpper);
    }

    public static void sayHelloWithOptional(String name) {
        Optional<String> optionalName = Optional.ofNullable(name);

        // jika mau pakai anonymous function
       /* Optional<String> optionalNameUpper = optionalName.map(new Function<String, String>() {
            @Override
            public String apply(String name) {
                return name.toUpperCase();
            }
        });*/

        // tapipakai lambda saja
        Optional<String>  optionalNameUpper = optionalName.map(value -> value.toUpperCase());
        optionalNameUpper.ifPresent(value -> System.out.println("Hello " + value));

    }

    public static void sayHelloWithOptionalSimple(String name) {
        Optional.ofNullable(name)
                .map(value -> value.toUpperCase())
                .ifPresent(value -> System.out.println("Hello " + value));

        // JIKA INGIN SIMPLE LAGI

       /* Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresent(value -> System.out.println("Hello " + value));*/
    }

    public static void sayHelloWithOptionalSimpleElse(String name) {
        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresentOrElse(
                        value -> System.out.println("Hello " + value),
                        () -> System.out.println("HELLO")
        );
    }

    public static void sayHelloWithOptionalSimpleorElse(String name) {
        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN"); // klw tidak ada kita menggnti menjadi teman

        System.out.println("HELLO " + upperName);
    }
}
