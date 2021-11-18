package hanifiamdev.com.generic.application;

import hanifiamdev.com.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Hanif");

        MyData<? extends Object> myData = stringMyData;

    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());
        //myData.setData("fachri"); // nggak boleh melakuakan set karenan bisa bahaya
        // myData.setData(1); // misal kan boleh kita memasukkan Integer yang sama2 turunan dari object akan bahaya padahal untuk case ini tipe data yang diminta adalah String
    }
}
