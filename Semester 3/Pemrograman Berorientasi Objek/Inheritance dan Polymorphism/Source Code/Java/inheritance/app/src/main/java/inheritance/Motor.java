package inheritance;

public class Motor {
  private String merk, tipe, warna;
  private int tahun;
  
  public Motor(String merk, String tipe, String warna, int tahun) {
    this.merk = merk;
    this.tipe = tipe;
    this.warna = warna;
    this.tahun = tahun;
  }
  
  public String getMerk() {
    return this.merk;
  }
  
  public String getTipe() {
    return this.tipe;
  }
  
  public String getWarna() {
    return this.warna;
  }
  
  public int getTahun() {
    return this.tahun;
  }
  
  public void jalankan() {
    System.out.println("Nyalakan motor...");
  }
}