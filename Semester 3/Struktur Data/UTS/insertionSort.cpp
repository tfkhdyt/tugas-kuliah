#include <iostream>
using namespace std;

void cetakGaris() {
  printf("========================================\n");
}

void cetakNama() {
  printf(
    "Nama          : Taufik Hidayat\n"
    "NIM           : 301200032\n"
    "Kelas         : IF Pagi\n"
    "Judul Program : Insertion Sort\n"
  );
  cetakGaris();
}

void insertionSort(int array[], int jumlah) {
  for (int i = 1; i < jumlah; i++) {
    int key = array[i];
    int j = i - 1;

    while (j >= 0 && array[j] > key) {
      array[j + 1] = array[j];
      j = j - 1;
    }
    array[j + 1] = key;
  }
}

void cetakArray(int array[], int jumlah) {
  for (int i = 0; i < jumlah; i++) {
    printf("%d", array[i]);
    if(i < jumlah - 1) printf(", ");
  }
}

int main() {
  int jumlah, array[20];
  cetakNama();
  
  printf("Masukkan jumlah index array : ");
  cin >> jumlah;
  
  for (int i = 0; i < jumlah; i++) {
    printf("Masukkan nilai index ke-%d : ", i + 1);
    cin >> array[i];
  }
  
  cetakGaris();
  printf("Array sebelum diurutkan : ");
  cetakArray(array, jumlah);
  printf("\nArray sesudah diurutkan : ");
  insertionSort(array, jumlah);
  cetakArray(array, jumlah);

  return 0;
}