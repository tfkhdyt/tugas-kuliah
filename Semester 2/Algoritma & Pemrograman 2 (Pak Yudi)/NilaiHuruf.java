package com.tfkhdyt.record;
import java.util.Scanner;
class NilaiHuruf {
  int nim;
  String nama;
  String kelas;
  int nilaiAngka;
  String nilaiHuruf;
    
  NilaiHuruf(int nim, String nama, String kelas, int nilaiAngka, String nilaiHuruf) {
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    this.nilaiAngka = nilaiAngka;
    this.nilaiHuruf = nilaiHuruf;
  }

  static String huruf(int nilaiAngka) {
    String nilaiHuruf = "";
    if (nilaiAngka >= 0 && nilaiAngka < 20) {
      nilaiHuruf = "E";
    } else if (nilaiAngka >= 20 && nilaiAngka < 40) {
      nilaiHuruf = "D";
    } else if (nilaiAngka >= 40 && nilaiAngka < 60) {
      nilaiHuruf = "C";
    } else if (nilaiAngka >= 60 && nilaiAngka < 75) {
      nilaiHuruf = "B";
    } else if (nilaiAngka >= 75 && nilaiAngka <= 100) {
      nilaiHuruf = "A";
    } else {
      nilaiHuruf = "Nilai angka tidak valid!";
    }
    
    return nilaiHuruf;
  }

  static void println(String str) {
    System.out.println(str);
  }
  
  static void print(String str) {
    System.out.print(str);
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int nim, nilaiAngka;
    String kelas;
    String nama = "";

    println("===== Program Penghitung Nilai Huruf =====\n");
    print("   NIM         : ");
    nim = in .nextInt(); in .nextLine();
    print("   Nama        : ");
    nama = in .nextLine();
    print("   Kelas       : ");
    kelas = in .nextLine();
    print("   Nilai angka : ");
    nilaiAngka = in .nextInt();

    NilaiHuruf obj = new NilaiHuruf(nim, nama, kelas, nilaiAngka, huruf(nilaiAngka));

    println("\n================= Output =================\n");
    println("   NIM         : " + obj.nim);
    println("   Nama        : " + obj.nama);
    println("   Kelas       : " + obj.kelas);
    println("   Nilai Angka : " + obj.nilaiAngka);
    println("   Nilai Huruf : " + obj.nilaiHuruf);
    println("\n==========================================");
  }
}
