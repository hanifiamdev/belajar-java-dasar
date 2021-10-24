public class Variable {

    public static void main(String[] args) {

        String name;
        name = "Hanif Amrullah";

        System.out.println(name);
        int age = 30;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        /* sejak java versi 10, java mendukung kata kunci variabel dengan kata kunci var, sehingga kita tidak perlu
        *  menyebutkan tipe datanya. Namun perlu diingat untuk menggunakan variabel dengan kata kunci var kita harus
        * menginisialisasi value/nilai tersebut secara langsung*/
        var firstName = "Fachri";
        var middleName = "Mufti";
        var lastName = "Amrullah";
        // aKAN ERROr J ika deklarasi variabel var tanpa memberikan value secara langsung
        /*var company;
        company = "Terlkom";*/

        /* final atau variabel konstan yang nilai tidak bisa diubah*/
        final String application = "Belajar Java";

        // application = "PHP";  // ini erro karena mencobah merubah variabel konstan



    }
}
