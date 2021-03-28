package com.tfkhdyt.halaman293;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class NomorEmpat {
  static String durasi(String jam1, String jam2){
    LocalTime waktu1 = LocalTime.parse(jam1);
    LocalTime waktu2 = LocalTime.parse(jam2);
    Duration diff = Duration.between(waktu1, waktu2);
    String hms = String.format("%02d:%02d:%02d", (Math.abs(diff.getSeconds()/3600)),(Math.abs(diff.getSeconds()/60%60)),Math.abs(diff.getSeconds()%60));
    return hms;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String jam1,jam2;
    
    System.out.print("Masukan jam 1 (HH:mm:ss) : ");
    jam1 = in.nextLine();
    System.out.print("Masukan jam 2 (HH:mm:ss) : ");
    jam2 = in.nextLine();
    
    System.out.println("\nSelisih waktunya adalah  : " + durasi(jam1,jam2));
  }

}
