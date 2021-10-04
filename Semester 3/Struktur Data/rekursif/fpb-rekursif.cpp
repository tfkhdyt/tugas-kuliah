#include <stdio.h>

int FPB(int m, int n) {
  if(m == 0) return n;
  else if(m < n) return FPB(n, m);
  else return FPB(m % n, n);
}

int main() {
  int m, n;
  printf("Masukkan nilai m: ");
  scanf("%d", &m);
  printf("Masukkan nilai n: ");
  scanf("%d", &n);
  printf("FPB dari %d dan %d adalah: %d", m, n, FPB(m, n));
  return 0;
}
