import java.util.Scanner;

public class NomorDuaBelas {
  static void membuatSegitiga(int n) {
    for (int x = 1; x <= n; x++) {
      for (int y = 10; y > x; y--) {
        System.out.print(" ");
      }
      int y = 0;
      for (y = 1; y < x + 1; y++) {
        if (y + x - 1 > 9) {
          System.out.print(y + x - 11);
        } else {
          System.out.print(y + x - 1);
        }
      }
      for (int z = y + x - 3; z > x - 1; z--) {
        if (z > 9) {
          System.out.print(z - 10);
        } else {
          System.out.print(z);
        }
      }
      System.out.println();
    }

  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan nilai N : ");
    int n = in .nextInt();
    membuatSegitiga(n);
  }
} 
