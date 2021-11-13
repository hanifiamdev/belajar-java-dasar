package hanifiamdev.com.application;

import hanifiamdev.com.data.Customer;
import hanifiamdev.com.data.Level;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Hanif");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());

        // Konversi Enum ke String
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Print Level");
        for(var value : Level.values()) {
            System.out.println(value);
        }



    }
}
