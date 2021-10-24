import java.util.Date;

public class Block {
    public static void main(String[] args) {

      /*  Expression adalah konstruksi dari variabel, operator dan pemanggilan method yang mengevaluasi menjadi sebuah single value;
        Expression adalah core component dari statement
        Statement jika diibaratkan adalah kalimat lengkap dalam bahasa
        Sebuah statement berisikan execution komplit, biasanya diakhiri dengan titik koma
        Jenis statement adalah Assigment expression, Penggunaan ++ dan --, method invocation, Object creation expression
        Jadi kumpulan expression adalah statement dan kumpulan statement adalah block
        */
        int value; // ini Expression + statement
        value = 10; // ini Expression + statement

        System.out.println(value = 100);// ini statement tapi bukan expression. sebenernya value = 100 termasuk expression namun untuk keseluruhan di baris itu disebut statement

        // assigment statement
        double aValue = 8966.234;
        // increment statement
        aValue++;
        // method invocation statement
        System.out.println("Hello World!");
        // object creation statement
        Date date = new Date();



        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
        {
            // memungkinkan block didalam block
            System.out.println("Hello World 4");
            System.out.println("Hello World 5");
        }
    }
}
