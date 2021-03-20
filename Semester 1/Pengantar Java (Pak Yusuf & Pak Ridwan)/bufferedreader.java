import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
  Nama  : Taufik Hidayat
  NIM   : 301200032
  Prodi : Teknik Informatika
*/
class bufferedreader{
    public static void main(String[] args){
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            //input
            System.out.print("Masukkan Nama     : ");
            String nama = inp.readLine();
            
            System.out.print("Masukkan NIM      : ");
            String nim = inp.readLine();
            
            System.out.print("Masukkan Fakultas : ");
            String fak = inp.readLine();
            
            System.out.print("Masukkan Prodi    : ");
            String prodi = inp.readLine();
            
            System.out.print("Masukkan TTL      : ");
            String ttl = inp.readLine();
            
            System.out.print("Masukkan Alamat   : ");
            String alamat = inp.readLine();
            
            System.out.print("Masukkan Email    : ");
            String email = inp.readLine();
            
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
        }catch(IOException ex){
            System.out.println("Error pada saat input data");
        }
    }
}
