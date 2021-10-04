#include <stdio.h>

void towers(int n, char awal, char akhir, char antara) {
  if(n == 1)
    printf("Pindahkan piringan 1 dari %c ke %c\n", awal, akhir); // menambah indentasi agar lebih mudah dibaca
  else {
    towers(n-1, awal, antara, akhir);
    printf("Pindahkan piringan %d dari %c ke %c\n", n, awal, akhir);
    towers(n-1, antara, akhir, awal);
  }
}

int main() { // ubah tipe data function main menjadi int
  int n;
  printf("Berapa piringan ? "); scanf("%d", &n);
  towers(n, 'A', 'C', 'B');
  return 0; // agar program berakhir
}
