package hanifiamdev.com.classes;

public class SystemApp {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv("APPDATA"));
        System.out.println(System.getenv("APP"));

        System.exit(1);

        System.out.println("Ini tidak Akan dieksekusi karena keburu exit");
    }
}
