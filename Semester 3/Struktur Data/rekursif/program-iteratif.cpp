#include <stdio.h>
int fact_it (int n) {
  int i, fak = 1; // menambahkan nilai awal variable fak
  /******************************************************
  * Menghitung sebuah faktorial dengan proses looping *
  ******************************************************/
  // temp = 1; menghapus variable temp karena tidak diperlukan
  for (i = 1; i <= n; i++)
    fak = fak * i; // menambah indentasi agar lebih mudah dibaca
  return fak; // menghapus tanda kurung karena tidak perlu
}

int main() { // ubah tipe data main function ke int
  int fac;
  printf("Masukkan berapa faktorial : ");
  scanf("%d", &fac);
  printf("Hasil faktorial dari %d adalah : %d\n", fac, fact_it(fac)); // belum menampilkan angka yang akan difaktorialkan
  return 0; // menambah return 0 untuk mengakhiri program
}
