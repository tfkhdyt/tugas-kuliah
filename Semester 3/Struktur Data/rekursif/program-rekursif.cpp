#include <stdio.h>
int fact_rec(int n) {
  /**********************************************************
  Menghitung sebuah faktorial secara rekursif
  ***********************************************************/
  if (n < 0)
    return 0; // menambah indentasi agar lebih mudah dibaca
  else if (n == 0)
    return 1;
  else if (n == 1)
    return 1;
  else
    return n * fact_rec(n-1);
}
int main() { // mengubah tipe data function main ke int
  int fac;
  printf("Masukkan berapa faktorial : ");
  scanf("%d", &fac);
  printf("Hasil faktorial dari %d adalah : %d\n", fac, fact_rec(fac)); // belum menampilkan angka yang akan difaktorialkan
  return 0; // agar program berakhir
}
