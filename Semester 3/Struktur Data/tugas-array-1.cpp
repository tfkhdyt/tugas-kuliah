#include <stdio.h>

int main() {
  int array[15] = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 2048, 4096, 8192, 16384};
  for(int i = 0; i < 15; i++){
    printf("Nilai ke-%d: %d\n",i+1, array[i]);
  }
}