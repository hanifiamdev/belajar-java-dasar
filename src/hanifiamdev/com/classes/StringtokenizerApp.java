package hanifiamdev.com.classes;

import java.util.StringTokenizer;

public class StringtokenizerApp {
    public static void main(String[] args) {
        String value = "Hanif Java Programmer";
        StringTokenizer tokenizer = new StringTokenizer(value, " ");

        while(tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);
        }

        /*
        * NOTE : bedanya dengan split,, klw tonizer modenya lazy( di muat di memory setelah memanggil xxx.nextToken() ,
        * sedangkan split dia akan load semua secara langsung
        *
        * */

    }




}
