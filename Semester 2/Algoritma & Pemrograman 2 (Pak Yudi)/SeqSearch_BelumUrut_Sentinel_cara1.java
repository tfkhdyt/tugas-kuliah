import java.util.Scanner;
class SeqSearch_BelumUrut_Sentinel_cara1{
  public static void main(String[] args){
    int[] x = {20,50,10,30,90,60,70,80,40,100,-1};
    Scanner in = new Scanner(System.in);
    
    System.out.print("Masukkan angka : ");
    int y = in.nextInt();
    
    x[x.length - 1] = y;
    
    int i = 0;
    while(x[i] != y)
      i++;
    if(i > x.length - 2)
      System.out.println("Angka tidak ditemukan!");
    else
      System.out.println(y + " ditemukan! Berada pada elemen ke-" + i);
    
    in.close();
  }
}