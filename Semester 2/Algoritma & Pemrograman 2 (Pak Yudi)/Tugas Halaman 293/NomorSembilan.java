package com.tfkhdyt.halaman293;

import java.util.Scanner;


public class NomorSembilan {
  static String upper(String huruf){
    return huruf.toLowerCase();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Masukkan huruf-huruf kapital : ");
    String huruf = in.nextLine();
    
    System.out.println(huruf + " => " + upper(huruf));
  }

}
