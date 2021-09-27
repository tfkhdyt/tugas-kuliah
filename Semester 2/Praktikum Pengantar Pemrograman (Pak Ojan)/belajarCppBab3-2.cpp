#include <iostream>
using namespace std;

int main(){
  int a, b, c, d, e;
  a = 9;
  b = 8;

  cout << "Nilai a : " << a << endl;
  cout << "Nilai b : " << b << endl;
  
  c = a > b;
  cout << "Nilai a > b : " << c << endl;
  d = a < b;
  cout << "Nilai a < b : " << d << endl;

  e = c && d;
  cout << "Nilai a > b && a < b : " << e << endl;
  e = c || d;
  cout << "Nilai a > b || a < b : " << e << endl;

  return 0;
}
