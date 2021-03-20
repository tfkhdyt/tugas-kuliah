import java.util.Scanner;
/**
  Nama  : Taufik Hidayat
  NIM   : 301200032
  Prodi : Teknik Informatika
*/
class scanner{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int b1,b2,hasil;
        
        System.out.print("Masukkan bilangan pertama : ");
        b1 = inp.nextInt();
        System.out.print("Masukkan bilangan kedua   : ");
        b2 = inp.nextInt();
        
        hasil = b1 + b2;
        System.out.print("Bilangan 1 + Bilangan 2   : "+hasil);
    }
}
