import java.util.Scanner;
import java.util.ArrayList;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner in = new Scanner(System.in);
    System.out.println("Masukkan NIM : ");
    int nim = in.nextInt();
    System.out.println("Masukkan nama : ");
    String nama = in.nextLine();
    System.out.println("Masukkan kelas : ");
    String kelas = in.nextLine();
    System.out.println("Masukkan nilai angka : ");
    int nilaiAngka = in.nextInt();
    
    ArrayList data = new ArrayList();
    data.add(nim);
    data.add(nama);
    data.add(kelas);
    data.add(nilaiAngka);
    
    String nilaiHuruf = "";
    
    if(data.get(3) >= 0 && data.get(3) < 20){
      nilaiHuruf = "E";
    }else if(data.get(3) >= 20 && data.get(3) < 40){
      nilaiHuruf = "D";
    }else if(data.get(3) >= 40 && data.get(3) < 60){
      nilaiHuruf = "C";
    }else if(data.get(3) >= 60 && data.get(3) < 75){
      nilaiHuruf = "B";
    }else if(data.get(3) >= 75 && data.get(3) < 100){
      nilaiHuruf = "A";
    }else{
      nilaiHuruf = "Nilai angka tidak valid!";
    }
    
    data.add(nilaiHuruf);
    
    System.out.println("NIM         : " + data[0]);
    System.out.println("Nama        : " + data[1]);
    System.out.println("Kelas       : " + data[2]);
    System.out.println("Nilai Angka : " + data[3]);
    System.out.println("Nilai Huruf : " + data[4]);
  }  
 }
