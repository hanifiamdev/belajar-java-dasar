package hanifiamdev.com.application;

import hanifiamdev.com.data.Product;

public class Application {

    public static void main(String[] args) {
        Product product = new Product("Mac Book Pro", 10_000_0000);
        /*System.out.println(product.name);
        System.out.println(product.price);*/ // Erro karena Acces modifiernya protected
    }
}
