package hanifiamdev.com.generic.application;

import hanifiamdev.com.generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {

        String[] names = {"Hanif", "Java", "Programmer"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println(
                ArrayHelper.<String>count(names)  // untuk <String> seblum nama method count itu optional bisa di ikutkan bisa juga tidak
        );
        System.out.println(
                ArrayHelper.count(numbers)
        );
    }
}
