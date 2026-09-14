public class Mobil {
    public String merk;
    public String warna;
    public int tahun;
    public int kecepatan;

    public void nyalakanMesin() { 
        System.out.println(merk + ": Mesin menyala."); 
    }
    
    public void tambahKecepatan() { 
        System.out.println(merk + ": Melaju."); 
    }
    
    public void matikanMesin() { 
        System.out.println(merk + ": Mesin mati."); 
    }
}