import java.util.Scanner;
import java.time.LocalDate;

public class NomorSembilan {
   static void tanggalBesok(String date){
      date = date.substring(6)+"-"+date.substring(3,5)+"-"+date.substring(0,2);
      LocalDate tanggal = LocalDate.parse(date);
      LocalDate yesterday = tanggal.minusDays(1);
      String yesterdays = yesterday.toString();
      yesterdays = yesterdays.substring(8,10)+"-"+yesterdays.substring(5,7)+"-"+yesterdays.substring(0,4);
 
      System.out.println("\nKemarin adalah tanggal "+yesterdays);
   }
   public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      System.out.print("Masukkan tanggal (dd-MM-yyyy): ");
      String date = in.next();
      tanggalBesok(date);
   }
}
