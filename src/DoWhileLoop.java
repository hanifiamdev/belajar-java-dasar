public class DoWhileLoop {
    public static void main(String[] args) {
/*
        Do While adalah perulangan yang mirip dengan while
        Perbedaannya hanya pada pengecekan kondisional
        Pengecekan kondisional di while loop dilakukan awal sebelum perulangan dilakukan, di do while loop dilakukan setelah perulangan dilakukan
        Oleh karena itu di dalam do while loop, minimal pasti sekali perulangan dilakukan walaupun kondisi tidak bernilai true
        */
        var counter = 100;

        do{
            // Minimal 1 kali dieksekusi walaupun kondisinal false dari awal
            System.out.println("Perulangan " + counter);
            counter++;
        } while (counter <= 10);

    }
}
