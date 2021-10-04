#include <iostream>
#include <stdlib.h>
using namespace std;

bool arraySudahTerisi = false;

void clear() {
  system("clear");
}

void tampilGaris() {
  printf("-------------------------------------------\n");
}

void tampilNama() {
  printf("Nama Anggota : Taufik Hidayat (301200032)\n");
  printf("               Teja Kusumah   (301200033)\n");
  printf("Kelas        : IF Pagi\n");
  tampilGaris();
}

void tampilMenu() {
  printf("1. Masukkan nilai\n");
  printf("2. Lihat array\n");
  printf("3. Hapus elemen array\n");
  printf("4. Reset\n");
  printf("5. Exit\n");
}

int masukkanNilai(int array[], int &jumlah) {
  clear();
  printf("Masukkan jumlah elemen pada array (1 - 20): ");
  cin >> jumlah;
  printf("\n");

  for(int i = 0; i < jumlah; i++) {
    printf("Masukkan angka ke-%d: ", i + 1);
    cin >> array[i];
  }
  arraySudahTerisi = true;
  return array[jumlah];
}

void tampilArray(int array[], int &jumlah) {
  printf("Array: ");
  if (jumlah == 0) printf("Kosong");
  for(int i = 0; i < jumlah; i++) {
    printf("%d", array[i]);
    if (i < jumlah - 1) printf(", ");
  }
  printf("\n");
  tampilGaris();
}

void hapusData(int array[], int &jumlah) {
  int hapus;
  printf("Masukkan data yang ingin dihapus: ");
  cin >> hapus;

  for (int i = 0; i < jumlah; i++) {
    if (array[i] == hapus) {
      for (int j = i; j < (jumlah - 1); j++) {
        array[j] = array[j + 1];
      }
    }
  }
  jumlah--;
}

void reset(int array[], int &jumlah){
  array = {};
  jumlah = 0;
}

int main() {
  int menu,
  array[20] = {},
  jumlah = 0;
  while(true) {
    tampilNama();
    tampilMenu();
    tampilGaris();
    printf("Pilih menu (1 - 5): ");
    cin >> menu;

    switch(menu) {
      case 1:
        if (!arraySudahTerisi){
          
          masukkanNilai(array, jumlah);
          clear();
          printf("Input array sukses!\n");
          tampilGaris();
        } else {
          clear();
          printf("Array sudah terisi! Mohon reset terlebih dahulu\n");
          tampilGaris();
        }
        break;
      case 2:
        clear();
        tampilArray(array, jumlah);
        break;
      case 3:
        clear();
        tampilArray(array, jumlah);
        hapusData(array, jumlah);
        clear();
        printf("Data berhasil dihapus!\n");
        tampilGaris();
        tampilArray(array, jumlah);
        break;
      case 4:
        char pilihan;
        printf("Apakah Anda yakin ingin me-reset array (y/n)? ");
        cin >> pilihan;
        switch (pilihan) {
          case 'y':
            reset(array, jumlah);
            clear();
            printf("Array berhasil direset!\n");
            tampilGaris();
            break;
          case 'n':
            clear();
            printf("Array batal direset!\n");
            tampilGaris();
            break;
          default:
            clear();
            printf("Input tidak valid!\n");
            tampilGaris();
            break;
        }
        break;
      case 5:
        clear();
        printf("Anda telah keluar dari program!");
        return 0;
      default:
        clear();
        printf("Input tidak valid! Pilih menu yang benar\n");
        tampilGaris();
        continue;
        break;
    }
  }
}