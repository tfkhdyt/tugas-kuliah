import java.util.Scanner;

 // Compiler version JDK 11.0.2

 class Rata
 {
   static void hitungRata(int bil){
    int jumlah = 0;
    float i = 0;
    
    while(bil != 9999){
      jumlah += bil;
      i++;
      Scanner in = new Scanner(System.in);
      System.out.print("Masukkan bilangan : ");
      bil = in.nextInt();
    }
    System.out.println("\n\nJumlah : " + jumlah);
    float rata = jumlah/i;
    System.out.println("Rata rata : " + rata);
   }
   
   public static void main(String args[])
   { 
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan bilangan : ");
    int bil = in.nextInt();
    
    hitungRata(bil);
   }
 }
