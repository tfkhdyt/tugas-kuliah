package UTSInterfaceAbstract;

public class Kotak extends BangunDatar {
  private double sisi;
  
  public Kotak(double sisi) {
    this.sisi = sisi;
  }
  
  @Override
  public double getKeliling() {
    return this.sisi * 4;
  }
}