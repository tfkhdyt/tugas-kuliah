package inheritance;

import inheritance.MotorBebek;
import inheritance.MotorKopling;


public class Main {

  public static void main(String[] args) {
    MotorMatic matic = new MotorMatic("Yamaha", "Nmax", "Abu-abu", 2021);
    MotorKopling kopling = new MotorKopling("Suzuki", "Satria F150", "Biru", 2020);
    MotorBebek bebek = new MotorBebek("Honda", "Supra X", "Merah", 2019);
    
    System.out.println(
        "Motor Matic\n"
      + "Merk : " + matic.getMerk() + "\n"
      + "Tipe : " + matic.getTipe() + "\n"
      + "Warna: " + matic.getWarna() + "\n"
      + "Tahun: " + matic.getTahun()
    );
    matic.jalankan();
    
    System.out.println(
        "\nMotor Kopling\n"
      + "Merk : " + kopling.getMerk() + "\n"
      + "Tipe : " + kopling.getTipe() + "\n"
      + "Warna: " + kopling.getWarna() + "\n"
      + "Tahun: " + kopling.getTahun()
    );
    kopling.jalankan();
    
    System.out.println(
        "\nMotor Bebek\n"
      + "Merk : " + bebek.getMerk() + "\n"
      + "Tipe : " + bebek.getTipe() + "\n"
      + "Warna: " + bebek.getWarna() + "\n"
      + "Tahun: " + bebek.getTahun()
    );
    bebek.jalankan();
  }
}
