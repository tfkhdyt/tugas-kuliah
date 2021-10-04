#include <stdio.h>

int fibo2 (int n) {
  if (n <= 1) return n;
  n--; // kurangi nilai n dengan 1
  int result[10];
  result[0] = 1;
  result[1] = 1;
  for (int ii = 2; ii <= n; ii++) {
    result[ii] = result[ii - 2] + result[ii - 1];
  }
  return result[n];
}

int main() {
  int n;
  printf("Masukkan jumlah bilangan: ");
  scanf("%d", &n);
  printf("Fibonacci dari %d adalah: %d", n, fibo2(n));
  return 0;
}
