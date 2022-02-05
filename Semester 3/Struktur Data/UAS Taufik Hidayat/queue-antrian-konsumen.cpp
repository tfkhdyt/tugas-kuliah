// import library yang dibutuhkan
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <conio.h>

// deklarasi struct antrian
typedef struct {
  char nama[20];
  int umur;
} antrian;

// deklarasi struct queue
typedef struct {
  int first;
  int last;
  antrian data[10];
} queue;

// deklarasi function untuk membuat queue kosong
void createEmpty (queue *q) {
  (*q).first = -1;
  (*q).last = -1;
}

// deklarasi function untuk memeriksa apakah queue kosong atau tidak
bool isEmpty (queue q) {
  if (q.first == -1)
    return true;
  return false;
}

// deklarasi function untuk memeriksa apakah queue penuh atau tidak
bool isFull (queue q) {
  if (q.last == 9) 
    return true;
  return false;
}

// deklarasi function untuk menambah data ke dalam queue
void add (char nama[], int umur, queue *q) {
  if (isEmpty(*q) == true) {
    (*q).first = 0;
    (*q).last = 0;
    strcpy((*q).data[0].nama, nama);
    (*q).data[0].umur = umur;
  } else {
    if (isFull(*q) == false) {
      if ((*q).first == -1) {
        (*q).last = (*q).last + 1;
        (*q).first = 0;
        strcpy((*q).data[(*q).last].nama, nama);
        (*q).data[(*q).last].umur = umur;
      } else {
        (*q).last = (*q).last + 1;
        strcpy((*q).data[(*q).last].nama, nama);
        (*q).data[(*q).last].umur = umur;
      }
    } else {
      printf("Queue penuh!\n");
    }
  }
}

void cetakGaris () {
  printf(
    "=====================================\n"
  );
}

// deklarasi function untuk menghapus data di dalam queue
void del (queue *q) {
  cetakGaris();
  if ((*q).first != -1) {
    if ((*q).last == 0) {
      (*q).first = -1;
      (*q).last = -1;
    } else {
      /*Menggeser elemen kedepan*/
      for (int i = ((*q).first + 1); i <= (*q).last; i++) {
        strcpy((*q).data[i - 1].nama, (*q).data[i].nama);
        (*q).data[i - 1].umur = (*q).data[i].umur;
      }
      (*q).last = (*q).last - 1;
    }
    printf("Data paling depan pada antrian konsumen\ntelah dihapus!\n");
  } else {
    printf("Antrian kosong!\n");
  }
}

// deklarasi function untuk mencetak isi queue 
void printQueue (queue q) {
  if (q.first != -1) {
    for (int i = q.first; i <= q.last; i++) {
      printf("Nomor antrian\t: %d\n", i + 1);
      printf("Nama\t\t: %s\n", q.data[i].nama);
      printf("Umur\t\t: %d tahun\n", q.data[i].umur);
      if (i < q.last)
        printf("-------------------------------------\n");
      else
        cetakGaris();
    }
  } else {
    printf("Antrian kosong!");
  }
}

void cetakNama () {
  printf(
    "Nama         : Taufik Hidayat\n"
    "NIM          : 301200032\n"
    "Kelas        : IF Reguler\n"
    "Mata Kuliah  : Struktur Data\n"
    "Nama Program : Antrian Konsumen\n"
  );
}

int main () {
  // deklarasi variabel
  int umur, pil;
  char nama[20];
  queue q;
  
  // membuat queue kosong
  createEmpty(&q);

  // membuat label untuk kembali ke menu
  menu:
    // membersihkan layar
    system("clear");
    // cetak nama
    cetakNama();
    // menampilkan menu
    printf("===== PROGRAM ANTRIAN KONSUMEN ======\n");
    printf("[1] Masuk antrian\n");
    printf("[2] Keluar antrian\n");
    printf("[3] Cetak antrian\n");
    printf("[4] Keluar\n");
    cetakGaris();
    printf("Pilihan> ");
    scanf("%d", &pil);
    
    // masuk ke menu sesuai dengan pilihan user
    switch(pil) {
      // masuk antrian
      case 1:
        cetakGaris();
        // memeriksa apakah queue penuh atau tidak
        if (isFull(q) == true) {
          printf("Antrian penuh\n");
        } else {
          printf("Masukkan nama anda> ");
          // mendapatkan input dari user
          scanf("%s", &nama);
          printf("Masukkan umur anda> ");
          // mendapatkan input dari user
          scanf("%d", &umur);
          // tambahkan data ke queue
          add(nama, umur, &q);
        }
        // kembali ke menu sebelumnya
        system("read");
        break;
      // hapus antrian
      case 2:
        // panggil function hapus data queue 1
        del(&q);
           
        // kembali ke menu sebelumnya
        system("read");
        break;
      // cetak antrian
      case 3:
        // membersihkan layar
        system("clear");
        cetakNama();
        printf("======= Data Antrian Konsumen =======\n");
        // panggil function untuk mencetak queue
        printQueue(q);
        
        // kembali ke menu sebelumnya
        system("read");
        break;
      // keluar program
      case 4:
        return 0;
    }
  // kembali ke label menu
  goto menu;
}