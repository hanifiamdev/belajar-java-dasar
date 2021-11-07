public class PolymorphismApp {

    public static void main(String[] args) {

        Employee employee = new Employee("Hanif");
        employee.sayHello("Budi");

        employee = new Manager("Hanif");
        employee.sayHello("Budi"); // merubah bentuk ke object manager sehingga sayHello() make method yang punya class Manager namun tidak bisa mengambil field company karena tidak di miliki di class employee

        employee = new VicePresident("Hanif"); // ini juga kembali ubah bentuk ke viceprecident ,,inilah yang disebut polymorphism
        employee.sayHello("Budi");


        sayHello(new Employee("Hanif"));
        sayHello(new Manager("Joko"));
        sayHello(new VicePresident("Budi"));


    }

    // dengan satu method sayHello dan memasukkan sebuah parameter parentnya maka bisa digunakan dengan obejct dari turunannya ini juga konsep polymorphism
    // tanpa polymorphism kita harus membuat object sayHello tiga kali jika ingin digunakan oleh 3 object berbeda
    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Helloo VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " +  employee.name);
        }
    }
}
