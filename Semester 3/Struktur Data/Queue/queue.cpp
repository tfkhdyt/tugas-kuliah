// import library yang dibutuhkan
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <conio.h>

// deklarasi struct karcis
typedef struct {
  char nama[20];
} karcis;

// deklarasi struct queue
typedef struct {
  int first;
  int last;
  karcis data[5];
} queue;

// deklarasi function untuk membuat queue kosong
void createEmpty (queue *q1, queue *q2) {
  (*q1).first = -1;
  (*q1).last = -1;
  (*q2).first = -1;
  (*q2).last = -1;
}

// deklarasi function untuk memeriksa apakah queue kosong atau tidak
int isEmpty (queue q1, queue q2) {
  int hasil = 0;
  if(q1.first == -1 && q2.first == -1) {
    hasil = 1;
  }
  return hasil;
}

// deklarasi function untuk memeriksa apakah queue penuh atau tidak
int isFull (queue q1, queue q2) {
  int hasil = 0;
  if (q1.last == 4 && q2.last == 4) 
    hasil = 1;
  return hasil;
}

// deklarasi function untuk menambah data ke dalam queue
void add (char nama[], queue *q1, queue *q2) {
  if (isEmpty(*q1, *q2) == 1) {
    (*q1).first = 0;
    (*q1).last = 0;
    strcpy((*q1).data[0].nama, nama);
  } else {
    if (isFull(*q1, *q2) != 1) {
      if (((*q1).last) > ((*q2).last) && ((*q2).first) == -1) {
        (*q2).first = 0;
        (*q2).last = (*q2).last+1;
        strcpy((*q2).data[(*q2).last].nama, nama);
      } else if (((*q1).last) > ((*q2).last)) {
        (*q2).last = (*q2).last+1;
        strcpy((*q2).data[(*q2).last].nama, nama);
      } else if ((*q1).first == -1) {
        (*q1).last = (*q1).last+1;
        (*q1).first = 0;
        strcpy((*q1).data[(*q1).last].nama, nama);
      } else {
        (*q1).last = (*q1).last+1;
        strcpy((*q1).data[(*q1).last].nama, nama);
      }
    } else {
      printf("Queue Penuh\n");
    }
  }
}

// deklarasi function untuk menghapus data di dalam queue 1
void del1 (queue *q1) {
  if ((*q1).first != -1) {

    if ((*q1).last == 0) {
      (*q1).first = -1;
      (*q1).last = -1;
    } else {
      /*Menggeser elemen kedepan*/
      for (int i = ((*q1).first+1); i <= (*q1).last; i++) {
        strcpy((*q1).data[i-1].nama, (*q1).data[i].nama);
      }
      (*q1).last = (*q1).last-1;
    }
    printf("Data Paling Depan Pada Antrian 1 Telah Dihapus\n");
  } else {
    printf("Antrian 1 Kosong~\n");
  }
}

// deklarasi function untuk menghapus data di dalam queue 2
void del2 (queue *q2) {
  if ((*q2).first != -1) {
    if ((*q2).last == 0) {
      (*q2).first = -1;
      (*q2).last = -1;
    } else {
      /*Menggeser elemen kedepan*/
      for (int i = ((*q2).first+1); i <= (*q2).last; i++) {
        strcpy((*q2).data[i-1].nama, (*q2).data[i].nama);
      }
      (*q2).last = (*q2).last-1;
    }
    printf("Data Paling Depan Pada Antrian 2 Telah Dihapus\n");
  } else {
    printf("Antrian 2 Kosong~\n");
  }
}

// deklarasi function untuk mencetak isi queue 1
void printqueue1(queue q1) {
  if (q1.first != -1) {
    for (int i = q1.first; i <= q1.last; i++) {
      printf("no index\t: %d\n", i);
      printf("nama\t\t: %s\n\n", q1.data[i].nama);
    }
  } else {
    printf("Antrian 1 Kosong!");
  }
}

// deklarasi function untuk mencetak isi queue 2
void printqueue2(queue q2) {
  if (q2.first != -1) {
    for (int i = q2.first; i <= q2.last; i++) {
      printf("no index\t: %d\n", i);
      printf("nama\t\t: %s\n\n", q2.data[i].nama);
    }
  } else {
    printf("Antrian 2 Kosong!\n");
  }
}

int main() {
  // deklarasi variabel
  int teller, pil;
  char nama[20];
  queue q1, q2;
  
  // membuat queue kosong
  createEmpty(&q1, &q2);

  // membuat label untuk kembali ke menu
  menu:
    // membersihkan layar
    system("clear");
    // menampilkan menu
    printf("=====Menu======\n");
    printf("1. tambah antrian\n");
    printf("2. hapus antrian\n");
    printf("3. cetak antrian\n");
    printf("4. keluar\n");
    printf("\npilihan: ");
    scanf("%d", &pil);
    
    // masuk ke menu sesuai dengan pilihan user
    switch(pil) {
      // tambah antrian
      case 1:
        // memeriksa apakah queue penuh atau tidak
        if (isFull(q1, q2) == 1) {
          printf("\nAntrian penuh\n\n");
        } else {
          printf("Masukkan nama anda: ");
          // mendapatkan input dari user
          scanf("%s", &nama);
          // tambahkan data ke queue 1 dan 2
          add(nama, &q1, &q2);
        }
        // kembali ke menu sebelumnya
        system("read");
        break;
      // hapus antrian
      case 2:
        // membersihkan layar
        system("clear");
        int x;
        printf("-----Hapus Antrian-----\n");
        printf("[1] Hapus Antrian 1\n");
        printf("[2] Hapus Antrian 2\n");
        printf("Pilihan Kamu : ");
        // pilih menu
        scanf("%d", &x);
    
        switch(x) {
          // panggil function hapus data queue 1
          case 1: 
            del1(&q1);
            break;
          // panggil function hapus data queue 2
          case 2: 
            del2(&q2);
            break;
          // error handling
          default: 
            printf("Menu hanya ada dari 1-2 saja!\n");
            break;
        }
        // kembali ke menu sebelumnya
        system("read");
        break;
      // cetak antrian
      case 3:
        // membersihkan layar
        system("clear");
        printf("------- Data Antrian ------\n\n");
        printf("ANTRIAN 1\n");
        printf("---------------------------\n\n");
        // panggil function untuk mencetak queue 1
        printqueue1(q1);
        printf("\n---------------------------\n\n");
        printf("ANTRIAN 2\n");
        printf("---------------------------\n\n");
        // panggil function untuk mencetak queue 1
        printqueue2(q2);
        printf("\n---------------------------\n\n");
        // kembali ke menu sebelumnya
        system("read");
        break;
      // keluar program
      case 4:
        system("read");
        return 0;
    }
  // kembali ke label menu
  goto menu;
}