import java.util.*;
 class Pinjaman
 {
   public static void main(String args[])
   { 
    Scanner inp = new Scanner(System.in);
    int pinjaman, lamaAngsuran, angsuran, pembayaran;
    System.out.print("Masukkan besar pinjaman        : ");
    pinjaman = inp.nextInt();

    System.out.print("Masukkan lama angsuran (bulan) : ");
    lamaAngsuran = inp.nextInt();

    angsuran = pinjaman/lamaAngsuran;

    System.out.println("\n==============================\n");
    
    for(int i=0; i<lamaAngsuran; i++){
      pembayaran = angsuran + (pinjaman * 1 / 100);
      System.out.println("Pembayaran bulan ke-"+(i+1)+" = Rp"+pembayaran);
      pinjaman = pinjaman - angsuran;
    }
    inp.close(); 
   }
 }
