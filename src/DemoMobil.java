public class DemoMobil {
    public static void main(String[] args) {        
        Mobil mobil1 = new Mobil();
        
        mobil1.merk = "Toyota";
        mobil1.warna = "Hitam";
        mobil1.tahun = 2022;
        mobil1.kecepatan = 0;

        Mobil mobil2 = new Mobil();
        
        mobil2.merk = "Honda";
        mobil2.warna = "Putih";
        mobil2.tahun = 2023;
        mobil2.kecepatan = 0;

        System.out.println("Aktivitas Mobil 1");
        mobil1.nyalakanMesin();
        mobil1.tambahKecepatan();
        
        System.out.println("\nAktivitas Mobil 2");
        mobil2.nyalakanMesin();
        mobil2.matikanMesin();
    }
}