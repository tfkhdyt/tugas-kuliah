package com.tfkhdyt.halaman338;

import java.util.*;

public class NomorSepuluh {
  static Scanner in = new Scanner(System.in);

  static void mid(int n) {
    double[] a = new double[n];
    for (int j = 0; j < n; j++) {
      System.out.print("a[" + j + "] = ");
      a[j] = in.nextInt();
    }
    
    Arrays.sort(a); 
    System.out.print("\na = ");
    for(double i:a){
      int b = (int) i;
      System.out.print(b+" ");
    }

    double m = 0;
    if (n % 2 == 1) {
      m = a[(n + 1) / 2 - 1];
    } else {
      m = (a[n / 2 - 1] + a[n / 2]) / 2;
    }
    
    System.out.print("\nNilai mediannya adalah " + m);
  }

  public static void main(String[] args) {
    System.out.print("Masukkan jumlah elemen : ");
    int n = in .nextInt();

    mid(n);
  }

}
