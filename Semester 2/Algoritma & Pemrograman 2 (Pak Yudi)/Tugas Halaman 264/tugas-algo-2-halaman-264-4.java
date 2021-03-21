import java.util.Scanner;

 // Compiler version JDK 11.0.2

 class Minimum
 {
   static void hitungUang(int uangAwal, int bunga, int lama){
     int jumlahUang;
     jumlahUang = uangAwal + (uangAwal*bunga/100) * lama;

     System.out.println("\nUang anda selama "+ lama +" tahun adalah = Rp"+jumlahUang);
   }
   
   public static void main(String args[])
   { 
    Scanner in = new Scanner(System.in);
    int uangAwal, bunga, tahun;
    System.out.print("Jumlah uang pada awal tahun = Rp");
    uangAwal = in.nextInt();
    
    System.out.print("Besar bunga dalam 1 tahun (persen) = ");
    bunga = in.nextInt();
    
    System.out.print("Lama menabung (tahun) = ");
    tahun = in.nextInt();
    
    hitungUang(uangAwal, bunga, tahun);
   }
 }
