import java.util.Scanner;
class SeqSearch_Urut_nonSentinel{
  public static void main(String[] args){
    int x[] = {10,20,30,40,50,60,70,80,90,100};
    boolean exist = false;
    Scanner in = new Scanner(System.in);
    
    System.out.print("Masukkan angka : ");
    int y = in.nextInt();
    
    int i = 0;
    while((i < x.length - 1 & !exist) & (y >= x[i])){
      if(x[i] == y)
        exist = true;
      else
        i++;
    }
    
    if(exist){
      System.out.println(y + " ditemukan! Berada pada elemen ke-" + i);
    }else{
      System.out.println("Angka tidak ditemukan!");
    }
    
    in.close();
  }
}