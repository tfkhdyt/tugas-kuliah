#include <iostream>
#include <stdlib.h>
using namespace std;

// Deklarasi & inisialisasi global variable
bool arraySudahTerisi = false;

// Fungsi-fungsi
// Fungsi clear screen
void clear() {
  // UNIX
  system("clear");
  // Windows
  // system("CLS");
}

// Fungsi untuk menampilkan garis
void tampilGaris() {
  printf("-------------------------------------------\n");
}

// Fungsi untuk menampilkan nama, NIM, dan kelas dari pembuat program
void tampilNama() {
  printf("Nama Anggota : Taufik Hidayat (301200032)\n");
  printf("               Teja Kusumah   (301200033)\n");
  printf("Kelas        : IF Pagi\n");
  tampilGaris();
}

// Fungsi untuk menampilkan menu
void tampilMenu() {
  printf("1. Masukkan nilai\n");
  printf("2. Lihat array\n");
  printf("3. Hapus elemen array\n");
  printf("4. Reset\n");
  printf("5. Exit\n");
}

// Fungsi untuk memasukkan nilai² ke dalam array
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
  clear();
  return array[jumlah];
}

// Fungsi untuk menampilkan isi array
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

// Fungsi untuk menghapus data dari array
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
  clear();
}

// Fungsi untuk me-reset array 
void reset(int array[], int &jumlah){
  array = {};
  jumlah = 0;
  arraySudahTerisi = false;
  clear();
}

// Fungsi utama
int main() {
  // Deklarasi & inisialisasi local variable
  char menu;
  int array[20] = {}, jumlah = 0;
  
  // Agar program terus berjalan sampai di-exit oleh user
  while(true) {
    tampilNama();
    tampilMenu();
    tampilGaris();
    printf("Pilih menu (1 - 5): ");
    cin >> menu;

    // Switch untuk setiap menu
    switch(menu) {
      // Memasukkan nilai
      case '1':
        if (!arraySudahTerisi){
          masukkanNilai(array, jumlah);
          printf("Input array sukses!\n");
          tampilGaris();
        } else {
          clear();
          printf("Array sudah terisi! Mohon reset terlebih dahulu\n");
          tampilGaris();
        }
        break;
      // Melihat array
      case '2':
        clear();
        tampilArray(array, jumlah);
        break;
      // Menghapus data
      case '3':
        clear();
        tampilArray(array, jumlah);
        hapusData(array, jumlah);
        printf("Data berhasil dihapus!\n");
        tampilGaris();
        tampilArray(array, jumlah);
        break;
      // Reset data
      case '4':
        char pilihan;
        printf("Apakah Anda yakin ingin me-reset array (y/n)? ");
        cin >> pilihan;
        switch (pilihan) {
          case 'y':
            reset(array, jumlah);
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
      // Exit program
      case '5':
        clear();
        printf("Anda telah keluar dari program!");
        return 0;
      // Handle input tidak valid
      default:
        clear();
        printf("Input tidak valid! Pilih menu yang benar\n");
        tampilGaris();
        break;
    }
  }
}
