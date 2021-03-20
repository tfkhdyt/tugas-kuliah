import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
  Nama  : Taufik Hidayat
  NIM   : 301200032
  Prodi : Teknik Informatika
*/
class buffer{
    public static void main(String[] args){
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        int b1,b2,hasil;
        
        try{
          System.out.print("Masukkan bilangan pertama : ");
          b1 = Integer.parseInt(inp.readLine());
          System.out.print("Masukkan bilangan kedua   : ");
          b2 = Integer.parseInt(inp.readLine());
          
          hasil = b1 + b2;
          System.out.print("Bilangan 1 + Bilangan 2   : "+hasil);
        }catch(IOException ex){
          System.out.print("Error");
        }
    }
}
