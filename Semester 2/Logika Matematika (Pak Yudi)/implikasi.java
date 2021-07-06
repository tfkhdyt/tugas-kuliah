import java.util.Scanner;
public class implikasi{
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan password = ");
    String pass = in.nextLine();
    
    if(pass == 'iniPasswordNya'){
      System.out.println('\nAnda berhasil login!');
    }else{
      System.out.println('\nPassword anda salah!');
    }
  }
}
