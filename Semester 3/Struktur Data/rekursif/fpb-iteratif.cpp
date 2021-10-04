#include <stdio.h>

int fpb (int m, int n) {
  int r; // deklarasi variabel r
  do {
    r = m % n;
    if (r != 0) {
      m = n;
      n = r;
    }
  } while (r != 0); // ubah kondisi perulangan jika r tidak sama dengan 0
  return n; // mengembalikan nilai n
}

int main() {
  int m, n;
  printf("Masukkan nilai m: ");
  scanf("%d", &m);
  printf("Masukkan nilai n: ");
  scanf("%d", &n);
  printf("FPB dari %d dan %d adalah: %d", m, n, fpb(m, n));
  return 0;
}
