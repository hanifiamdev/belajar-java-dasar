package hanifiamdev.com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionDefaultMethodApp {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);
        System.out.println("================== replaceAll =======================");

        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 10;
            }
        });
        System.out.println(numbers);

        System.out.println("================== for each  =======================");
        // for each biasa
        for ( var number : numbers) {
            System.out.println(number);
        }

        System.out.println("================== Default Method  =======================");
        // default method
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("================== Default Method with Lambda  =======================");
        // akan lebih simple jika default method with lambda
        numbers.forEach(integer -> System.out.println(integer));

        System.out.println("================== removeIf()  =======================");
        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 50;
            }
        });

        System.out.println(numbers);
    }
}
