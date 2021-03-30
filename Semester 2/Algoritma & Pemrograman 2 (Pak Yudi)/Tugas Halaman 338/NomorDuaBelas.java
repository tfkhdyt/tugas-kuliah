package com.tfkhdyt.halaman338;
import java.util.Scanner;

public class NomorDuaBelas {
  static String toArray(String s){
    String[] arr = new String[s.length()];
    for(int i = 0;i < arr.length;i++){
      arr[i] = s.substring(i,i+1);
    }
    
    String x = "{";
    for(int i = 0;i < arr.length;i++){
      x += '"'+arr[i]+'"';
      if(i != (arr.length - 1)){
        x += ",";
      }
    }
    x += "}";
    return x;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Masukkan string : ");
    String s = in.nextLine();
    
    System.out.print("\nArray = " + toArray(s));
  }

}
