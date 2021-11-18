package hanifiamdev.com.generic.application;

import hanifiamdev.com.generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {

        MyData myData = new MyData("Hanif"); // info genericnya tidak di deklaraikan ( Type Erasure )

        MyData<Integer> integerMyData = (MyData<Integer>) myData; // ini bahayanya tidak ada worning eror disini karena kita tidak menentukan tipe generic String secara langusng
        Integer integer = integerMyData.getData();
    }
}
