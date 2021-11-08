#include <iostream>
using namespace std;

void cetakGaris() {
  printf("==================================\n");
}

void cetakNama() {
  printf(
    "Nama          : Taufik Hidayat\n"
    "NIM           : 301200032\n"
    "Kelas         : IF Pagi\n"
    "Judul Program : Record\n"
  );
  cetakGaris();
}

int main() {
  struct dataMahasiswa {
    string nama;
    char golDar[1];
    int jumlahSaudara;
  };
  
  cetakNama();
  
  dataMahasiswa mahasiswa1;
  printf("Masukkan nama           : ");
  cin >> mahasiswa1.nama;
  printf("Masukkan golongan darah : ");
  cin >> mahasiswa1.golDar;
  printf("Masukkan jumlah saudara : ");
  cin >> mahasiswa1.jumlahSaudara;
  
  cetakGaris();
  cout << "Nama           : " << mahasiswa1.nama;
  cout << "\nGolongan darah : " << mahasiswa1.golDar;
  cout << "\nJumlah Saudara : " << mahasiswa1.jumlahSaudara;
  return 0;
}