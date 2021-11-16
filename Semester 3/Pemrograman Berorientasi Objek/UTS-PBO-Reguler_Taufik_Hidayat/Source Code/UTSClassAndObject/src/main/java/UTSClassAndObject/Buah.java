package UTSClassAndObject;

public class Buah {
    private String nama, warna, bentuk;
    
    public Buah(String nama,  String warna, String bentuk) {
      this.nama = nama;
      this.warna = warna;
      this.bentuk = bentuk;
    }
    
    public String getNama() {
      return this.nama;
    }
    
    public void rincian() {
      System.out.println(
          "Nama  : " + this.nama + "\n" + 
          "Warna : " + this.warna + "\n" + 
          "Bentuk: " + this.bentuk 
      );
    }
}
