#include <iostream>
using namespace std;

int main() {
  printf("PROGRAM HITUNG LUAS SEGITIGA\n");
  printf("============================\n");

  float tinggi, alas, hasil;

  printf("Tinggi : "); cin >> tinggi;
  printf("Alas   : "); cin >> alas;

  hasil = alas * tinggi / 2;

  printf("Luas segitiga : %.1f m²", hasil);

  return 0;
}