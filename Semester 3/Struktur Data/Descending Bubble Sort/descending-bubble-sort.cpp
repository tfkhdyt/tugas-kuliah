#include <iostream>
using namespace std;

void cetakGaris() { // function untuk mencetak garis horizontal
  printf("=========================================\n");
}

void cetakNama() { // function untuk menampilkan nama, nim, kelas, dan judul program
  printf(
    "Nama          : Taufik Hidayat\n"
    "NIM           : 301200032\n"
    "Kelas         : IF Pagi\n"
    "Judul Program : Descending Bubble Sort\n"
  );
  cetakGaris(); // panggil function cetakGaris()
}

void tukar(int *a, int *b) { // function untuk menukar 2 buah data
  int temp = *a; // masukkan alamat variabel a ke variabel temp
  *a = *b; // masukkan alamat variabel b ke alamat variabel a
  *b = temp; // masukkan variabel temp ke alamat variabel b
}

void urutkanArray(int array[], int jumlahIndex) { // function untuk mengurutkan array
  for (int i = 1; i < jumlahIndex; i++) { // lakukan perulangan for sebanyak jumlah index dengan nilai awal 1
    for (int j = jumlahIndex - 1; j >= i; j--) { // lakukan perulangan for ketika variabel j lebih dari sama dengan variabel i dengan nilai awal jumlah index - 1
      if(array[j] > array[j-1]) { // apabila value array[j] lebih dari value array[j-1]
        tukar(&array[j], &array[j-1]); // panggil function tukar dengan argumen &array[j] dan &array[j-1]
      }
    }
  }
}

void cetakArray(int array[], int jumlahIndex) { // function untuk mencetak array
  for (int i = 0; i < jumlahIndex; i++) { // lakukan perulangan for sebanyak jumlahIndex dengan nilai awal 0
    printf("%d", array[i]); // cetak value dari index
    if(i < jumlahIndex - 1) printf(", "); // cetak tanda koma untuk array
  }
}

int main() {
  int jumlahIndex, array[20]; // deklarasi variabel jumlahIndex dan array
  cetakNama(); // memanggil function cetakNama()
  printf("Masukkan jumlah index array (max 20) : "); // input jumlah index
  cin >> jumlahIndex;
  
  for (int i = 0; i < jumlahIndex; i++) { // input data array
    printf("Masukkan data index ke-%d : ", i+1);
    cin >> array[i];
  }
  cetakGaris(); // panggil function cetakGaris()
  
  printf("Array sebelum diurutkan:\n"); // menampilkan array sebelum diurutkan
  cetakArray(array, jumlahIndex);
  
  urutkanArray(array, jumlahIndex); // panggil function urutkanArray dengan argumen array dan jumlahIndex
  
  printf("\nArray sesudah diurutkan:\n"); // menampilkan array sesudah diurutkan
  cetakArray(array, jumlahIndex);
  return 0; // untuk mengakhiri program
}
