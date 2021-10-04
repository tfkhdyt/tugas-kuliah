#include <stdio.h>

long fiboHelp(long x, long y, int n) { // menghapus keyword static
  if (n == 0) return x;
  else if (n == 1) return y;
  else return fiboHelp(y, x+y, n-1);
}

long fib4 (int n) { //  keyword public dan static
  return fiboHelp(0, 1, n);
}

int main() {
  int n;
  printf("Masukkan jumlah bilangan: ");
  scanf("%d", &n);
  printf("Fibonacci dari %d adalah: %d", n, fib4(n));
  return 0;
}