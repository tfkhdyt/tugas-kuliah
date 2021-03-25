import java.util.Scanner;

 // Compiler version JDK 11.0.2

 class NomorDua{
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
    System.out.println("\nJumlah : " + jumlah);
    float rata = jumlah/i;
    System.out.printf("Rata rata : %.2f",rata);
   }
   
   public static void main(String args[])
   { 
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan bilangan : ");
    int bil = in.nextInt();
    
    hitungRata(bil);
   }
 }
