package com.tfkhdyt.halaman338;
import java.util.Scanner;

public class NomorSebelas {
  static Scanner in = new Scanner(System.in);

  static void same(int n) {
    int[] a = new int[n];
    for (int j = 0; j < n; j++) {
      System.out.print("a[" + j + "] = ");
      a[j] = in.nextInt();
    }

    if (a[0] != a[1]) {
      System.out.print("\nSeluruh isi array tidak sama");
    } else {
      System.out.print("\nSeluruh isi array sama");
    }
  }

  public static void main(String[] args) {
    System.out.print("Masukkan jumlah elemen : ");
    int n = in .nextInt();

    same(n);
  }

}
