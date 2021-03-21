import java.util.Scanner;

public class angka {
  static void intToString(int angka) {
    Scanner in = new Scanner(System.in);
    int masuk;
    String[] ribu = {
      "",
      " Seribu",
      " Dua Ribu",
      " Tiga Ribu",
      " Empat Ribu",
      " Lima Ribu",
      " Enam Ribu",
      " Tujuh Ribu",
      " Delapan Ribu",
      " Sembilan Ribu"
    };
    String[] ratus = {
      "",
      " Seratus",
      " Dua Ratus",
      " Tiga Ratus",
      " Empat Ratus",
      " Lima Ratus",
      " Enam Ratus",
      " Tujuh Ratus",
      " Delapan Ratus",
      " Sembilan Ratus"
    };
    String[] puluh = {
      "",
      " Belas",
      " Dua Puluh",
      " Tiga Puluh",
      " Empat Puluh",
      " Lima Puluh",
      " Enam Puluh",
      " Tujuh Puluh",
      " Delapan Puluh",
      " Sembilan Puluh"
    };
    String[] satuan = {
      "",
      " Satu",
      " Dua",
      " Tiga",
      " Empat",
      " Lima",
      " Enam",
      " Tujuh",
      " Delapan",
      " Sembilan"
    };
    do {
      if (angka < 9999 && angka > 0) {
        int rhibu, rhatus, phuluh, shatuan;
        rhibu = angka / 1000;
        rhatus = (angka % 1000) / 100;
        phuluh = (angka % 100) / 10;
        shatuan = angka % 10;
        if (phuluh == 1) {
          if (shatuan == 1) {
            System.out.println("Hasil : " + ribu[rhibu] + ratus[rhatus] + " Se" + puluh[phuluh]);
          } else if (shatuan == 0) {
            System.out.println("Hasil : " + ribu[rhibu] + ratus[rhatus] + " Sepuluh");
          } else {
            System.out.println("Hasil : " + ribu[rhibu] + ratus[rhatus] + satuan[shatuan] + puluh[phuluh]);
          }
        } else {
          System.out.println("Hasil : " + ribu[rhibu] + ratus[rhatus] + puluh[phuluh] + satuan[shatuan]);
        }
      } else {
        System.out.println("Masukan Tidak Valid(Terlalu besar/kecil)");
      }
      System.out.print("Masukkan Angka : ");
      angka = in .nextInt();
    } while (angka != 9999);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan Angka : ");
    int angka = in .nextInt();

    intToString(angka);
  }
}
