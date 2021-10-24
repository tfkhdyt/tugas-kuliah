package Abstract;

public class Kubus extends BangunRuang {
  private double sisi;
  
  public Kubus(double sisi) {
    this.sisi = sisi;
  }
  
  @Override
  public double getVolume() {
    return Math.pow(this.sisi, 3);
  }
}
