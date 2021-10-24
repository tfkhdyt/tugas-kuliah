package Abstract;

public class Balok extends BangunRuang {
  private double panjang, lebar, tinggi;
  
  public Balok(double panjang, double lebar, double tinggi) {
    this.panjang = panjang;
    this.lebar = lebar;
    this.tinggi = tinggi;
  }
  
  @Override
  public double getVolume() {
    return this.panjang * this.lebar * this.tinggi;
  }
}
