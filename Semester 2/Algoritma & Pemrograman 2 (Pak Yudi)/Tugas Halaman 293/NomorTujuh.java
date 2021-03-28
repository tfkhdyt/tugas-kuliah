package com.tfkhdyt.halaman293;

import java.util.Scanner;


public class NomorTujuh {
  static String roman(int angka){
    String roman = "";
    switch(angka){
      case 1 : roman = "I"; break;
      case 2 : roman = "II"; break;
      case 3 : roman = "III"; break;
      case 4 : roman = "IV"; break;
      case 5 : roman = "V"; break;
      case 6 : roman = "VI"; break;
      case 7 : roman = "VII"; break;
      case 8 : roman = "VIII"; break;
      case 9 : roman = "IX"; break;
      case 10 : roman = "X"; break;
    }
    return roman;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Masukkan angka (1-10) : ");
    int angka = in.nextInt();
    
    if(angka > 0 && angka < 11){
      System.out.println("Angka romawi-nya adalah " + roman(angka));
    }else{
      System.out.println("Input tidak valid!");
    }
  }

}
