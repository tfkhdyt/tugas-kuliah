import java.util.*;
/**
  Nama  : Taufik Hidayat
  NIM   : 301200032
  Prodi : Teknik Informatika
*/
 // Compiler version JDK 11.0.2

 class perulangan_while
 {
   public static void main(String args[])
   { 
    Scanner inp = new Scanner(System.in);
    int i = 1;
    int a = 1;
    int b = 1;
    int x = 2;
    System.out.print("Masukkan jumlah perulangan : ");
    int j = inp.nextInt();
    System.out.println("\nGanjil");
    do{
      System.out.print(i+" ");
      i+=2;
      a++;
    }while(a<=j);
    
    System.out.println("\nGenap");
    do{
      System.out.print(x+" ");
      x+=2;
      b++;
    }while(b<=j);
   }
 }
