package hanifiamdev.com.lambda.app;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        // test untuk yang bukan lazy
        testScore(60, getName());
        System.out.println("============ Lambda Sebagai Lazy Parameter cara 1 ============");
        testScoreLazy(60, () -> getName());
        testScoreLazy(90, () -> getName()); // ketika kondisi terpenuhi barulah  dieksekusi method getName()
        System.out.println("============ Lambda Sebagai Lazy Parameter cara 2 ============");
        testScoreLazy(60, LazyApp::getName);


    }

    public static void testScore(int score, String name) {
        if(score > 80) {
            System.out.println("Selamat " + name + ", Anda lulus");
        } else {
            System.out.println("Coba Lagi Tahun Depan");
        }
    }

    public static String getName() {
        System.out.println("Method getName() dipanggil");
        return "Hanif";
    }

    // Method yang menerapkan lazy
    public static void testScoreLazy(int score, Supplier<String> name) {
        if(score > 80) {
            System.out.println("Selamat " + name.get() + ", Anda lulus");
        } else {
            System.out.println("Coba Lagi Tahun Depan");
        }
    }

}
