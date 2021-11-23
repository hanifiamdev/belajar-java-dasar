package hanifiamdev.com.lambda.app;

import hanifiamdev.com.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        // contoh cara menggunakan anonimous class, sebelum ada lambda di java 8
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action(String name) {
                return name;
            }
        };

        System.out.println(simpleAction1.action("Hanif"));

        // versi 1 -jika versi menggunakan lambda
        SimpleAction simpleAction2 = (String name) -> {
            return name;
        };

        System.out.println(simpleAction2.action("Fachri"));

        System.out.println("===================================");
        // Karena di kontrak interface sudah tau parameternya String di method action maka menjadi Optional
        //versi 2 : tanpa type data
        SimpleAction simpleAction3 = (name) -> {
            return "Hello " + name;
        };

        // versi 3 : tanpa blok tapi dengan type data
        SimpleAction simpleAction4 = (String value) -> "Hello" + value;
        // versi 4 : tanpa blok + tanpa type data
        SimpleAction simpleAction5 = (value) -> "Hello " + value;
        // versi 5 : tanpa blok + tanpa type data + tanpa kurung juga boleh
        SimpleAction simpleAction6 = value -> "Hello " + value;

    }
}
