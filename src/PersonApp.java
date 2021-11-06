public class PersonApp {
    public static void main(String[] srgs) {

        var person1 = new Person("Amrullah", "Pemalang");

       /* person1.name = "Hanif";
        person1.address = "Pemalang";*/
        // person1.country = "Indonesia"; // field final jadi tidak boleh diubah

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Budi");


        Person person2 = new Person("Budi");
        Person person3;
        person3 = new Person();
        person3.name = "Fachri";
        person3.sayHello("Orkhan");

    }
}

