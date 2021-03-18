#include <iostream>
#include <conio.h>
using namespace std;

main()
{
    float jarak, waktu, kecepatan;
  
    printf("===== Program Menghitung Kecepatan Rata-rata=====\n");
    printf("Masukkan jarak tempuh (km)  : ");
    cin >> jarak;
    printf("Masukkan waktu tempuh (jam) : ");
    cin >> waktu;
    
    kecepatan = jarak / waktu;
    printf("\nKecepatan rata-rata = %.2f km/jam", kecepatan);
    
    getch();
}