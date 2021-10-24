package Abstract;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String aksi;
    double sisi, panjang, lebar, tinggi;
    
    while(true) {
      System.out.println("===== Volume Bangun Ruang =====");
      System.out.println("[1] Kubus");
      System.out.println("[2] Balok");
      System.out.println("[0] Keluar");
      System.out.print("Pilih aksi> ");
      aksi = in.nextLine();
      
      switch(aksi) {
        case "1":
          System.out.print("Masukkan panjang sisi kubus (cm)> ");
          sisi = in.nextDouble(); in.nextLine();
          BangunRuang kubus = new Kubus(sisi);
          System.out.println("Volume dari kubus adalah        : " + kubus.getVolume() + " cm³\n");
          break;
        case "2":
          System.out.print("Masukkan panjang balok (cm) > ");
          panjang = in.nextDouble(); in.nextLine();
          System.out.print("Masukkan lebar balok (cm)   > ");
          lebar = in.nextDouble(); in.nextLine();
          System.out.print("Masukkan tinggi balok (cm)  > ");
          tinggi = in.nextDouble(); in.nextLine();
          BangunRuang balok = new Balok(panjang, lebar, tinggi);
          System.out.println("Volume dari balok adalah    : " + balok.getVolume() + " cm³\n");
          break;
        case "0":
          in.close();
          System.exit(0);
          break;
        default:
          System.out.println("Input tidak valid! Masukkan menu yang benar\n");
          break;
      }
    }
  }
}
