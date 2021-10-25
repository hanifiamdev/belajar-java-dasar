public class Scope {
    /*Di Java, variable hanya bisa diakses di dalam area dimana mereka melihat ( Hal ini disebut scope )
    Contoh, jika sebuah variable dibuat method, maka hanya bisa diakses di method tersebut, atau
    jika dibuat didalam block, maka hanya bisa diakses didalam block tersebut*/
    public static void main(String[] args) {

    }

    static void sayHello(String name) {
        String hello = "Hello " + name;

        if(!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }
        System.out.println(hello);
        // System.out.println(hi); // eror varible hi
    }
}
