package hanifiamdev.com.data;

public class Cat extends Animal {
    @Override
    public void run() {
        System.out.println("Cat " + name + " is run");
    }
}