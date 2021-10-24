public class IfStatement {
    public static void main(String[] args) {

        var nilai = 70;
        var absen = 90;
        // if statement
        if (nilai >= 75 && absen >= 75) {
            System.out.println("Selamat Anda Lulus");
        } else {
            // else statement
            System.out.println("Silahkan coba lagi tahun depan");
        }


        // contoh if else if dan else
        if (nilai >= 80 && absen >= 88) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda C");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }


    }
}
