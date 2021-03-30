package com.tfkhdyt.halaman338;
import java.util.Scanner;

public class NomorSebelas {
  static Scanner in = new Scanner(System.in);
  
  static void same(int n){
    int[] a = new int[n];
    for (int j = 0; j < n; j++) {
      System.out.print("a[" + j + "] = ");
      a[j] = in.nextInt();
    }
    
    
    for(int i = 0;i < a.length;i++){
      if(a[i] == a[a.length - 1]){
        System.out.print("\nSeluruh isi array sama");
        break;
      }else if(a[i] != a[i + 1]){
        System.out.print("\nSeluruh isi array tidak sama");
        break;
      }
    }
  }

  public static void main(String[] args) {
    System.out.print("Masukkan jumlah elemen : ");
    int n = in .nextInt();

    same(n);
  }

}
