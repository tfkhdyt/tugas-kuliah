package com.tfkhdyt.halaman338;
import java.util.*;

public class NomorDua {
  static Scanner in = new Scanner(System.in);
  
  static int range(int[] a){
    return a[a.length - 1] - a[0];
  }

  public static void main(String[] args) {
    System.out.print("Masukkan jumlah elemen : ");
    int n = in.nextInt();
    
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
      System.out.print("a["+i+"] = ");
      a[i] = in.nextInt();
    }
    
    Arrays.sort(a);  
    
    for(int j = 0;j < a.length;j++){
      System.out.print(a[j]+" ");
    }
    
    System.out.println("\n\nElemen pertama  : " + a[0]);
    System.out.println("Elemen terakhir : " + a[a.length - 1]);
    System.out.print("Jarak           : " + range(a));
  }

}
