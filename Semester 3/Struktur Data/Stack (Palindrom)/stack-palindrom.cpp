// import library yang dibutuhkan
#include <stdlib.h>
#include <stdio.h>
#include <iostream>
#include <malloc.h>
#include <string>
using namespace std;

// deklarasi struct identitas
typedef struct {
  string palindrom;
  string nama;
} identitas;

// deklarasi struct elemen
typedef struct elmt *alamatelmt;
typedef struct elmt {
  identitas elmt;
  alamatelmt next;
} elemen;

// deklarasi struct stack
typedef struct {
  elemen *top;
} stack;

// deklarasi function untuk mencetak data diri
void printName() {
  printf(
    "Nama          : Taufik Hidayat\n"
    "NIM           : 301200032\n"
    "Kelas         : IF Reguler\n"
    "Jenis Program : Stack Palindrom\n"
  );
}

// deklarasi function untuk membuat elemen kosong pada stack
void createEmpty(stack *S) {
  (*S).top = NULL;
}

// deklarasi function untuk mengecek apakah elemen pada stack kosong atau tidak
int isEmpty(stack S) {
  int hasil = 0;
  if (S.top == NULL) {
    hasil = 1;
  }
  return hasil;
}

// deklarasi function untuk menghitung jumlah elemen pada stack
int countElement(stack S) {
  int hasil = 0;
  if (S.top != NULL) {
    elemen *elmt;
    elmt = S.top;
    while (elmt != NULL) {
      hasil = hasil + 1;
      elmt = elmt->next;
    }
  }
  return hasil;
}

// deklarasi function untuk mencari data pada stack
void search(stack S) {
  int menu;
  if (S.top != NULL) {
    printf(" Cari Mahasiswa berdasarkan palindrom\n");
    printf("-----------------------------------\n");
    printf(
      " 1. Palindrom\n"
      " 2. Bukan Palindrom\n"
    );
    printf("-----------------------------------\n");
    printf("Menu : ");
    scanf("%d", &menu);
    
    elemen *elmt = S.top;
    
    int i = 1;
   
    switch (menu) {
      case 1:   
        while (elmt != NULL) {
          if (elmt->elmt.palindrom == "Bukan") {
            elmt = elmt->next;
            continue;
          }
          printf("-----------------------------------\n");
          printf("Mahasiswa Ke - %d\n", i);
          printf("-----------------------------------\n");
          printf("Nama       : %s\n", elmt->elmt.nama.c_str());
          printf("Palindrom? : %s\n", elmt->elmt.palindrom.c_str());
          elmt = elmt->next;
          i = i + 1;
        }
        printf("-----------------------------------\n");
        break;
      case 2:
        while (elmt != NULL) {
          if (elmt->elmt.palindrom == "Iya") {
            elmt = elmt->next;
            continue;
          }
          printf("-----------------------------------\n");
          printf("Mahasiswa Ke - %d\n", i);
          printf("-----------------------------------\n");
          printf("Nama       : %s\n", elmt->elmt.nama.c_str());
          printf("Palindrom? : %s\n", elmt->elmt.palindrom.c_str());
          elmt = elmt->next;
          i = i + 1;
        }
        printf("-----------------------------------\n");
        break;
      default:
        break;
    }
  } else {
    system("clear");
    printName();
    printf("-----------------------------------\n");
    printf(" Stack kosong !\n");
    printf("-----------------------------------\n");
  }
}

string isPalindrome(string S) {
    for (int i = 0; i < S.length() / 2; i++) {
        if (S[i] != S[S.length() - i - 1]) {
            return "Bukan";
        }
    }
    return "Iya";
}

// deklarasi function untuk memasukkan data ke dalam stack
void push(string nama, stack *S) {
  elemen *elmt;
  elmt = (elemen *)malloc(sizeof(elemen));
  elmt->elmt.nama = nama;
  elmt->elmt.palindrom = isPalindrome(nama);
  elmt->next = (*S).top;
  (*S).top = elmt;
}

// deklarasi function untuk menghapus data paling akhir pada stack
void pop(stack *S) {
  if ((*S).top != NULL) {
    elemen *elmt = (*S).top;
    (*S).top = (*S).top->next;
    elmt->next = NULL;
    free(elmt);
  } else {
    system("clear");
    printName();
    printf("-----------------------------------\n");
    printf(" Stack kosong !\n");
    printf("-----------------------------------\n");
  }
}

// deklarasi function untuk mencetak isi stack
void printStack(stack S) {
  if (S.top != NULL) {
    elemen *elmt = S.top;
    printf("-----------------------------------\n");
    printf(" Stack Mahasiswa\n");
    int i = 1;
    while (elmt != NULL) {
      printf("-----------------------------------\n");
      printf("Mahasiswa Ke - %d\n", i);
      printf("-----------------------------------\n");
      printf("Nama       : %s\n", elmt->elmt.nama.c_str());
      printf("Palindrom? : %s\n", elmt->elmt.palindrom.c_str());
      elmt = elmt->next;
      i = i + 1;
    }
    printf("-----------------------------------\n");
  } else {
    system("clear");
    printName();
    printf("-----------------------------------\n");
    printf(" Stack kosong !\n");
    printf("-----------------------------------\n");
  }
}

// deklarasi utama
int main() {
  stack S; // membuat instansiasi dari stack
  createEmpty(&S); // membuat elemen kosong pada stack
  // deklarasi variabel yang dibutuhkan
  string nama;
  int menu;
  // lakukan perulangan dan tampilkan menu
  do {
    system("clear"); // bersihkan layar
    printName();
    printf("-----------------------------------\n");
    printf(" Database Mahasiswa \n");
    printf("-----------------------------------\n");
    printf(" 1. Tambah Mahasiswa\n");
    printf(" 2. Hapus Mahasiswa\n");
    printf(" 3. Cari Mahasiswa\n");
    printf(" 4. Tampilkan Semua\n");
    printf(" 5. Close\n");
    printf("-----------------------------------\n");
    printf("Menu : ");
    scanf("%d", &menu); // ambil input dari user dan simpan pada variabel menu
    switch (menu) { // cek isi variabel ini
      case 1: // jika variabel menu bernilai 1
        system("clear"); // bersihkan layar
        printName();
        printf("-----------------------------------\n");
        printf(" Tambah Mahasiswa\n");
        printf("-----------------------------------\n");
        printf(" Nama          : ");
        // ambil input dari user dan simpan pada variabel nama
        cin >> nama;
        // masukkan data yang telah di-input tadi ke stack
        push(nama, &S);
        printf("-----------------------------------\n\n\n\n");
        system("read"); // kembali ke menu sebelumnya
        break;
      case 2:
        system("clear"); // bersihkan layar
        printName();
        printf("-----------------------------------\n");
        printf("Data Mahasiswa Berhasil Dihapus !\n");
        printf("-----------------------------------\n");
        pop(&S); // menghapus data paling atas pada stack
        system("read"); // kembali ke menu sebelumnya
        break;
      case 3:
        system("clear"); // bersihkan layar
        printName();
        search(S); // mencari data
        system("read"); // kembali ke menu sebelumnya
        break;
      case 4:
        system("clear"); // bersihkan layar
        printName();
        printStack(S); // tampilkan isi stack
        system("read"); // kembali ke menu sebelumnya
        break;
      case 5:
        system("exit"); // keluar dari program
        break;
      default:
        break;
    }
  } while (menu != 5); // ulangi perintah selama isi variabel menu bukan 5
  return 0; // keluar dari program
}