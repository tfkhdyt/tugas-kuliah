import java.util.Scanner;
/**
  Nama  : Taufik Hidayat
  NIM   : 301200032
  Prodi : Teknik Informatika
*/
class scanner{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
       
            //input
            System.out.print("Masukkan Nama     : ");
            String nama = inp.nextLine();
            
            System.out.print("Masukkan NIM      : ");
            String nim = inp.nextLine();
            
            System.out.print("Masukkan Fakultas : ");
            String fak = inp.nextLine();
            
            System.out.print("Masukkan Prodi    : ");
            String prodi = inp.nextLine();
            
            System.out.print("Masukkan TTL      : ");
            String ttl = inp.nextLine();
            
            System.out.print("Masukkan Alamat   : ");
            String alamat = inp.nextLine();
            
            System.out.print("Masukkan Email    : ");
            String email = inp.nextLine();
            
            System.out.println("");
            System.out.println("##DATA MAHASISWA UNIBBA##");
            //output
            System.out.println("Nama     : "+nama);
            System.out.println("NIM      : "+nim);
            System.out.println("Fakultas : "+fak);
            System.out.println("Prodi    : "+prodi);
            System.out.println("TTL      : "+ttl);
            System.out.println("Alamat   : "+alamat);
            System.out.println("Email    : "+email);
        
    }
}