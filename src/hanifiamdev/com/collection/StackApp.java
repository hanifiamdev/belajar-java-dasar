package hanifiamdev.com.collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Fachri");
        stack.push("Mufhti");
        stack.push("Amrullah");
        try {
            for (var name = stack.pop(); name != null; name = stack.pop()) {

                System.out.println(name);
            }
        }catch (EmptyStackException e) {
            System.out.println("Stack Sudah Kosong");
        };


    }
}
