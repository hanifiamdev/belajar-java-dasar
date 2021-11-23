package hanifiamdev.com.lambda.app;

import hanifiamdev.com.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        // contoh cara menggunakan anonimous class, sebelum ada lambda di java 8
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action() {
                return "Hanif";
            }
        };

        System.out.println(simpleAction1.action());

        // jika versi menggunakan lambda
        SimpleAction simpleAction2 = () -> {
            return "Fachri";
        };

        System.out.println(simpleAction2.action());

    }
}
