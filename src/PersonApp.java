public class PersonApp {
    public static void main(String[] srgs) {
       /* Membuat Object

        Object adalah hasil instansiasi dari sebuah class
        UNtuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama class dan kurung ()*/
        var person1 = new Person();
        Person person2 = new Person();
        Person person3;
        person3 = new Person();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}

