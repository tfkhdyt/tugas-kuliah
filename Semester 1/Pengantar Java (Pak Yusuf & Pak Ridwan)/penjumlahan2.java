import java.util.Scanner;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { Scanner inp = new Scanner(System.in);
    System.out.println("ProgramPemjumlahan2bil!");
    int bil1,bil2,bil3;
    System.out.print("Masukanbil1=");
    bil1 =inp.nextInt();
    System.out.print("Masukanbil2=");
    bil2 =inp.nextInt();
    System.out.print("Masukanbil3=");
    bil3 =inp.nextInt();
    System.out.println("jumlahbil1+bil2 =" + (bil1+bil2));
    System.out.println("jumlahbil2+bil3 =" + (bil2+bil3));
    System.out.println("jumlahbil3+bil1 =" + (bil3+bil1));
   }
   
 }
