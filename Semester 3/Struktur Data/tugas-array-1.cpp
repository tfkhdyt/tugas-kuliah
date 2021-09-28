#include <iostream>
using namespace std;

int main() {
  string nama = "Taufik Hidayat";
  string jurusan = "Teknik Informatika";
  int array[15] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,15};
  
  printf("Nama       : %s\n", nama.c_str());
  printf("Jurusan    : %s\n\n", jurusan.c_str());
  
  for(int i = 0; i < 15; i++){
    printf("Nilai ke %2d: %2d\n",i+1, array[i]);
  }
  
  return 0;
}
