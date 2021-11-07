package hanifiamdev.com.data;

public class Bus implements Car {

    public void drive() {
        System.out.println("Bus driver");
    }

    public int getTier() {
        return 8;
    }


    public String getBrand() {
        return "Hino";
    }


    public boolean isBig() {  // ini optional karena dari default method
        return true;
    }
}
