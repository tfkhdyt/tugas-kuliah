import java.util.Scanner;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

class NomorSebelas {
  static void jam(String date, String time){
    String comTime;
    comTime = date.substring(6,10)+"-"+date.substring(3,5)+"-"+date.substring(0,2)+"T"+time;
    
    int detik = 0;
    while(true){
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      LocalDateTime myDateObj = LocalDateTime.parse(comTime).plusSeconds(detik);
      DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("EEE, dd-MM-yyyy HH:mm:ss");
      String formattedDate = myDateObj.format(myFormatObj);
      switch(formattedDate.substring(0,3)){
        case "Mon":
          formattedDate = "Senin"+formattedDate.substring(3);break;
        case "Tue":
          formattedDate = "Selasa"+formattedDate.substring(3);break;
        case "Wed":
          formattedDate = "Rabu"+formattedDate.substring(3);break;
        case "Thu":
          formattedDate = "Kamis"+formattedDate.substring(3);break;
        case "Fri":
          formattedDate = "Jumat"+formattedDate.substring(3);break;
        case "Sat":
          formattedDate = "Sabtu"+formattedDate.substring(3);break;
        case "Sun":
          formattedDate = "Minggu"+formattedDate.substring(3);break;
      }
      System.out.println(formattedDate);
      detik++;
      try{
        Thread.sleep(1000);
      }catch(Exception ex){
      }
      
    }

  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String date, time;
    System.out.print("Masukkan Tanggal (dd-MM-yyyy) : ");
    date = in.next();
    System.out.print("Masukkan Waktu (hh:mm:ss) : ");
    time = in.next();
    jam(date, time);
  }
}
