public class RecursiveMethod {
    /*
        Recursive method adalah kemampuan method memanggil method dirinya sendiri
        kadang memang ada banyak problem yang lebih mudah diselesaikan menggunakan recursive method, seperti contohnya kasus factorial*/
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));
        loop(8000);

    }

    // Factorial loop biasa
    static int factorialLoop(int value) {
        var result = 1;
        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }

        return result;
    }


    // Factorial recursive
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    /*
        Problem Dengan Recursive
        walaupun recursive method itu sangat menarik, namun kita perlu berhati-hati
        jika recursive terlalu dalam, maka akan ada kemungkinan terjadi eror StackOverflow, yaitu eror dimana stack method terlalu banyak di java
        Kenapa problem ini bisa terjadi? Karena ketika kita memanggil method, Java akan menyimpannya dalam stack, jika method tersebut memanggil method lain,
        maka stack akan menumpuk terus, dan jika terlalu diam, maka stack akan terlalu besar, dan bisa menyebabkan eror StackOverflow*/
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }

}
