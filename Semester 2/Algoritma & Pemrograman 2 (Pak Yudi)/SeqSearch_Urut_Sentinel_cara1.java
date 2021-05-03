import java.util.Scanner;
class SeqSearch_Urut_Sentinel_cara1{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    boolean found = false;
    
    System.out.print("Masukkan angka : ");
    int y = in.nextInt();
    int[] x = {10,20,30,40,50,60,70,80,90,100,y};
    
    int i = 0;
    while(!found & x[i] < y)
      i++;
    if(i > x.length - 2)
      System.out.println("Angka tidak ditemukan!");
    else if(x[i] == y)
      System.out.println(y + " ditemukan! Berada pada elemen ke-" + i);
    else
      System.out.println("Angka tidak ditemukan!");
    
    in.close();
  }
}