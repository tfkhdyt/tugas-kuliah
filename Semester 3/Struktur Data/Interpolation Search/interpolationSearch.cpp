#include <iostream>
using namespace std;

void cetakNama() {
  printf(
    "Nama          : Taufik Hidayat\n"
    "NIM           : 301200032\n"
    "Kelas         : IF Pagi\n"
    "Jenis Program : Interpolation Search\n"
    "===========================================\n"
  );
}

int inputArray(int array[], int jumlah) {
  for(int i = 0; i < jumlah; i++) {
    printf("Masukkan data ke - %d: ", i + 1);
    cin >> array[i];
  }
  return array[jumlah];
}

int urutkanArray(int sortedArray[], int jumlah) {
  int min, temp;
  for(int i = 0; i < jumlah - 1; i++) {
    min = i;
    for(int j = i + 1; j < jumlah; j++)
      if (sortedArray[j] < sortedArray[min])
        min = j;
    temp = sortedArray[i];
    sortedArray[i] = sortedArray[min];
    sortedArray[min] = temp;
  }
  return sortedArray[jumlah];
}

int interpolationSearch(int array[], int jumlah, int angkaYangDicari) {
  int low = 0,
      high = jumlah - 1;

  while (low <= high && angkaYangDicari >= array[low] && angkaYangDicari <= array[high]) {
    if (low == high) {
      if (array[low] == angkaYangDicari) return low;
      return -1;
    }
    int pos = low + (((double)(high - low) /
      (array[high] - array[low])) * (angkaYangDicari - array[low]));

    if (array[pos] == angkaYangDicari)
      return pos;

    if (array[pos] < angkaYangDicari)
      low = pos + 1;
    else
      high = pos - 1;
  }
  return -1;
}

int main() {
  int jumlah,
  angkaYangDicari;

  cetakNama();

  printf("Masukkan jumlah data yang akan di-input: ");
  cin >> jumlah;
  int array[jumlah];
  array[jumlah] = inputArray(array, jumlah);

  urutkanArray(array, jumlah);
  printf("\nArray yang sudah diurutkan:\n[");
  for(int i = 0; i < jumlah; i++) {
    printf("%d", array[i]);
    if(i <= jumlah - 2) printf(", ");
  }
  printf("]\n");

  printf("\nMasukkan angka yang ingin dicari: ");
  cin >> angkaYangDicari;

  int index = interpolationSearch(array, jumlah, angkaYangDicari);

  printf("\nHasil: ");
  if (index != -1)
    cout << "Data ditemukan pada indeks ke-" << index;
  else
    cout << "Data tidak ditemukan!";
  return 0;
}