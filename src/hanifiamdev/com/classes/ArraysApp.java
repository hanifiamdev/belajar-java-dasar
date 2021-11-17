package hanifiamdev.com.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int[] numbers = {1,34,67,43,576,899,13,44};
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));


        // Mencari data
        System.out.println(Arrays.binarySearch(numbers, 34));
        System.out.println(Arrays.binarySearch(numbers, 899));
        System.out.println(Arrays.binarySearch(numbers, 99));

        // copy array
        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int[] rsult2 = Arrays.copyOfRange(numbers, 5, 8);
        System.out.println(Arrays.toString(rsult2));
    }


}
