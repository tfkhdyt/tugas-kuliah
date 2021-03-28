package com.tfkhdyt.halaman293;

import java.util.Scanner;


public class NomorSepuluh {
  static String pythagoras(int a, int b, int c){
    if(Math.pow(c,2) == Math.pow(a,2) + Math.pow(b,2)){
      return "adalah tripel pythagoras";
    }else{
      return "bukan tripel pythagoras";
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a,b,c;
    
    System.out.print("Masukkan nilai a (alas) : ");
    a = in.nextInt();
    System.out.print("Masukkan nilai b (tinggi) : ");
    b = in.nextInt();
    System.out.print("Masukkan nilai c (sisi miring) : ");
    c = in.nextInt();
    
    if(c > a && c > b){
      System.out.printf("\n%d, %d, %d %s",a,b,c,pythagoras(a,b,c));
    }else{
      System.out.println("Input tidak valid!\nNilai C harus lebih besar dari nilai A & B");
    }
    
  }

}
