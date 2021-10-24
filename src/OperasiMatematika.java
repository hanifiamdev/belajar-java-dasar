public class OperasiMatematika {
    public static void main(String[] args) {

        /*
         *  Operasi Matemaika
         * */

        int a = 100;
        int b = 10;

        System.out.println(a + b); // 110
        System.out.println(a - b); // 90
        System.out.println(a * b); // 1000
        System.out.println(a / b); // 10
        System.out.println(a % b); // 0 ( sisa hasil bagi / modulo )

        /*
         * Augmented Assignments : Operasi ke variabel dirinya sendiri
         * example a = a + 10 ( operasi Matematika ) , jika dengan augmented assigments a += 10
         * */

        int c = 100;

        c += 10;
        System.out.println(c); // 110

        c -= 10;
        System.out.println(c); // 100

        c *= 10;
        System.out.println(c); // 1000

        /*
         * Unary Operator : Operator yang ditempatkasn di dalam variabel
         * ++ artinya a = a + 1
         * -- artinya a = a - 1
         * - artinya negatif
         * + artinya positif
         *  ! artinya negasi
         * */

        int d = 100;
        d++;
        System.out.println(d); // 101

        d--;
        System.out.println(d); // 100


    }
}
