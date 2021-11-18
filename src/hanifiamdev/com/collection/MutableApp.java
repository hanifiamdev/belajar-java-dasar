package hanifiamdev.com.collection;

import hanifiamdev.com.collection.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Hanif");

        person.addHobby("Badminton");
        person.addHobby("Coding");

        doSomethingWithHobbies(person.getHobbies());

        for(var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("Bukan hobby"); // kena UnsupportedOperationException

    }
}
