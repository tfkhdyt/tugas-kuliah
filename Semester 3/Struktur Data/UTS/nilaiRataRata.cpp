#include <iostream>
using namespace std;

void cetakGaris() {
  printf("===========================================\n");
}

void cetakNama() {
  printf(
    "Nama          : Taufik Hidayat\n"
    "NIM           : 301200032\n"
    "Kelas         : IF Pagi\n"
    "Judul Program : Menghitung Nilai Rata-rata\n"
  );
  cetakGaris();
}

float hitungRata(int nilai[3][3], int n) {
  float jumlah = 0;
  for (int i = 0; i < 3; i++) {
    jumlah += nilai[n][i];
  }
  return jumlah / 3;
}

float hitungRataMatkul(int nilai[3][3], int n) {
  float jumlah = 0;
  for (int i = 0; i < 3; i++) {
    jumlah += nilai[i][n];
  }
  return jumlah / 3;
}

int main() {
  int nilai[3][3] = {
    {70, 89, 95}, // nilai iwan
    {87, 79, 99}, // nilai adi
    {85, 77, 93}  // nilai rani
  };
  
  cetakNama();
  printf("Iwan\n");
  printf("  Pancasila    : %d\n", nilai[0][0]);
  printf("  Algoritma    : %d\n", nilai[0][1]);
  printf("  B. Indonesia : %d\n", nilai[0][2]);
  printf("  Rata-rata    : %.1f\n", hitungRata(nilai, 0));
  
  printf("\nAdi\n");
  printf("  Pancasila    : %d\n", nilai[1][0]);
  printf("  Algoritma    : %d\n", nilai[1][1]);
  printf("  B. Indonesia : %d\n", nilai[1][2]);
  printf("  Rata-rata    : %.1f\n", hitungRata(nilai, 1));
  
  printf("\nRani\n");
  printf("  Pancasila    : %d\n", nilai[2][0]);
  printf("  Algoritma    : %d\n", nilai[2][1]);
  printf("  B. Indonesia : %d\n", nilai[2][2]);
  printf("  Rata-rata    : %.1f\n", hitungRata(nilai, 2));
  
  printf("\nRata-rata nilai matkul\n");
  printf("  Pancasila    : %.1f", hitungRataMatkul(nilai, 0));
  printf("\n  Algoritma    : %.1f", hitungRataMatkul(nilai, 1));
  printf("\n  B. Indonesia : %.1f", hitungRataMatkul(nilai, 2));
  
  return 0;
}