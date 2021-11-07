package hanifiamdev.com.application;

import hanifiamdev.com.data.City;

public class LocationApp {
    public static void main(String[] args) {

        //var location = new Location() //ERROR , kelas abstract tidak bisa di inisialisasi
        var city = new City();
        city.name = "Pemalang";

        System.out.println(city.name);
    }
}
