#include <iostream>
#include <conio.h>
using namespace std;

main()
{
    int nilai1, nilai2, hasil;
  
    printf("===== Program Kalkulator Sederhana =====\n");
    printf("Masukkan nilai 1 : ");
    cin >> nilai1;
    printf("Masukkan nilai 2 : ");
    cin >> nilai2;
    
    hasil = nilai1 + nilai2;
    printf("\nHasil penjumlahan %i + %i = %i",nilai1, nilai2, hasil);
    hasil = nilai1 - nilai2;
    printf("\nHasil pengurangan %i - %i = %i",nilai1, nilai2, hasil);
    hasil = nilai1 * nilai2;
    printf("\nHasil perkalian   %i * %i = %i",nilai1, nilai2, hasil);
    hasil = nilai1 / nilai2;
    printf("\nHasil pembagian   %i / %i = %i",nilai1, nilai2, hasil);
    hasil = nilai1 % nilai2;
    printf("\nHasil modulus     %i %% %i = %i",nilai1, nilai2, hasil);
 
    getch();
}
