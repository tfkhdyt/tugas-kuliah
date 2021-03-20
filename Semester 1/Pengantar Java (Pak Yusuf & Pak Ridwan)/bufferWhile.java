import java.io.*;
/**
  Nama  : Taufik Hidayat
  NIM   : 301200032
  Prodi : Teknik Informatika
*/
 // Compiler version JDK 11.0.2

 class perulangan_while
 {
   public static void main(String args[])
   { 
    BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
    int i = 1;
    int a = 1;
    int b = 1;
    int x = 2;
    try{
      System.out.print("Masukkan jumlah perulangan : ");
      int j = Integer.parseInt(inp.readLine());
      System.out.println("\nGanjil");
      while(a<=j){      
        System.out.print(i+" ");
        i+=2;
        a++;
      }
      System.out.println("\nGenap");
      while(b<=j){      
        System.out.print(x+" ");
        x+=2;
        b++;
      }
    }catch(IOException ex){
      System.out.print("Error");
    }
   }
 }
