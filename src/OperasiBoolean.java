public class OperasiBoolean {
    public static void main(String[] args) {

       /* Operasi Boolean : operasi perbandingan yang di peruntukan untuk tipe data yang benilai boolean

        Operasi && / and : hanya akan bernilai true jika nilai yang dibandingkan true
        Operasi || / or : jika salah satu saja bernilai true maka hasilnya true
        operasi ! / kebalikan atau negasi : lawan dari nilai true maupun false*/

        var absen = 78;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);


    }
}
