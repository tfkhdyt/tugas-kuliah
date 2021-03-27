package com.tfkhdyt.halaman293;

import java.util.Scanner;

public class NomorDua {
  static double jarak(double x1, double y1, double x2, double y2){
    return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2,2));
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double x1,y1,x2,y2;
    
    System.out.print("Masukkan nilai x1 : ");
    x1 = in.nextDouble();
    System.out.print("Masukkan nilai y1 : ");
    y1 = in.nextDouble();
    System.out.print("Masukkan nilai x2 : ");
    x2 = in.nextDouble();
    System.out.print("Masukkan nilai y2 : ");
    y2 = in.nextDouble();
    
    System.out.printf("\nd = √(%.2f - %.2f)² + (%.2f - %.2f)²",x1,x2,y1,y2);
    System.out.printf("\nJarak kedua titik tersebut adalah : %.2f", jarak(x1,y1,x2,y2));
  }

}
