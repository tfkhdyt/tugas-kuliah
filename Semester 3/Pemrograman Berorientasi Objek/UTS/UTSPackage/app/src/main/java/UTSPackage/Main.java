package UTSPackage;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Siapa nama Anda? ")
      String nama = in.nextLine();
      System.out.printf("Selamat datang, %s", nama);
      in.close();
  }
}
