package hanifiamdev.com.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {

        Date tanggal = new Date();
        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2010); // ganti tahunnya
        calendar.set(Calendar.MONTH, Calendar.JANUARY); //  Calendar.JANUARY bisa diubah dengan 0 , jika february 1 dst
        Date result = calendar.getTime();
        System.out.println(result);
    }
}
