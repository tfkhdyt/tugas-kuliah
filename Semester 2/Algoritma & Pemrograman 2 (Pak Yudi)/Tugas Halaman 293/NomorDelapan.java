package com.tfkhdyt.halaman293;

import java.util.Scanner;


public class NomorDelapan {
  static String lower(String huruf){
    return huruf.toUpperCase();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Masukkan huruf-huruf kecil : ");
    String huruf = in.nextLine();
    
    System.out.println(huruf + " => " + lower(huruf));
  }

}
