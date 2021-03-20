class functionReturn {
  static int tambah(int a, int b) {
    return a + b;
  }

  static int kurang(int x, int y) {
    return x - y;
  }

  static int kali(int p, int q) {
    return p * q;
  }

  static int bagi(int c, int d) {
    return c / d;
  }

  static int modulus(int e, int f) {
    return e % f;
  }

  static double pangkat(int g, int h) {
    return Math.pow(g, h);
  }

  public static void main(String[] args) {
    System.out.println("Hasil penjumlahan dari 2 + 2 = " + tambah(2, 2));
    System.out.println("Hasil pengurangan dari 3 - 4 = " + kurang(3, 4));
    System.out.println("Hasil perkalian dari   6 * 2 = " + kali(6, 2));
    System.out.println("Hasil pembagian dari   8 / 4 = " + bagi(8, 4));
    System.out.println("Hasil modulus dari     7 % 3 = " + modulus(7, 3));
    System.out.println("Hasil pangkat dari    5 ** 4 = " + pangkat(5, 4));
  }
}
