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


   /* Variable Shadowing

    Varible shadowing adalah kejadian ketika kita membuat nama variable dengan nama yang sama di scope yang menutupi variable dengan nama yang sama di scope diatasnya
    Ini bisa terjadi seperti kita membuat nama parameter di method sama dengan nama field di class
    Saat terjadi variable shadowing, maka secara otomatis variable scope diatasnya tidak bisa diakses*/
    Person(String name, String addressddress) {
        name = name; // name yang dikiri akses ke parameter name dan name yang dikanan akses ke parameter name juga sehingga tertutupi name dari field class Person
        address = address;
    }
   /* Constructor Overloading

    Sama seperti di method, di constructor kita bisa melakukan overloading
    Kita bisa membuat contructor lebih dari satu dengan syarat tipe data parameter harus berbeda, atau jumlah parameter harus berbeda*/
    Person(String paramName) {
        /*Memanggil Constructor lain

        Constructor bisa memanggil constructor lain
        Hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagai kemungkinan
        Cara untuk memeanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil method, namaun dengan kata kunci this*/
        this(paramName, null);
    }

    Person() {
        this(null);
    }



    /*
    * ## Method ##
    *  Selain menambahkan field, kita juga bisa menambahkan method ke object
    *  Cara dengan mendeklarasikan method tersebut di dalam block class
    *  Sama seperti method biasanya, kita juga bisa menambahkan return value, parameter dan method overloading di method yang ada di dalam block class
    * */
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}
