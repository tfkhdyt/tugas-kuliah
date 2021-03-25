import java.util.Scanner;
import java.util.Arrays;

class NomorDelapan {
  static Scanner in = new Scanner(System.in);
  
  static void hariKemarin(String hari) {
    hari = hari.substring(0,1).toUpperCase() + hari.substring(1).toLowerCase();
    String[] array = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
    
    int index = Arrays.asList(array).indexOf(hari);
    String indexharikemarin = "";
    if(index == 0){
      indexharikemarin = array[6];
    }else{
      indexharikemarin = array[index - 1];
    }
    
    String harikemarin = indexharikemarin;
    System.out.print("\nKemarin adalah hari " + harikemarin);
  }

  public static void main(String[] args) {
    String hari;
    System.out.print("Masukkan hari : ");
    hari = in.nextLine();
    
    hariKemarin(hari);
  }
}
