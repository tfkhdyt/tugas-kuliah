package UTSInheritancePolymorphism;

public class Kotak extends BangunRuang {
    private double berat;
    public Kotak(double panjang, double lebar, double tinggi, double berat) {
      super(panjang, lebar, tinggi);
      this.berat = berat;
    }
    public double getBerat() {
      return this.berat;
    }
}
