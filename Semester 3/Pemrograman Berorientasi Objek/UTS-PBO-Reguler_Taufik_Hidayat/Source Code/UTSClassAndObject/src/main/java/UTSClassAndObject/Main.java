package UTSClassAndObject;

public class Main {

  public static void main(String[] args) {
    Hewan monyet = new Hewan("Monyet", "2", "Uu aa");
    Hewan kelinci = new Hewan("Kelinci", "2", "Citcitcit");
    Buah pisang = new Buah("Pisang", "Kuning", "Panjang dan melengkung");
    Sayuran wortel = new Sayuran("Wortel", "Oranye", "Panjang dan ujungnya melancip");
    
    System.out.println(monyet.memakan(pisang.getNama()));
    System.out.println(kelinci.memakan(wortel.getNama()));
  }
}
