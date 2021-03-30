package com.tfkhdyt.halaman338;
import java.util.*;

public class NomorLima {
  static Scanner in = new Scanner(System.in);
  
  static void tukar(int n){
    int[] a = new int[n];
    int[] b = new int[n];
    
    for(int i = 0;i < a.length;i++){
      System.out.print("a["+i+"] = ");
      a[i] = in.nextInt();
    }
    
    for(int i = 0;i < b.length;i++){
      System.out.print("b["+i+"] = ");
      b[i] = in.nextInt();
    }
    
    System.out.print("\nBefore:\nA = ");
    for(int i = 0;i < a.length;i++){
      System.out.print(a[i]+" ");
    }
    
    System.out.print("\nB = ");
    for(int i = 0;i < b.length;i++){
      System.out.print(b[i]+" ");
    }
    
    int[] temp = b;
    b = a;
    a = temp;
    
    System.out.print("\n\nAfter:\nA = ");
    for(int i = 0;i < a.length;i++){
      System.out.print(a[i]+" ");
    }
    
    System.out.print("\nB = ");
    for(int i = 0;i < b.length;i++){
      System.out.print(b[i]+" ");
    }
  }
  
  public static void main(String[] args) {
    System.out.print("Masukkan jumlah elemen : ");
    int n = in.nextInt();
    
    tukar(n);
  }

}
