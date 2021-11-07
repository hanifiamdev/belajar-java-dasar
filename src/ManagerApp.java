public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Hanif");
        manager.sayHello("Fachri");

        var vp = new VicePresident("Orkhan");
        vp.sayHello("Adiba");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp);
        System.out.println(vp.toString());
    }
}
