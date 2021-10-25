public class ForLoop {
    public static void main(String[] args) {
/*

        For adalah salah satu kunci yang bisa digunakan untuk melakukan perulangan
        Blok kode yang terdapat didalam for akan selalu diulangi selama kondisi for terpenuhi

        for (init statement; kondisi; post statement) {
            // block perulangan
        }


        * Init statement akan dieksekusi hanya sekali di awal sebelum perulangan
        * Kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan, jika false perulangan akan berhenti
                * Post statement akan dieksekusi setiap kali diakhir program
                * Init statement, Kondisi, dan post statement tidak wajib diisi, jika kondisi tidak diisi, berrti kondisi selalu bernilai benar
*/

      /*  // Perulangan Tanpa Henti
        for(;;){
            System.out.println("Perulangan Tanpa Henti");   // looping terus karena kondisi menggunakan nilai default yaitu true;
        }*/

        // Perulangan dengan kondisional saja
        var counter = 1;
        for(;counter <= 10;) {
            System.out.println("Perulangan " +  counter);

            counter ++;
        }
        System.out.println(counter);

        // Perulangan dengan kondisional dan init statement
        for(var counter2 = 1;counter2 <= 10;) {
            System.out.println("Perulangan  " +  counter2);
            counter2 ++;
        }

        // Perulangan dengan kondisional, init statement, dan post statement
        for(var counter3 = 1;counter3 <= 10; counter3++) {
            System.out.println("Perulangan " +  counter3);
        }

    }
}
