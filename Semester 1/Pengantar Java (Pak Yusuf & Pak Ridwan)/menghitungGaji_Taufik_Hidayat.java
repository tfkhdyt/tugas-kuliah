/**
  Nama  : Taufik Hidayat
  NIM   : 301200032
*/
  
//import java library
import java.util.*;
import java.lang.*;
//class java
class menghitungGaji_Taufik_Hidayat{
 //method main
 public static void main(String args[]){ 
   //deklarasi
   String nama, status;
   char gol;
   double gajiPokok, tunjangan, potIuran, gajiBersih, prosentase;
   gajiPokok = 0;
   tunjangan = 0;
   prosentase = 0;
   
   //input
   nama = "Taufik";
   gol = 'a';
   status = "Belum";
   //mengubah inputan char huruf kecil ke huruf besar
   gol = Character.toUpperCase(gol);
    
   //proses (menentukan gaji pokok dan tunjangan berdasarkan status dan golongan)
   if (gol == 'A' && status.equalsIgnoreCase("Nikah")){
     gajiPokok = 200000;
     tunjangan = 50000;
   }else if (gol == 'A' && status.equalsIgnoreCase("Belum")){
     gajiPokok = 200000;
     tunjangan = 25000;
   }else if (gol == 'B' && status.equalsIgnoreCase("Nikah")){
     gajiPokok = 350000;
     tunjangan = 75000;
   }else if (gol == 'B' && status.equalsIgnoreCase("Belum")){
     gajiPokok = 350000;
     tunjangan = 60000;
   }
   //menentukan prosentase berdasarkan gaji pokok
   if(gajiPokok <= 300000){
     prosentase = 5;
   }else if (gajiPokok > 300000){
     prosentase = 10;
   }
   //menghitung potongan iuran
   potIuran = (gajiPokok + tunjangan) * prosentase / 100;
   //menghitung gaji bersih
   gajiBersih = gajiPokok + tunjangan - potIuran;
    
   //output
   System.out.println("Nama                : " + nama);
   System.out.println("Golongan (A/B)      : " + gol);
   System.out.println("Status (Nikah/Belum): " + status);
   System.out.println("===================================");
   System.out.println("Gaji Pokok          : Rp. " + gajiPokok);
   System.out.println("Tunjangan           : Rp. " + tunjangan);
   System.out.println("Potongan Iuran      : Rp. " + potIuran);
   System.out.println("Gaji Bersih         : Rp. " + gajiBersih);
  }
}
/**
  Nama  : Taufik Hidayat
  NIM   : 301200032
*/