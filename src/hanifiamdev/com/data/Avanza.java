package hanifiamdev.com.data;

public class Avanza implements Car, IsMaintenance {

    public void drive() {
        System.out.println("Avanza driver");
    }


    public int getTier() {
        return 4;
    }

    public String getBrand() {
        return "Toyots";
    }

    public boolean isMaintenance() {
        return false;
    }
}
