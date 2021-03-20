import java.util.Scanner;
 class TotalGaji
 {
   public static void main(String args[])
   { 
    Scanner inp = new Scanner(System.in);
    System.out.print("Masukkan jam kerja/minggu : ");
    int jam = inp.nextInt();
    int gaji = 0;
    if(jam >= 50 && jam <= 60){
      gaji = jam * 5000;
    }else if(jam > 60){
      int kelebihan = (jam - 60) * 7500;
      gaji = jam * 5000 + kelebihan;
    }else if(jam < 50){
      int kekurangan = (50 - jam) * 2500;
      gaji = jam * 5000 - kekurangan;
    }
    
    System.out.println("\n=========================");
    System.out.println("\nJam kerja/minggu = " + jam);
    System.out.println("Total gaji       = Rp" + gaji);
   }
 }
