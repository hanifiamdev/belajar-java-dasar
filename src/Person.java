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


    /*Constructor

    Saat kita membuat Object, maka kita seperti memanggil sebuah method, karena kita menggunakan kurung()
    Di dalam class Java, kita bisa membantu constructor adalah method yang akan dipanggil saat pertama kali Object dibuat
            Mirip seperti di method, kita bisa memberi parameter pada constructor
            Nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau rreturn value*/
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }
   /* Constructor Overloading

    Sama seperti di method, di constructor kita bisa melakukan overloading
    Kita bisa membuat contructor lebih dari satu dengan syarat tipe data parameter harus berbeda, atau jumlah parameter harus berbeda*/
    Person(String paramName) {
        name = paramName;
    }

    Person() {}



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
