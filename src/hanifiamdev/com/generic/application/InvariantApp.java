package hanifiamdev.com.generic.application;

import hanifiamdev.com.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Hanif");
        // doIt(stringMyData); // Error karena mencoba memasukkan tipe data string ke parameter object walauun String child dari Object namun di generic tidak diperbolehkan
        // MyData<Object> objectMyData = stringMyData; // ERROR

        MyData<Object> objectMyData = new MyData<>(10000);
        // MyData<Integer> integerMyData = objectMyData; // ERRORR
        // doItInteger(integerMyData); // ERRORR

    }

    public static void doIt(MyData<Object> objectMyData) {

    }

    public static void doItInteger(MyData<Integer> integerMyData) {

    }
}
