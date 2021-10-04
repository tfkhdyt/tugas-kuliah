#include <stdio.h>
int fact_it (int n) {
  int i, fak;
  /******************************************************
  * Menghitung sebuah faktorial dengan proses looping *
  ******************************************************/
  temp = 1;
  for (i = 1; i <= n; i++)
    fak = fak * i; // menambah indentasi agar lebih mudah dibaca
  return fak; // menghapus tanda kurung karena tidak perlu
}
void main() {
  int fac;
  printf("Masukkan berapa faktorial : ");
  scanf("%d", &fac);
  printf("Hasil faktorial dari %d adalah : %d\n", fac, fact_it(fac)); // belum menampilkan angka yang akan difaktorialkan
}