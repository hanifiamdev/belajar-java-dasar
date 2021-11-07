package hanifiamdev.com.application;

import hanifiamdev.com.data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        var category = new Category();
        category.setId("ID");
        category.setId(null); // ini aka tervalidasi dari method setter nya
        System.out.println(category.getId());
        System.out.println(category.isExpensive());

    }
}
