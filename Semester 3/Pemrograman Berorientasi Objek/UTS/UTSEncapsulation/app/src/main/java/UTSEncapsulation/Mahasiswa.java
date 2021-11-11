package UTSEncapsulation;

public class Mahasiswa {
    private String nama;
    private int usia;
    public Mahasiswa(String nama, int usia) {
      this.nama = nama;
      this.usia = usia;
    }
    public String getNama() {
      return this.nama;
    }
    public int getUsia() {
      return this.usia;
    }
}
