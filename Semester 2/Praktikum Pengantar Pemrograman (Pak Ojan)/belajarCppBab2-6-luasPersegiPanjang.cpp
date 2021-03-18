#include <iostream>
#include <conio.h>
using namespace std;

main()
{
    float panjang, lebar, luas;
  
    printf("== Program Menghitung Luas Persegi Panjang ==\n");
    printf("Masukkan panjang : ");
    cin >> panjang;
    printf("Masukkan lebar   : ");
    cin >> lebar;
    
    luas = panjang * lebar;
    printf("\nLuas persegi panjang adalah = %.2f m²",luas);
    
    getch();
}
