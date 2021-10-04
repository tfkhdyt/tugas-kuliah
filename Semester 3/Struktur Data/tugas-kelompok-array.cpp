#include <iostream>
#include <stdlib.h>
using namespace std;

void tampilGaris(){
  printf("-------------------------------------------\n");
}

void tampilNama(){
  printf("Nama Anggota : - Taufik Hidayat (301200032)\n");
  printf("               - Teja Kusumah   (301200033)\n");
  printf("Kelas        : IF Pagi\n");
  tampilGaris();
}

void tampilMenu(){
  printf("1. Masukkan nilai\n");
  printf("2. Lihat array\n");
  printf("3. Hapus elemen array\n");
  printf("4. Reset\n");
  printf("5. Exit\n");
}

int masukkanNilai(){
  int jumlah;
  printf("Masukkan jumlah elemen pada array (1 - 20): ");
  cin >> jumlah;
  int array[jumlah];
  for(int i = 0; i < jumlah; i++){
    printf("\nMasukkan angka ke-%d: ", i + 1);
    cin >> array[i];
    printf("\n");
  }
  return array[jumlah];
}

int main(){
  int menu, array[20];
  while(true){
    tampilNama();
    tampilMenu();
    
    tampilGaris();
    printf("Pilih menu (1 - 5): ");
    cin >> menu;
    
    switch(menu){
      case 1:
        system("clear");
        array[20] = masukkanNilai();
        printf("Input array sukses!\n");
        for(int i = 0; i < sizeof(array)/sizeof(array[0]); i++){
          printf("%d ", array[i]);
        }
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
      case 5:
        system("clear");
        printf("Anda telah keluar dari program!");
        return 0;
      default:
        system("clear");
        printf("Input tidak valid! Pilih menu yang benar\n");
        tampilGaris();
        continue;
        break;
    }
  }
}