package hanifiamdev.com.application;

//import hanifiamdev.com.data.Application; // ini import cara standar
import static hanifiamdev.com.data.Application.PROCESSORS; // jika pakai import static
import static hanifiamdev.com.data.Constant.*; // ini cara import static klw mau dapat semua field
import hanifiamdev.com.data.Country;
import hanifiamdev.com.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        // Mengakses static
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,1,1,1,1));

        Country.City city = new Country.City();
        city.setName("Pemalang");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
