package com.tfkhdyt.halaman293;

import java.util.Scanner;
import java.util.Arrays;


public class NomorLima {
  static String nextDay(String hari) {
    hari = hari.substring(0, 1).toUpperCase() + hari.substring(1).toLowerCase();
    String[] array = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
    int index = Arrays.asList(array).indexOf(hari);
    String indexharibesok = "";
    if (index == 6) {
      return indexharibesok = array[0];
    } else {
      return indexharibesok = array[index + 1];
    }
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Masukkan hari     : ");
    String hari = in.nextLine();
    
    System.out.println("Besok adalah hari : " + nextDay(hari));
  }

}
