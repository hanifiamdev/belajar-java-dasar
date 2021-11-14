package hanifiamdev.com.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Fachri");
        joiner.add("Mufthi");
        joiner.add("Amrullah");

        String value = joiner.toString();
        System.out.println(value); // [Fachri, Mufthi, Amrullah]
    }
}

