#include <stdio.h>

int fibonacci(int n) {
  int f1 = 1, f2 = 1, fibo;
  if(n == 1 || n == 2) 
    fibo = 1; 
  else {
    for(int i = 3; i <= n; i++) { // ubah nilai variabel i menjadi 3
      fibo = f1 + f2;
      f1 = f2;
      f2 = fibo;
    }
  }
  return fibo;
}

int main(){
  int n;
  printf("Masukkan jumlah bilangan: ");
  scanf("%d", &n);
  printf("Fibonacci dari %d adalah: %d", n, fibonacci(n));
  return 0;
}
