package hanifiamdev.com.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> deque = new LinkedList<>();

        deque.offerFirst("Hanif");
        deque.offerFirst("Fachri");
        deque.offerFirst("Ali");

        for (var value: deque) {
            System.out.println(value);
        }

        System.out.println("\n==============================");
        // simulasi stack / tumpukan
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Hanif");
        stack.offerLast("Fachri");
        stack.offerLast("Ali");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        System.out.println("\n==============================");
        // simulasi stack / tumpukan
        Deque<String> queue = new LinkedList<>();

        queue.offerLast("Hanif");
        queue.offerLast("Fachri");
        queue.offerLast("Ali");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }

}
