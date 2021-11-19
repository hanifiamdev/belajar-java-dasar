package hanifiamdev.com.collection;

import hanifiamdev.com.collection.data.Person;
import hanifiamdev.com.collection.data.PersonComparator;

import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> people =  new TreeSet<>(new PersonComparator().reversed()); // urutan scr desc

        people.add(new Person("Hanif"));
        people.add(new Person("Orkhan"));
        people.add(new Person("Adiba"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        // immutable sortedset
        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        //sortedSet.add(new Person("Hanif"));// Error

    }
}
