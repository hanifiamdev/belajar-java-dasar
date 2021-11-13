package hanifiamdev.com.data;

public class Application {

    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors(); // ini untuk mengakses CPU dari local komputer
    }
}
