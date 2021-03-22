import java.util.Scanner;
 class NilaiHuruf
 {
   static void println(String str){
     System.out.println(str);
   }
   static void print(String str){
     System.out.print(str);
   }
   
   public static void main(String args[])
   { 
    Scanner in = new Scanner(System.in);
    int nim,nilaiAngka;
    String kelas;
    String nama = "";
    
    println("===== Program Penghitung Nilai Huruf =====\n");
    print("   Masukkan NIM         : ");
    nim = in.nextInt(); in.nextLine();
    print("   Masukkan nama        : ");
    nama = in.nextLine();
    print("   Masukkan kelas       : ");
    kelas = in.nextLine();
    print("   Masukkan nilai angka : ");
    nilaiAngka = in.nextInt();
    
    
    String nilaiHuruf = "";
    if(nilaiAngka >= 0 && nilaiAngka < 20){
      nilaiHuruf = "E";
    }else if(nilaiAngka >= 20 && nilaiAngka < 40){
      nilaiHuruf = "D";
    }else if(nilaiAngka >= 40 && nilaiAngka < 60){
      nilaiHuruf = "C";
    }else if(nilaiAngka >= 60 && nilaiAngka < 75){
      nilaiHuruf = "B";
    }else if(nilaiAngka >= 75 && nilaiAngka <= 100){
      nilaiHuruf = "A";
    }else{
      nilaiHuruf = "Nilai angka tidak valid!";
    }
    
    println("\n================= Output =================\n");
    println("   NIM         : " + nim);
    println("   Nama        : " + nama);
    println("   Kelas       : " + kelas);
    println("   Nilai Angka : " + nilaiAngka);
    println("   Nilai Huruf : " + nilaiHuruf);
    println("\n==========================================");
  }  
 }
