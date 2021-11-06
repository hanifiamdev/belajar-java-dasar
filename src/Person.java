/*
 * ## Membuat Class ##
 * Untuk membuat class, kita bisa menggunakan kata kunci class
 * Penamaan class biasa menggunakan format CamelCase
 *
 * Field
 * Fields / Properties / Attributes adalah data yang bisa kita sisipkan di dalam Object
 * Namun sebelum kita bisa memasukkan data di fields, kita harus mendeklarasikan data apa aja yang dimiliki object tersebut di dalam deklarasi class-nya
 * Membuat field sama seperti membuat variable, namaun ditempatkan di block class
 * */

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String addressddress) {
        this.name = name; // name yang dikiri akses ke parameter name dan name yang dikanan akses ke parameter name juga sehingga tertutupi name dari field class Person solusinya dengan keyword this
    }

    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
        this(null);
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}
