package com.tfkhdyt.halaman338;

import java.util.Scanner;

public class NomorEnam {
  static Scanner in = new Scanner(System.in);
  
  static void balik(int n){
    char[] a = new char[n];
    
    for(int i = 0;i < a.length;i++){
      System.out.print("a["+i+"] = ");
      a[i] = in.next().charAt(0);
    }
    
    System.out.print("\nSebelum: ");
    for(int i = 0;i < a.length;i++){
      System.out.print(a[i]+" ");
    }
    
    System.out.print("\nSesudah: ");
    for(int i = 1;i <= a.length;i++){
      System.out.print(a[a.length - i]+" ");
    }
  }
  
  public static void main(String[] args) {
    System.out.print("Masukkan jumlah elemen : ");
    int n = in.nextInt();
    
    balik(n);
  }

}
