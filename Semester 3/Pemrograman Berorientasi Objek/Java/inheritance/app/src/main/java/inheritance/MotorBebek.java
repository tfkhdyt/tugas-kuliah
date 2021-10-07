package inheritance;

public class MotorBebek extends Motor {
  public MotorBebek(String merk, String tipe, String warna, int tahun) {
    super(merk, tipe, warna, tahun);
  }
  @Override
  public void jalankan() {
    System.out.println("Nyalakan motor, naik gigi, lalu gas");
  }
}
