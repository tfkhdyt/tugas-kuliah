#include <iostream>
using namespace std;

int main(){
  string nama = "Taufik Hidayat";
  string jurusan = "Teknik Informatika";
  int array[2][3] = {
    {1, 2, 3},
    {4, 5, 6}
  };
  
  printf("Nama    : %s\n", nama.c_str());
  printf("Jurusan : %s\n\n", jurusan.c_str());
  
  for(int i = 0; i < 2; i++){
    for(int j = 0; j < 3; j++){
      printf("%d ", array[i][j]);
    }
    printf("\n");
  }
  
  return 0;
}
