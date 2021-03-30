package com.tfkhdyt.halaman338;

import java.util.Scanner;

public class NomorDelapan {
  static Scanner in = new Scanner(System.in);
  
  static void lebihDari(int n){
    int[] a = new int[n];
    
    for(int i = 0;i < a.length;i++){
      System.out.print("a["+i+"] = ");
      a[i] = in.nextInt();
    }
    
    System.out.print("\nA = ");
    for(int j:a){
      System.out.print(j + " ");
    }
    
    int sum = 0;
    System.out.print("\nHasil = ");
    for(int i = 1; i < a.length;i++){
      sum += a[i - 1];
      if(a[i] > sum){
        System.out.print(a[i] + " ");
      }
    }
  }
  
  public static void main(String[] args) {
    System.out.print("Masukkan jumlah elemen : ");
    int n = in.nextInt();
    
    lebihDari(n);
  }

}
