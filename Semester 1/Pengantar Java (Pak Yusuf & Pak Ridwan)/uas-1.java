import java.util.Scanner;
 class Input
 {
   public static void main(String args[])
   { 
    Scanner inp = new Scanner(System.in);
    System.out.print("Masukkan nama anda  : ");
    String nama = inp.nextLine();
    System.out.print("Masukkan kelas anda : ");
    String kelas = inp.nextLine();
    
    System.out.println("\n============================");
    
    System.out.println("\nOutput: ");
    System.out.println("Nama  : " + nama);
    System.out.println("Kelas : " + kelas);
   }
 }