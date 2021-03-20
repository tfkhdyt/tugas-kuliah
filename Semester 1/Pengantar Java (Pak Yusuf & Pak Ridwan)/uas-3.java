import java.util.Scanner;
 class MataUang
 {
   public static void main(String args[])
   { 
    Scanner inp = new Scanner(System.in);
    System.out.print("Masukkan nilai rupiah : ");
    double rupiah = inp.nextInt();
   
    double dollar = Math.floor(rupiah * 0.000071 * 100) / 100;
    double euro = Math.floor(rupiah * 0.000059 * 100) / 100;
    
    System.out.println("\n=============================");
    System.out.println("\nRupiah : Rp"+ rupiah);
    System.out.println("Dollar : $ "+ dollar);
    System.out.println("Euro   : € "+ euro);
   }
 }
