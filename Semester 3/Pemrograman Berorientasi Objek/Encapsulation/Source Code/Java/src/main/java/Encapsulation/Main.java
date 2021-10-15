package Encapsulation;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Mahasiswa mhs = new Mahasiswa();
    Scanner in = new Scanner(System.in);
    
    System.out.print("Masukkan Nama Anda  : ");
    mhs.setNama(in.nextLine());
    
    System.out.print("Masukkan NIM Anda   : ");
    mhs.setNim(in.nextLine());
    
    System.out.print("Masukkan Prodi Anda : ");
    mhs.setProdi(in.nextLine());
    
    System.out.print("Masukkan Email Anda : ");
    mhs.setEmail(in.nextLine());    

    System.out.println("============ Data Mahasiswa ============");
    
    System.out.println("Nama  : " + mhs.getNama());
    System.out.println("NIM   : " + mhs.getNim());
    System.out.println("Prodi : " + mhs.getProdi());
    System.out.println("Email : " + mhs.getEmail());
   
    in.close();
  }
}
