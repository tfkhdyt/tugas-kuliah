import java.util.Scanner;

 /**
   Nama  : Taufik Hidayat
   NIM   : 301200032
   Prodi : Teknik Informatika
 */

 class Kelulusan
 {
   public static void main(String args[])
   { 
    Scanner inp = new Scanner(System.in);
    
    System.out.print("Masukkan nama anda  : ");
    String nama = inp.nextLine();
    
    System.out.print("Masukkan NIM anda   : ");
    String nim = inp.nextLine();
    
    System.out.print("Masukkan nilai anda : ");
    int nilai = inp.nextInt();
    
    System.out.println("=====================");
    System.out.println("Nama : "+nama);
    System.out.println("NIM  : "+nim);
    if(nilai>=75)
      System.out.println("Selamat anda lulus.");
    else
      System.out.println("Anda tidak lulus.");
    
    System.out.println("=====================");
   }
 }
    