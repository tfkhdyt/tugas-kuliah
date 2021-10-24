package Interface;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Motor nmax = new Yamaha();
    Pengendara taufik = new Pengendara(nmax);
    Scanner in = new Scanner(System.in);
    String aksi;

    while (true) {
      System.out.println("===== Yamaha Nmax =====");
      System.out.println("[1] Nyalakan motor");
      System.out.println("[2] Matikan motor");
      System.out.println("[3] Gas");
      System.out.println("[4] Rem");
      System.out.println("[0] Keluar");
      System.out.println("======================");
      System.out.print("Pilih aksi> ");
      aksi = in.nextLine();

      switch (aksi) {
        case "1":
          taufik.menyalakanMotor();
          break;
        case "2":
          taufik.mematikanMotor();
          break;
        case "3":
          taufik.menggasMotor();
          break;
        case "4":
          taufik.mengeremMotor();
          break;
        case "0":
          in.close();
          System.exit(0);
          break;
        default:
          System.out.println("Aksi tidak valid!");
          break;
      }
      System.out.println();
    }
  }
}
