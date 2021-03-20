import java.util.Scanner;

 /**
   Nama  : Taufik Hidayat
   NIM   : 301200032
   Prodi : Teknik Informatika
 */

 class Kelulusan2
 {
   public static void main(String args[])
   { 
    Scanner inp = new Scanner(System.in);
    String nama;
    String status = "";
    String jk2 = "";
    
    System.out.print("Masukkan nama anda                : ");
    nama = inp.nextLine();
   
    System.out.print("Masukkan jenis kelamin anda (L/P) : ");
    char jk = Character.toUpperCase(inp.next().charAt(0));
    
    System.out.print("Masukkan tinggi badan anda        : ");
    int tb = inp.nextInt();
    
    if(jk == 'L' && tb <= 170)
      status = "Anda gagal";
    else if(jk == 'L' && tb >= 171)
      status = "Selamat anda lulus";
    else if(jk == 'P' && tb <= 160)
      status = "Anda gagal";
    else if(jk == 'P' && tb >= 161)
      status = "Selamat anda lulus";
      
    if(jk == 'L')
      jk2 = "Laki-laki";
    else if(jk == 'P')
      jk2 = "Perempuan";
     
    System.out.println("================================");
    System.out.println("Nama          : "+nama);
    System.out.println("Jenis kelamin : "+jk2);
    System.out.println("Tinggi badan  : "+tb+" cm");
    System.out.println(status);
    System.out.println("================================");
   }
 }
    