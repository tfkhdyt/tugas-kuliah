#include <iostream>
using namespace std;

int main()
{
  printf("============== Quiz 1 ==============\n\n");
  
  int a, b, c, d ,e, f;
  
  printf("    Masukkan angka A = "); cin >> a;
  printf("    Masukkan angka B = "); cin >> b;
  printf("    Masukkan angka C = "); cin >> c;
  printf("    Masukkan angka D = "); cin >> d;
  printf("    Masukkan angka E = "); cin >> e;

  f = a + b * c / d - e;
  
  printf("\n============== Hasil ===============\n\n");
  printf("    %d + %d * %d / %d - %d = %d",a,b,c,d,e,f);
  printf("\n\n== Taufik Hidayat ===== 301200032 ==\n");
  
  return 0;
}