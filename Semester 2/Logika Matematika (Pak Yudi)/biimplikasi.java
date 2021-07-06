public class biimplikasi{
  public static void main (String[] args) {
    boolean p = 30 * 2 == 60;
    boolean q = 60 % 2 == 1;
    
    System.out.println("p = 30 × 2 = 60 (" + p + ")");
    System.out.println("q = 60 adalah bilangan ganjil  (" + q + ")");
    System.out.println("p <=> q =  30 × 2 = 60 jika dan hanya jika 60 adalah bilangan ganjil (" + (p == q) );
  }
}
