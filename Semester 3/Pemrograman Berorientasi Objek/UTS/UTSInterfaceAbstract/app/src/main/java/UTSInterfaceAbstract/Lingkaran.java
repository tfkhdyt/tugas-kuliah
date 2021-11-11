package UTSInterfaceAbstract;

public class Lingkaran extends BangunDatar {
  private double diameter;
  
  public Lingkaran(double diameter) {
    this.diameter = diameter;
  }
  
  @Override
  public double getKeliling() {
    return this.diameter * 3.14;
  }
}