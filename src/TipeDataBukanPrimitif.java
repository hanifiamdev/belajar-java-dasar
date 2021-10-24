public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        /*
        * Tipe data primitif adalah tipe bawaan di dalam bahasa pemrograman.
        * Tipe data number, char, boolean adalah tipe data primitif( selalu memiliki default value ), sedankan bukan primitif bisa bernilai null
        * tipe data primitif bisa memililiki method/function
        * Di java, tipe data primitif memiliki representasi tipe data bukan primitif nya
        * byte | Byte , short | Short , int | Integer , long | Long , float | Float , double | Double
        * char | Character , boolean | Boolean
        * */

        Integer iniInteger = 100;
        Long iniLong = 1000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        int iniInt = 100;

        // cara konversi dari tipe data primitif ke bukan primitif ( value yang kompetible )
        Integer iniObject = iniInt;

        // dari bukan primitif ke primitif dengan ( value tidak kompitible )
       short iniShort = iniObject.shortValue();
       long iniLong2 = iniObject.longValue();
       float iniFloat = iniObject.floatValue();


    }
}
