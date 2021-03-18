#include <iostream>
#include <conio.h>
using namespace std;

main()
{
    float alas, tinggi, luas;
  
    printf("== Program Menghitung Luas Segitiga ==\n");
    printf("Masukkan alas   : ");
    cin >> alas;
    printf("Masukkan tinggi : ");
    cin >> tinggi;
    
    luas = alas * tinggi / 2;
    printf("\nLuas segitiga adalah = %.2f m²",luas);
    
    getch();
}
