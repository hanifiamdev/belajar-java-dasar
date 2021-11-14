package hanifiamdev.com.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Hanif Amrullah";
        String nameLowercase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowercase);
        System.out.println(nameUppercase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Hanif"));
        System.out.println(name.endsWith("Amrullah"));

        String[] names = name.split(" ");
        for(var value : names) {
            System.out.println(value);
        }

        System.out.println(" ".isBlank());

        System.out.println("".isEmpty());
    }
}
