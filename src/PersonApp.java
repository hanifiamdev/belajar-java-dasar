public class PersonApp {
    public static void main(String[] srgs) {
       /* Membuat Object

        Object adalah hasil instansiasi dari sebuah class
        UNtuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama class dan kurung ()*/
        var person1 = new Person();

       /* Manipulasi Field

        Fields yang ada di object, bisa kita manipulasi. Tergantung final atau bukan
        Jika final, berarti kita tidak bisa mengubah data fieldnya, namun jika tidak, kita bisa mengubah fieldnya
        Untuk memanipulasi data field, sama seperti cara pada variable
        Untuk mengakses field, kita butuh kata kunci .(titik) setelah nama object dan diikuti nma fieldsnya*/

        person1.name = "Hanif";
        person1.address = "Pemalang";
        // person1.country = "Indonesia"; // field final jadi tidak boleh diubah

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        // Untuk mengakses method tersebut, kita bisa menggunakan tanda titik(.) dan diikuti dengan nama methodnya. Sama seperti mengakses field
        person1.sayHello("Budi");




        Person person2 = new Person();
        Person person3;
        person3 = new Person();


    }
}

