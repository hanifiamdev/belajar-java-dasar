public class konversiNumber {

    public static void main(String[] args) {
        /*Konveersi Tipe Data Number
         * Widening Casting(Otomatis): byte -> short -> int -> float -> douible
         * Narrowing Casting(Manual) : double -> float -> long -> int -> char -> short -> byte
         * */
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int intInt2 = 1000;
        // karena batas mya intuk byte 127 maka ini terjadi overflow yang mengembalihan nilai kemmbali start dari -127
        byte iniByte2 = (byte) intInt2; // sehingga hasilnya -24

    }
}
