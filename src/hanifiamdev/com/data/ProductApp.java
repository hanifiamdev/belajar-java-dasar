package hanifiamdev.com.data;

public class ProductApp {
    public static void main(String[] args) {

        Product product = new Product("Mac Book Pro", 3000000);
        System.out.println(product.name); //protected sehingga masih bisa karena dalam 1 paket
        System.out.println(product.price);
    }
}
