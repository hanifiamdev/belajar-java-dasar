public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager();
        manager.name = "Hanif";
        manager.sayHello("Fachri");

        var vp = new VicePresident();
        vp.name = "Orkhan";
        vp.sayHello("Adiba");
    }
}
