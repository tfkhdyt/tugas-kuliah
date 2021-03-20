import java.util.Scanner;
 class Penjumlahan
 {
   public static void main(String args[])
   { 
    Scanner inp = new Scanner(System.in);
    System.out.print("Masukkan bilangan 1 : ");
    float bil1 = 0;
    if(inp.hasNextFloat()){
      bil1 = inp.nextFloat();
    }else{
      System.out.println("Mohon masukkan angka yang benar!");
      System.exit(0);
    }
    
    float bil2 = 0;
    System.out.print("Masukkan bilangan 2 : ");
    if(inp.hasNextFloat()){
      bil2 = inp.nextFloat();
    }else{
      System.out.println("Mohon masukkan angka yang benar!");
      System.exit(0);
    }
    
    float bil3 = bil1 + bil2;
    
    System.out.println("\n============================");
    System.out.println("Bilangan 1 = " + bil1);
    System.out.println("Bilangan 2 = " + bil2);
    System.out.println("\nHasil\n" + bil1 + " + " + bil2 + " = " + bil3);
   }
 }
