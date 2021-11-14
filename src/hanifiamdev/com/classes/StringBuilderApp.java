package hanifiamdev.com.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        String name = "Hanif";

        name = name + " " + "Java";

        name = name + " " + "Programmer";

        System.out.println(name);

        /*
        * Di dalam memory klw kita menggunakan string
        * akan ada 3 object yang dibuat
        * yaitu : Hanif , Hanif Java, dan Hanif Java Programmer
        * Jadi tidak disarankan jika banyak melakukan manipulasi terhadap suatu String jangan menggunakan String
        *
        * */

        StringBuilder builder = new StringBuilder(); // di dalam memory akan terbentuk 1 object
        builder.append("Fachri");
        builder.append(" ");
        builder.append("Mufhti");
        builder.append(" ");
        builder.append("Amrullah");

        String user = builder.toString();
        System.out.println(user);

    }
}
