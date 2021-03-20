//mengimpor java library
import java.util.*;

/** 
  Nama : Taufik Hidayat
  NIM  : 301200032
*/
   
 //membuat class
 class luasVolume
 {
   //method main
   public static void main(String args[])
   {
    //luas persegi panjang
    double panjangP, lebarP, luasPpanjang;
    panjangP = 17;
    lebarP = 10;
    //rumus luas persegi panjang
    luasPpanjang = panjangP * lebarP;
    //mencetak output
    System.out.println("Menghitung 'luas persegi panjang'");
    System.out.println("-------------------------------");
    System.out.println("Panjang = " + panjangP + " cm");
    System.out.println("Lebar = " + lebarP + " cm");
    System.out.println("Rumus = Panjang x Lebar");
    System.out.println("---------------------------------------");
    System.out.println("Luas persegi panjang adalah = " + luasPpanjang + " cm²");
    System.out.println("");
    
    //luas segitiga
    double alas, tinggi, luasSegitiga;
    alas = 10;
    tinggi = 17;
    //rumus luas segitiga
    luasSegitiga = alas * tinggi / 2;
    //mencetak output
    System.out.println("Menghitung 'luas segitiga'");
    System.out.println("------------------------");
    System.out.println("Alas = " + alas + " cm");
    System.out.println("Tinggi = " + tinggi + " cm");
    System.out.println("Rumus = Alas x Tinggi / 2");
    System.out.println("-------------------------------");
    System.out.println("Luas segitiga adalah = " + luasSegitiga + " cm²");
    System.out.println("");
    
    //luas lingkaran
    double jari, luasLingkaran;
    jari = 18;
    //rumus luas lingkaran
    luasLingkaran = 3.14 * (jari * jari);
    //mencetak output
    System.out.println("Menghitung 'luas lingkaran'");
    System.out.println("-------------------------");
    System.out.println("Jari-jari = " + jari + " cm");
    System.out.println("Rumus = π x r²");
    System.out.println("-----------------------------------");
    System.out.println("Luas lingkaran adalah = " + luasLingkaran + " cm²");
    System.out.println("");
    
    //volume balok
    double panjang, lebar, tinggiBalok, volBalok;
    panjang = 18;
    lebar = 10;
    tinggiBalok = 5;
    //rumus volume balok
    volBalok = panjang * lebar * tinggiBalok;
    //mencetak output
    System.out.println("Menghitung 'volume balok'");
    System.out.println("-----------------------");
    System.out.println("Panjang = " + panjang + " cm");
    System.out.println("Lebar = " + lebar + " cm");
    System.out.println("Tinggi = " + tinggiBalok + " cm");
    System.out.println("Rumus = Panjang x lebar x tinggi");
    System.out.println("-------------------------------");
    System.out.println("Volume balok adalah = " + volBalok + " cm³");
    System.out.println("");
    
    //volume silinder
    double jariSilinder, tinggiSilinder, volSilinder;
    jariSilinder = 8;
    tinggiSilinder = 13;
    //rumus volume silinder
    volSilinder = 3.14 * (jariSilinder * jariSilinder) * tinggiSilinder;
    //mencetak output
    System.out.println("Menghitung 'volume silinder'");
    System.out.println("--------------------------");
    System.out.println("Jari-jari = " + jariSilinder + " cm");
    System.out.println("Tinggi = " + tinggiSilinder + " cm");
    System.out.println("Rumus = π x r² x tinggi");
    System.out.println("------------------------------------");
    System.out.println("Volume silinder adalah = " + volSilinder + " cm³");
    System.out.println("");
    
    /** 
      Nama : Taufik Hidayat
      NIM  : 301200032
    */
   }
 }