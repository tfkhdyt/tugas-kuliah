import java.util.Scanner;

 // Compiler version JDK 11.0.2

 class Minimum
 {
   static void hitungMin(int angka){
     int min;
     Scanner in = new Scanner(System.in);
     min = angka; 
     System.out.print("Masukkan angka = ");
     angka = in.nextInt();
     while(angka != 9999){
       if(angka < min){
         min = angka;
       }
        System.out.print("Masukkan angka = ");
        angka = in.nextInt();
     }

     System.out.println("\nNilai minimumnya adalah = "+min);
   }
   
   public static void main(String args[])
   { 
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan angka = ");
    int angka = in.nextInt();
    
    hitungMin(angka);
   }
 }
