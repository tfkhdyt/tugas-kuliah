package UTSInterfaceAbstract;
import java.text.NumberFormat;

public class Main {

  public static void main(String args[]) {
    /* Munculkan.Pesan pesan = new NestedInterface();
    pesan.msg("Assalamu'alaikum"); */
    NumberFormat nf = NumberFormat.getInstance();
    nf.setMaximumFractionDigits(2);
    double sisi = 9.1;
    BangunDatar kotak = new Kotak(sisi);
    double diameter = 2.5;
    BangunDatar lingkaran = new Lingkaran(diameter);
    
    System.out.println(
        "Sisi kotak        : " + sisi + " cm\n" +
        "Keliling kotak    : " + nf.format(kotak.getKeliling()) + " cm\n"
    );
    System.out.println(
        "Diameter lingkaran: " + diameter + " cm\n" +
        "Keliling lingkaran: " + nf.format(lingkaran.getKeliling()) + " cm"
    );
  }
}
