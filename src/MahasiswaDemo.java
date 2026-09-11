public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        m1.displayBiodata();

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "254107060026";
        m2.nama = "Hafizh Arrasyiid Syahbana";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2B";
        m2.displayBiodata();

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "012345";
        m3.nama = "Rafa Alrabani";
        m3.alamat = "Bandung, Jawa Timur";
        m3.kelas = "2E";
        m3.displayBiodata();
    }
}
