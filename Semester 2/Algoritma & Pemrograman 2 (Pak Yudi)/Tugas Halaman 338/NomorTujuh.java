package com.tfkhdyt.halaman338;

import java.util.Scanner;


public class NomorTujuh {
  static Scanner in = new Scanner(System.in);
  
  public static void calculateSD(double numArray[]) {
    double sum = 0.0, standardDeviation = 0.0;

    for (double num: numArray) {
      sum += num;
    }

    double mean = sum / numArray.length;

    for (double num: numArray) {
      standardDeviation += Math.pow(num - mean, 2);
    }

    double SD = Math.sqrt(standardDeviation / numArray.length);
    
    System.out.printf("\nSimpangan bakunya adalah = %.2f",SD);
  }

  public static void main(String[] args) {
    System.out.print("Masukkan jumlah elemen : ");
    int n = in.nextInt();
    
    double[] x = new double[n];
    
    for(int i = 0;i < x.length;i++){
      System.out.print("x["+i+"] = ");
      x[i] = in.nextDouble();
    }
    
    calculateSD(x);
  }
}
