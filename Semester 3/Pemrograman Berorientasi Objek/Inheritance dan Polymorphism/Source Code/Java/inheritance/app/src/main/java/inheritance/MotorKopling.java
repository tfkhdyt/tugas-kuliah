package inheritance;

public class MotorKopling extends Motor {
  public MotorKopling(String merk, String tipe, String warna, int tahun) {
    super(merk, tipe, warna, tahun);
  }
  @Override
  public void jalankan() {
    System.out.println("Nyalakan motor, tarik kopling, naik gigi, lalu perlahan lepas kopling dan gas");
  }
}
