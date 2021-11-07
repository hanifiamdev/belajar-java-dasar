package hanifiamdev.com.application;

import hanifiamdev.com.data.*; // Semua class di dalam package data akan ke import
import java.lang.String; // ini ndak perlu di import secarqa eksplisit

public class Application {

    public static void main(String[] args) {

        String name = "Hanif";
        Product product = new Product("Mac Book Pro", 10_000_0000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
