// Taufik Hidayat | 301200032 | Informatika Pagi
package inheritance;

public class Motor {

  private String merk, tipe, warna;
  private int tahun;

  public Motor(String merk, String tipe, String warna, int tahun) {
    // Taufik Hidayat | 301200032 | Informatika Pagi
    this.merk = merk;
    this.tipe = tipe;
    this.warna = warna;
    this.tahun = tahun;
  }

  public String getMerk() {
    return this.merk;
    // Taufik Hidayat | 301200032 | Informatika Pagi
  }

  public String getTipe() {
    return this.tipe;
  }

  public String getWarna() {
    return this.warna;
  }

  // Taufik Hidayat | 301200032 | Informatika Pagi

  public int getTahun() {
    return this.tahun;
  }

  public void jalankan() {
    System.out.println("Nyalakan motor...");
  }
}
// Taufik Hidayat | 301200032 | Informatika Pagi
