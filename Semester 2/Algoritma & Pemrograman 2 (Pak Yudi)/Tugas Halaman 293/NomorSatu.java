package com.tfkhdyt.halaman293;

import java.util.Scanner;

public class NomorSatu {
  static float abs(float x){
    return Math.abs(x);
  }

  static int duaKali(int y){
    return y * 2;
   }

  static boolean odd(int z){
    if(z % 2 == 1){
      return true;
    }else{
      return false;
   }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    float x;
    int y, z;

    System.out.print("Masukkan nilai X (Nilai mutlak) : ");
    x = in.nextFloat();
    System.out.print("Masukkan nilai Y (Nilai double) : ");
    y = in.nextInt();
    System.out.print("Masukkan nilai Z (Ganjil)       : ");
    z = in.nextInt();
    
    System.out.println("\nNilai mutlak dari " + x + " adalah : " + abs(x));
    System.out.println("Nilai double dari " + y + " adalah : " + duaKali(y));
    System.out.println("Nilai " + z + " adalah bilangan ganjil : " + odd(z));
  }

}
