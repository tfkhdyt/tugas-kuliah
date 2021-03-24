import java.util.Scanner;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class SelisihTanggal {
   static void tanggalBesok(String date){
      String dateOld = date;
      date = date.substring(6)+"-"+date.substring(3,5)+"-"+date.substring(0,2);
      LocalDate tanggal = LocalDate.parse(date);
      LocalDate tanggalAwal = LocalDate.of(1900, 01, 01);
      long daysBetween = ChronoUnit.DAYS.between(tanggalAwal, tanggal);
      System.out.println("\nSelisih hari dari 01-01-1900 ke "+dateOld+" adalah "+daysBetween+" hari");
   }
   public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      System.out.print("Masukkan tanggal (dd-MM-yyyy): ");
      String date = in.next();
      tanggalBesok(date);
   }
}