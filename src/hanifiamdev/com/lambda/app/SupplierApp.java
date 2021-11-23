package hanifiamdev.com.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        // Interface Supplier
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Hanif Amrullah";
            }
        };

        System.out.println(supplier.get());

        //Interface Supplier denagn lambda
        Supplier<String> supplier2 = () -> "Fachri Amrullah";

        System.out.println(supplier2.get());


    }
}
