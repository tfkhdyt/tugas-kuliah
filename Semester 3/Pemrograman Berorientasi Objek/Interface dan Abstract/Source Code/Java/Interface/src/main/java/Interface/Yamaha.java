package Interface;

public class Yamaha implements Motor {
  private int kecepatan;
  private boolean apakahMotorMenyala;
  
  public Yamaha() {
    this.kecepatan = 0;
  }
  
  public int getKecepatan() {
    return this.kecepatan;
  }
  
  @Override
  public void nyalakan() {
    apakahMotorMenyala = true;
    System.out.println("Motor sudah menyala...");
    System.out.println("Selamat berkendara");
  }
  
  @Override
  public void matikan() {
    apakahMotorMenyala = false;
    System.out.println("Motor sudah dimatikan...");
  }
  
  @Override
  public void gas() {
    if(apakahMotorMenyala) {
      if(this.kecepatan == MAX_SPEED) {
        System.out.println("Anda sudah mencapai kecepatan maksimum!");
        System.out.println("Kecepatan saat ini: " + this.getKecepatan() + " km/h");
      } else {
        this.kecepatan += 5;
        System.out.println("Kecepatan saat ini: " + this.getKecepatan() + " km/h");
      }
    } else {
      System.out.println("Motor masih mati, tolong nyalakan motor terlebih dahulu!");
    }
  }
  
  @Override
  public void rem() {
    if(apakahMotorMenyala) {
      if(this.kecepatan == MIN_SPEED) {
        System.out.println("Kecepatan saat ini: 0 km/h");
      } else {
        this.kecepatan -= 5;
        System.out.println("Kecepatan saat ini: " + this.getKecepatan() + " km/h");
      }
    } else {
      System.out.println("Motor masih mati, tolong nyalakan motor terlebih dahulu!");
    }
  }
}
