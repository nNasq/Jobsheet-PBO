public class DemoPersegi {
    public static void main(String[] args) {
        PersegiPanjang persegi1 = new PersegiPanjang();
        persegi1.panjang = 10;
        persegi1.lebar = 5;

        System.out.println("Informasi Persegi Panjang");
        persegi1.displayInfo();
        System.out.println("Luas Persegi     : " + persegi1.getLuas());
        System.out.println("Keliling Persegi : " + persegi1.getKeliling());
    }
}
