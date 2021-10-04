#include <stdio.h>

int fibo_r (int n) {
  if(n == 1) return 1;
  else if(n == 2) return 1;
  else return fibo_r(n - 1) + fibo_r(n - 2);
}

int main() {
  int n;
  printf("Masukkan jumlah bilangan: ");
  scanf("%d", &n);
  printf("Fibonacci dari %d adalah: %d", n, fibo_r(n));
  return 0;
}
