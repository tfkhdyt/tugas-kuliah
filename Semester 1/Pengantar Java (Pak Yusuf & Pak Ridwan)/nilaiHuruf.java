import java.util.Scanner;

 /**
   Nama  : Taufik Hidayat
   NIM   : 301200032
   Prodi : Teknik Informatika
 */

 class NilaiHuruf
 {
   public static void main(String args[])
   { 
    Scanner inp = new Scanner(System.in);
    String huruf;
    
    System.out.print("Masukkan nilai anda : ");
    int nilai = inp.nextInt();
  
    if(nilai >= 86 && nilai <= 100)
      huruf = "A";
    else if(nilai >= 76 && nilai <= 85)
      huruf = "B";
    else if(nilai >= 66 && nilai <= 75)
      huruf = "C";
    else if(nilai >= 56 && nilai <= 65)
      huruf = "D";
    else if(nilai >= 0 && nilai <= 55)
      huruf = "E";
    else
      huruf = "Error";
      
    System.out.println("=====================");
    System.out.println("Huruf nilai anda : "+huruf);
    System.out.println("=====================");
   }
 }
