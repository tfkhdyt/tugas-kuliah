#include <iostream>
using namespace std;

int main(){
  int a, b, c;
  a = 9;
  b = 8;

  cout << "Nilai a : " << a << endl;
  cout << "Nilai b : " << b << endl;
  
  c = a > b;
  cout << "Nilai a > b : " << c << endl;
  c = a < b;
  cout << "Nilai a < b : " << c << endl;

  return 0;
}
