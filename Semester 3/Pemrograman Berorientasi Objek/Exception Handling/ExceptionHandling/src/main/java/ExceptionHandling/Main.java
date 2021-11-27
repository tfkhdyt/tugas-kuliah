package ExceptionHandling;

import java.util.Scanner;

public class Main {
  public static int tambah(int x, int y) {
    return x + y;
  }
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("===== PROGRAM PENJUMLAHAN =====");
    
    while (true) {
      try {
        System.out.print("Masukkan angka pertama : ");
        int x = in.nextInt();
        
        System.out.print("Masukkan angka kedua   : ");
        int y = in.nextInt();
        
        int hasil = tambah(x, y);
        
        System.out.println(
          "============ Hasil ============\n" +
          x + " + " + y + " = " + hasil + "\n" +
          "==============================="
          
        );
        break;
      } catch (java.util.InputMismatchException ex) {
        in.nextLine();
        System.out.println(
          "\nInput tidak valid!\n" +
          "Mohon masukkan bilangan bulat\n" 
        );
      }
    }
    in.close();
  }
}
