package hanifiamdev.com.application;

public class EqualsApp {

    public static void main(String[] args) {

        String first = "Hanif";
        first = first + " " + "Amrullah";

        System.out.println(first);
        String second = "Hanif Amrullah";
        System.out.println(second);

        System.out.println(first == second); // false karena mengecek lokasi memori yang sama atau tidak
        System.out.println(first.equals(second)); // true karena equals beneran membandingakan isi contentnya

        String third = "Hanif Amrullah";

        System.out.println(second == third); // true karena di java ada optimize memory klw content beneran sama maka tidak membuat alokasi memory baru
        System.out.println(second.equals(third));// true karena equals beneran membandingakan isi contentnya



    }
}
