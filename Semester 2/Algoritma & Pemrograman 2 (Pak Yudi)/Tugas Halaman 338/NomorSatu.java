package com.tfkhdyt.halaman338;
import java.util.*;

public class NomorSatu{
  static Scanner in = new Scanner(System.in);
  
  public static void findIndex(int n) {
    Integer[] a = new Integer[n];
    for(int i = 0; i < n; i++){
      System.out.print("a["+i+"] = ");
      a[i] = in.nextInt();
    }
    
    System.out.print("Masukkan nilai x : ");
    int x = in.nextInt();
  
    int index = Arrays.asList(a).indexOf(x);
    
    if(Arrays.asList(a).contains(x)){
      System.out.print("\nElemen " + x + " berada pada indeks ke-" + (index + 1));
    }else{
      System.out.print("\nElemen " + x + " berada pada indeks ke-" + 0);
    }   
  }

  public static void main(String[] args) {
    System.out.print("Masukkan jumlah elemen : ");
    int n = in.nextInt();
    
    findIndex(n);
  }
}
