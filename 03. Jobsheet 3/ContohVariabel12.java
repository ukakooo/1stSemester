/**
 * ContohVariabel12
 */
public class ContohVariabel12 {

    public static void main(String[] args) {
        String SalahSatuHobbySayaAdalah = "Bermain petak umpet";
        boolean IsPandai = true;
        char JenisKelamin = 'L';
        byte UmurSayaSekarang = 20;
        double $ipk = 3.24, tinggi = 1.78;
        System.out.println(SalahSatuHobbySayaAdalah);
        System.out.println("Apakah pandai?" + IsPandai);
        System.out.println("Jenis Kelamin " + JenisKelamin);
        System.out.println("Umurku saat ini" + UmurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}