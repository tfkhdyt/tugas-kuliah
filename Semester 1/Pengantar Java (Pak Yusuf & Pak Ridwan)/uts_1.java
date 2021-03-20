import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    double pembelian, diskon, hargaBayar;
    pembelian = 1000000;
    diskon = pembelian * 0.1;
    hargaBayar = pembelian - diskon;
    
    System.out.println("Jumlah pembelian = Rp " + pembelian);
    System.out.println("Diskon           = Rp " + diskon);
    System.out.println("Harga bayar      = Rp " + hargaBayar);
   }
 }
