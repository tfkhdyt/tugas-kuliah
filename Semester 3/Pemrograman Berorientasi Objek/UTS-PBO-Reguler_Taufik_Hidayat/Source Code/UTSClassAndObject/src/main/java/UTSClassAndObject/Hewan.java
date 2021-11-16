package UTSClassAndObject;

public class Hewan {
    private String nama, jumlahKaki, suara;
    
    public Hewan(String nama, String jumlahKaki, String suara) {
      this.nama = nama;
      this.jumlahKaki = jumlahKaki;
      this.suara = suara;
    }
    
    public String getNama() {
      return "Nama hewan ini adalah " + this.nama;
    }
    
    public String getJumlahKaki() {
      return "Kaki " + this.nama + " berjumlah " + this.jumlahKaki;
    }
    
    public String bersuara() {
      return this.nama + " bersuara " + this.suara;
    }
       
    public String memakan(String makanan) {
      return this.nama + " memakan " + makanan;
    }
}
