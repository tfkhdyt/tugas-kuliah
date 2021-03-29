package com.tfkhdyt.halaman338;
import java.util.*;

public class NomorTiga {
  static Scanner in = new Scanner(System.in);
  
  static void max2(int n) {
    int[] nums = new int[5];
    
    for(int j = 0;j < n; j++){
      System.out.print("a["+j+"] = ");
      nums[j] = in.nextInt();
    }
    
    int maxOne = 0;
    int maxTwo = 0;
    for (int num: nums) {
      if (maxOne < num) {
        maxTwo = maxOne;
        maxOne = num;
      } else if (maxTwo < num) {
        maxTwo = num;
      }
    }
    
    System.out.println("\nAngka terbesar pertama : " + maxOne);
    System.out.println("Angka terbesar kedua   : " + maxTwo);
  }

  public static void main(String a[]) {
    System.out.print("Masukkan jumlah elemen : ");
    int n = in.nextInt();
  
    max2(n);
  }
}
