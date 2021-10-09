package inheritance;

public class MotorMatic extends Motor {
  public MotorMatic(String merk, String tipe, String warna, int tahun) {
    super(merk, tipe, warna, tahun);
  }
  @Override
  public void jalankan() {
    System.out.println("Nyalakan motor lalu gas");
  }
}
