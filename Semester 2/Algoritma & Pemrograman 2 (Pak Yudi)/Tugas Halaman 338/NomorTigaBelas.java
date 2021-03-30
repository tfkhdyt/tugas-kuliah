package com.tfkhdyt.halaman338;

import java.util.Scanner;

public class NomorTigaBelas {
  static void concat(String s1, String s2){
    System.out.print("Hasil             : " + s1 + s2);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Masukkan String 1 : ");
    String s1 = in.nextLine();
    System.out.print("Masukkan String 2 : ");
    String s2 = in.nextLine();
    
    concat(s1,s2);
  }

}
