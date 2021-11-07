public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Hanif";
        child.doIt();
        System.out.println(child.name);

        Parent parent = child;
        parent.doIt();
        System.out.println(parent.name); // karena varibel nggak ada override maka varibel yang dipanggil disini milik kelas Parent sehongga nilaiya null
    }
}
