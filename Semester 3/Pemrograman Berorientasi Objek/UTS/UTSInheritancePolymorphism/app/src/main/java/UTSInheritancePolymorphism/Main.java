package UTSInheritancePolymorphism;

public class Main {

  public static void main(String[] args) {
      /* Laptop lenovo = new Laptop("Lenovo");
      System.out.println("Merk laptop ini adalah " + lenovo.getMerk()); */
      Kotak kotak = new Kotak(7.2, 13.6, 23.7, 47.3);
      System.out.println(
          "Rincian kotak \n" +
          "Luas : " + kotak.hitungLuas() + " cm³\n" +
          "Berat: " + kotak.getBerat() + " kg"
      );
  }
}
