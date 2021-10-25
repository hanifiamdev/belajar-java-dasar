public class ForEach {
    public static void main(String[] args) {
      /*  Kadang kita bisa mengakses data array menggunakan perulangan
        Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter, lalu mengakses array menggunakan counter yang kita buat
        Namun untungnya, di Java terdapat perulangan for each, yang bisa digunakan untuk mengakses seluruh data di Array otomatis*/

        String[] names = {
           "Hanif", "Fachri", "Orkhan", "Hafizah", "Adiba"
        };

        for (var name : names) {
            System.out.println(name);
        }
    }
}

