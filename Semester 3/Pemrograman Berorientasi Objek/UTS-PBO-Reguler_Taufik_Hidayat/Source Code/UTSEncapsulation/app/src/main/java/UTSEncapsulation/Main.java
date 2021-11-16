package UTSEncapsulation;

public class Main {

  public static void main(String[] args) {
      Mahasiswa mhs = new Mahasiswa("Taufik Hidayat", 19);
      System.out.println(
          "===== DATA MAHASISWA =====\n" +
          "Nama: " + mhs.getNama() + "\n" +
          "Usia: " + mhs.getUsia() + " tahun"
      );
  }
}
