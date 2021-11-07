public class Manager {

    String name;

    /*Manager() {}*/ // ini constructor default(tidak memiiliki parameter) sehingga  tidak wajib bikin constructor di kelas turunannya
    Manager(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name Is Manager " + this.name);
    }
}


