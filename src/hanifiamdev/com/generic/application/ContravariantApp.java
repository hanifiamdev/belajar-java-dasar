package hanifiamdev.com.generic.application;

import hanifiamdev.com.generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Hanif");
        MyData<? super String> myDta = objectMyData;

        objectMyData.setData(1000); // ini akan terjadi error , dan ini bahayanya bisa mengisi Integer padahal untuk case ini tipe adayanya diminta String

        process(objectMyData);

        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData) {
        String value = (String) myData.getData();
        System.out.println("Process parameter " + myData);

        myData.setData("Fachri");
    }
}
