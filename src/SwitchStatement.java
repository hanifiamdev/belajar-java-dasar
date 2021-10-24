public class SwitchStatement {
    public static void main(String[] args) {
/*

        Switch statement adalah percabangan sama dengan if, namun lebih sederhana cara pembuatannya
        kondisi di switch statement hanya untuk perbandingan ==
*/

        var nilai = "B";

        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin Anda salah jurusan");

        }
/*
        Switch Lambda
        Di java versi 14, diperkaenalkan switch expression dengan lambda
        Ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi menggunakan kata kunci break

        */

        switch (nilai) {
            case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }


        }
/*
        Di java 14, ada kata kunci yield, dimana kita menggunakan kata kunci yield untuk mengambalikan nilai pada switch statement

        Ini sangat mempermudah kita ketika butuh membuat data berdsarkan kondisi switch statement
        yield mirip return value untuk switch
        */
        // Berikut Contoh tanpa yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Mungkin Anda Salah Jurusan";
            }
        }

        // Jika menggunakan yield
        var hasil = "A";
        String ucapan2 = switch (hasil) {
            case "A":
                yield "Wow, Anda Lulus Dengan Baik";
            case "B","C":
                yield "Anda Lulus";
            case "D":
                yield "Anda Tidak Lulus";
            default :
                yield "Mungkin Anda Salah Jurusan";
        };
        System.out.println(ucapan2);

    }
}
