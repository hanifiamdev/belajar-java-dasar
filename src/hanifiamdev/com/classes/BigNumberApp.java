package hanifiamdev.com.classes;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {

    public static void main(String[] args) {
        BigInteger a = new BigInteger("100000000000000000000");
        BigInteger b = new BigInteger("200000000000000000000");

        BigInteger c = a.add(b);

        System.out.println(c);
    }


}
