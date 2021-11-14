package hanifiamdev.com.classes;

public class NumberApp {
    public static void main(String[] args) {

        Integer intValue = 10;
        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String contoh = "10000";
        String contoh2 = "100.10";


        // konversi ke non primitif
        Integer contohInteger = Integer.valueOf(contoh);
        Double contohDouble = Double.valueOf(contoh2);

        System.out.println(contohInteger);
        System.out.println(contohDouble);


        // konversi ke primitif
        int contohInt = Integer.parseInt(contoh);

        System.out.println(contohInt);
    }
}
