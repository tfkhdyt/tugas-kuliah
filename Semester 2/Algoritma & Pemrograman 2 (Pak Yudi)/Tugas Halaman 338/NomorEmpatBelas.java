package com.tfkhdyt.halaman338;

import java.util.Scanner;

public class NomorEmpatBelas {
  static String cs(String s){
    String[] alphabet = {"c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s"};
    
    for(int i = 0;i < alphabet.length;i++){
      s = s.replace(alphabet[i],"");
      s = s.replace(alphabet[i].toUpperCase(),"");
    }
 
    return s;    
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Masukkan string : ");
    String s = in.nextLine();
    
    System.out.print("Hasil           : " + cs(s));
  }

}
