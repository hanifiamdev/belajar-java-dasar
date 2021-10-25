public class Continue {
    public static void main(String[] args) {

       // Namun berbeda dengan continue, continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya.
        for(var counter = 1; counter <= 100; counter++) {

            if ( counter % 2 == 0) {
                // klw angka genap akan dilanjutkan ke perulangan selanjutnya
                continue;
            }
            // ini hanya di eksekusi ketika tidak masuk countinue atau kondisi data genap
            System.out.println("Perulangan Ganjil " +  counter);
        }

    }
}
