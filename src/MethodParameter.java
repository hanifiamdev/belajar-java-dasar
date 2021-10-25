public class MethodParameter {
   /* Kita bisa mengirimkan informasi ke method yang ingin kita panggil
    Untuk melakukan hal tersebut, kita perlu menambahkan parameter atau argument di method yang sudah kita buat
    Cara membuat parameter sama seperti cara membuat variabel
    Parameter ditempatkan didalam() di deklarasi method
    Parameter bisa lebih dari satu, jika lebih dari satu, harus dipisah menggunakan tanda koma*/

    public static void main(String[] args) {

        sayHello("Hanif", "Amrullah");

    }

    static  void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " +  lastName);
    }

}
