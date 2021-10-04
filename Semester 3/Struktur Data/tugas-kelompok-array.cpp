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

void masukkanNilai(){
  
}

int main(){
  int menu;
  while(true){
    tampilNama();
    tampilMenu();
    
    tampilGaris();
    printf("Pilih menu (1 - 5): ");
    cin >> menu;
    
    switch(menu){
      case 1:
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