import java.util.Scanner;
class NomorSatu {
  static void hitungJumlah(int n) {
    int genap = 0;
    int j = 0;
    System.out.println();
    for (int i = 0; i < n; i++) {
      genap += j;
      System.out.print(j + " ");
      j += 2;
    }
    System.out.println("\n\nJumlah " + n + " bilangan genap pertama adalah : " + genap);
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = 0;
    try {
      System.out.print("Masukkan nilai N : ");
      n = in .nextInt();
      hitungJumlah(n);
    } catch (Exception ex) {
      System.out.println("\nInput tidak valid, input harus bertipe integer (bilangan bulat)");
    } finally {
      in.close();
    }
  }
}
