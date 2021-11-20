package hanifiamdev.com.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>(10);
        //Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            queue.add(String.valueOf(i));
        }

        for(String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }
        // size 0 karena poll() mengambil sekaligus menghapous
        System.out.println(queue.size());

        System.out.println("==========================================");
        // Membuat queue yang berurut
        Queue<String> names = new PriorityQueue<>();

        names.add("Hanif");
        names.add("Amrullah");
        names.add("Fachri");
        names.add("Orkhan");

        for(String next = names.poll(); next != null; next = names.poll()) {
            System.out.println(next);
        }

    }
}
