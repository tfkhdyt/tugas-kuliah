#include <iostream>
#include <conio.h>
using namespace std;

main(){
	printf("===== Praktikum Pemrograman C++ =====\n\n");
	
	int a, b, c;
	
	printf("        Masukkan nilai A: "); cin >> a;
	printf("        Masukkan nilai B: "); cin >> b;
	
	c = a + b;
	
	printf("\n============== Output ==============\n\n");
	printf("        %d + %d = %d", a, b, c);
	printf("\n\n====================================");
	
	getch();
}
