#include <iostream>
#include <bits/stdc++.h> 
using namespace std;

void proses(int harga, int jumlah, float diskon){
  cout << "==========================================" << endl;
  int total = harga * jumlah;
  cout << "Harga Total   : Rp" << total << endl;
  float hargaDiskon = total * diskon;
  cout << "Diskon        : Rp" << hargaDiskon << endl;
  cout << "==========================================" << endl;
  int subTotal = total - hargaDiskon;
  cout << "Sub Total     : Rp" << subTotal << endl;
  int ppn = subTotal * 0.1;
  cout << "PPN 10%       : Rp" << ppn << endl;
  cout << "==========================================" << endl;
  int grandTotal = subTotal + ppn;
  cout << "Grand Total   : Rp" << grandTotal << endl;
  cout << "Bayar         : Rp";
  int bayar;
  cin >> bayar;
  int kembalian = bayar - grandTotal;
  cout << "Kembalian     : Rp" << kembalian << endl;
  cout << "==========================================" << endl;
  cout << "    Terima Kasih Atas Kunjungan Anda 😉" << endl;
}

int main(){
  // record data barang
  struct dataBarang{
    string kode;
    string nama;
    int harga;
    float diskon;
  }tepung, margarin, gula, minyak;
  
  tepung.kode = "D012";
  tepung.nama = "Tepung Terigu 1kg";
  tepung.harga = 12000;
  tepung.diskon = 0.05;
  
  margarin.kode = "D013";
  margarin.nama = "Margarin 1kg";
  margarin.harga = 5600;
  margarin.diskon = 0;
  
  gula.kode = "D014";
  gula.nama = "Gula 1kg";
  gula.harga = 9600;
  gula.diskon = 0.07;
  
  minyak.kode = "D015";
  minyak.nama = "Minyak Sayur 1kg";
  minyak.harga = 6500;
  minyak.diskon = 0.0025;
  
  // program utama
  string kode;
  int jumlah;
  cout << "                 Swalayan" << endl;
  cout << "==========================================" << endl;
  cout << "Kode Barang   : "; cin >> kode;
  transform(kode.begin(), kode.end(), kode.begin(), ::toupper); 
        
  if(kode == "D012"){
    cout << "Nama Barang   : " << tepung.nama << endl;
    cout << "Harga Barang  : " << tepung.harga << endl;
    cout << "Jumlah Beli   : "; cin >> jumlah;
    proses(tepung.harga, jumlah, tepung.diskon);
  }else if(kode == "D013"){
    cout << "Nama Barang   : " << margarin.nama << endl;
    cout << "Harga Barang  : " << margarin.harga << endl;
    cout << "Jumlah Beli   : "; cin >> jumlah;
    proses(margarin.harga, jumlah, tepung.diskon);
  }else if(kode == "D014"){
    cout << "Nama Barang   : " << gula.nama << endl;
    cout << "Harga Barang  : " << gula.harga << endl;
    cout << "Jumlah Beli   : "; cin >> jumlah;
    proses(gula.harga, jumlah, tepung.diskon);
  }else if(kode == "D015"){
    cout << "Nama Barang   : " << minyak.nama << endl;
    cout << "Harga Barang  : " << minyak.harga << endl;
    cout << "Jumlah Beli   : "; cin >> jumlah;
    proses(minyak.harga, jumlah, tepung.diskon);
  }else{
    cout << "Kode Barang tidak valid!";
    return 0;
  }
  
  return 0;
}