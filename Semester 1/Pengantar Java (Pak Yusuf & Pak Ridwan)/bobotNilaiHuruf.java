import java.util.Scanner;

 /**
   Nama  : Taufik Hidayat
   NIM   : 301200032
   Prodi : Teknik Informatika
 */

 class Bobot
 {
   public static void main(String args[])
   { 
    Scanner inp = new Scanner(System.in);
    int angka = 0;
    System.out.print("Masukkan nilai huruf : ");
    char huruf = Character.toUpperCase(inp.next().charAt(0));
    
    switch(huruf){
      case 'A': angka = 4;break;
      case 'B': angka = 3;break;
      case 'C': angka = 2;break;
      case 'D': angka = 1;break;
      case 'E': angka = 0;break;
    }
    
    System.out.println("=======================");
    System.out.println("Bobot angka : "+angka);
    System.out.println("=======================");
   }
 }
