package com.tfkhdyt.halaman293;

import java.util.Scanner;

public class NomorTiga {
  static boolean apakah_a(char huruf){
    if(huruf == 'A'){
      return true;
    }else{
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char huruf;
    
    System.out.print("Masukkan huruf : ");
    huruf = in.next().charAt(0);
    huruf = Character.toUpperCase(huruf);
    
    System.out.println("\n" + huruf + " adalah A? " + apakah_a(huruf));
  }

}
