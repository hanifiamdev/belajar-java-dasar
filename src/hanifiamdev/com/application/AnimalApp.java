package hanifiamdev.com.application;

import hanifiamdev.com.data.Animal;
import hanifiamdev.com.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
