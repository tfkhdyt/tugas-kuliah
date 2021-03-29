package com.tfkhdyt.halaman338;
import java.util.*;

public class NomorEmpat {
  static Scanner in = new Scanner(System.in);
  
  static void min(int n){
    int[] a = new int[n];
    for(int j = 0;j < n; j++){
      System.out.print("a["+j+"] = ");
      a[j] = in.nextInt();
    }
    
    int min = a[0];
    
    for(int i = 0; i < a.length; i++){
      if(a[i] < min){
        min = a[i];
      }
    }
    
    System.out.print("\nNilai terkecil adalah " + min);
  }
  
  public static void main(String[] args) {
    System.out.print("Masukkan jumlah elemen : ");
    int n = in.nextInt();
    
    min(n);
  }

}
