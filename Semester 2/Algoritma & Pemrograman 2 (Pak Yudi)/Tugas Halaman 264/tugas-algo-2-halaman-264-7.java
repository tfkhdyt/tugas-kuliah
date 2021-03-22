import java.util.Scanner;
import java.util.Arrays;

class Jam {
  static Scanner in = new Scanner(System.in);
  
  static void hariBesok(String hari) {
    hari = hari.substring(0,1).toUpperCase() + hari.substring(1).toLowerCase();
    String[] array = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
    
    int index = Arrays.asList(array).indexOf(hari);
    String indexharibesok = "";
    if(index == 6){
      indexharibesok = array[0];
    }else{
      indexharibesok = array[index + 1];
    }
    
    String haribesok = indexharibesok;
    System.out.printf("\nBesok adalah hari " + haribesok);
  }

  public static void main(String[] args) {
    String hari;
    System.out.print("Masukkan hari : ");
    hari = in.nextLine();
    
    hariBesok(hari);
  }
}
