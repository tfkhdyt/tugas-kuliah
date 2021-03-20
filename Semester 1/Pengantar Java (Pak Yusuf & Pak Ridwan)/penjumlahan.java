//statement untuk mengimport scanner ke dalam program
import java.util.Scanner;

 // Compiler version JDK 11.0.2

 class Penjumlahan
 {
   public static void main(String args[])
   { 
    //deklarasi variabel
    int bil1, bil2, bil3;
    
    //statement untuk mengambil inputan dari keyboard
    Scanner inp = new Scanner(System.in);
    
    System.out.println("Program menjumlahkan 2 bilangan");
    System.out.print("Masukkan bilangan pertama = ");
    //variabel yang digunakan sebagai tempat menyimpan inputan
    bil1 = inp.nextInt();
    System.out.print("Masukkan bilangan kedua = ");
    bil2 = inp.nextInt();
    System.out.print("Masukkan bilangan ketiga = ");
    bil3 = inp.nextInt();
    System.out.println("");
    
    //statement untuk menampilkan hasil penjumlahan
    System.out.println("Jumlah bil1 + bil2 = " + (bil1 + bil2));
    System.out.println("Jumlah bil2 + bil3 = " + (bil2 + bil3));
    System.out.println("Jumlah bil1 + bil3 = " + (bil1 + bil3));
  
    inp.close();
   }
 }
    