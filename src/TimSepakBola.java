public class TimSepakBola {
    public String namaKlub;
    public String stadion;
    public int jumlahPemain;

    public void displayInfo() {
        System.out.println("Nama Klub     : " + namaKlub);
        System.out.println("Stadion Utama : " + stadion);
        System.out.println("Total Pemain  : " + jumlahPemain);
    }

    public void rekrutPemain(int tambahanPemain) {
        jumlahPemain += tambahanPemain;
        System.out.println(namaKlub + " berhasil merekrut " + tambahanPemain + " pemain baru.");
    }
}
