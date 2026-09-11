public class DemoTim {
    public static void main(String[] args) {
        TimSepakBola tim1 = new TimSepakBola();
        tim1.namaKlub = "Arsenal FC";
        tim1.stadion = "Emirates Stadium";
        tim1.jumlahPemain = 25;

        System.out.println("Info Tim 1");
        tim1.displayInfo();
        tim1.rekrutPemain(2);
        System.out.println("Update Total Pemain : " + tim1.jumlahPemain);
        
        System.out.println();

        TimSepakBola tim2 = new TimSepakBola();
        tim2.namaKlub = "Real Madrid CF";
        tim2.stadion = "Santiago Bernabeu";
        tim2.jumlahPemain = 24;

        System.out.println("Info Tim 2");
        tim2.displayInfo();
        tim2.rekrutPemain(1);
        System.out.println("Update Total Pemain : " + tim2.jumlahPemain);
    }
}
