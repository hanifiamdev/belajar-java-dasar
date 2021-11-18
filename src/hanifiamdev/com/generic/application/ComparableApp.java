package hanifiamdev.com.generic.application;

import hanifiamdev.com.generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Hanif", "Indonesia"),
                new Person("Orkhan", "Indonesia"),
                new Person("Adiba", "Indonesia")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));

    }
}
