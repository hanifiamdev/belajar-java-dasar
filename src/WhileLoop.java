public class WhileLoop {
    public static void main(String[] args) {
/*

        while loop adalah versi perulangan yang lebih sederhana dibandingkan for loop
        Di while loop. hanya terdapat kondisi perulangan tanpa ada init statement dan post statement
*/

        var counter = 1;

        while (counter <= 10) {
            System.out.println("Perulangan " +  counter);

            counter++;
        }
    }
}
