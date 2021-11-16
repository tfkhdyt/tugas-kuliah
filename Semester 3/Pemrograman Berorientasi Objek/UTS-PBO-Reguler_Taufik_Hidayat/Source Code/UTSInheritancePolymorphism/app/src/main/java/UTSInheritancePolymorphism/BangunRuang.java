package UTSInheritancePolymorphism;

public class BangunRuang {
    private double panjang, lebar, tinggi;
    public BangunRuang(double panjang, double lebar, double tinggi) {
      this.panjang = panjang;
      this.lebar = lebar;
      this.tinggi = tinggi;
    }
    
    public double hitungLuas() {
      return this.panjang * this.lebar * this.tinggi;
    }
}
