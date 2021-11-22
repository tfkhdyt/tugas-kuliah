// import library
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// inisialisasi data matkul
typedef struct {
  char kode_matkul[5];
  char nama_matkul[30];
  int sks;
} dataMatkul;

// inisialisasi elemen
typedef struct {
  dataMatkul elmt;
  int next;
} elemen;

// inisialisasi list
typedef struct {
  int first;
  elemen data[20];
} list;


// function untuk membuat list
void create_list(list *L) {
  int i;
  (*L).first = -1;
  for (i = 0; i <= 20; i++) {
    (*L).data[i].next = -2;
  }
}

// function untuk menghitung jumlah elemen dari list
int count_elemen(list L) {
  int hasil = 0;
  if (L.first != -1) {
    int elmt;
    elmt = L.first;
    while (elmt != -1) {
      hasil = hasil + 1;
      elmt = L.data[elmt].next;
    }
  }
  return hasil;
}

int empty_elemen(list L) {
  int hasil = -1;
  if (count_elemen(L) < 20) {
    int ketemu = 0;
    int i = 0;
    while ((ketemu == 0) && (i <= 20)) {
      if (L.data[i].next == -2) {
        hasil = i;
        ketemu = 1;
      } else {
        i++;
      }
    }
  }
  return hasil;
}

// function untuk menambah data di awal list
void add_first(list *L, char kode_matkul[], char nama_matkul[], int sks) {
  if (count_elemen(*L) < 20) {
    int index = empty_elemen(*L);
    strcpy((*L).data[index].elmt.kode_matkul, kode_matkul);
    strcpy((*L).data[index].elmt.nama_matkul, nama_matkul);
    (*L).data[index].elmt.sks = sks;
    if ((*L).first == -1) {
      //list kosong
      (*L).data[index].next = -1;
    } else {
      (*L).data[index].next = (*L).first;
      (*L).data[(*L).first].next;
    }
    (*L).first = index;
  } else {
    //array penuh
    printf("Sudah tidak dapat ditambah lagi\n");
  }
}

// function untuk menambah data di tengah list
void add_after(list *L, int prec, char kode_matkul[], char nama_matkul[], int sks) {
  if (count_elemen(*L) < 20) {
    int index = empty_elemen(*L);
    strcpy((*L).data[index].elmt.kode_matkul, kode_matkul);
    strcpy((*L).data[index].elmt.nama_matkul, nama_matkul);
    (*L).data[index].elmt.sks = sks;
    if (prec < count_elemen(*L)) {
      int jumlah = 0;
      int sebelum = (*L).first;
      while (jumlah < (prec - 1)) {
        jumlah++;
        sebelum = (*L).data[sebelum].next;
      }
      (*L).data[index].next = (*L).data[sebelum].next;
      (*L).data[sebelum].next = index;
    } else {
      int last = (*L).first;
      while ((*L).data[last].next != -1) {
        last = (*L).data[last].next;
      }
      (*L).data[last].next = index;
      (*L).data[index].next = -1;
    }
  } else {
    printf("Data penuh tidak dapat ditambah");
  }
}

// function untuk menambah data di akhir list
void add_last(list *L, char kode_matkul[], char nama_matkul[], int sks) {
  int last;
  if ((*L).first == -1) {
    int index = 0;
    strcpy((*L).data[index].elmt.kode_matkul, kode_matkul);
    strcpy((*L).data[index].elmt.nama_matkul, nama_matkul);
    (*L).data[index].elmt.sks = sks;
    (*L).data[index].next = -1;
    (*L).first = index;
  } else {
    if (count_elemen(*L) < 20) {
      int index = empty_elemen(*L);
      strcpy((*L).data[index].elmt.kode_matkul, kode_matkul);
      strcpy((*L).data[index].elmt.nama_matkul, nama_matkul);
      (*L).data[index].elmt.sks = sks;
      (*L).data[index].next = -1;
      last = (*L).first;
      while ((*L).data[last].next != -1) {
        last = (*L).data[last].next;
      }
      (*L).data[last].next = index;
    } else {
      printf("Data penuh, tidak dapat ditambahkan");
    }
  }
}

// function untuk menghapus data di awal list
void delete_first(list *L) {
  if ((*L).first != -1) {
    int elmt = (*L).first;
    (*L).first = (*L).data[(*L).first].next;
    (*L).data[elmt].next = -2; //mengosongkan
  } else {
    printf("List kosong");
  }
}

// function untuk menghapus data di tengah list
void delete_after(list *L, int prec) {
  int temp;
  if (prec < count_elemen(*L)) {
    int count = 1;
    int sebelum = (*L).first;
    while (count < prec) {
      count++;
      sebelum = (*L).data[sebelum].next;
    }
    temp = (*L).data[sebelum].next;
    (*L).data[sebelum].next = (*L).data[temp].next;
    temp = -2;
  } else {
    int last = (*L).first;
    int beforeLast;
    while ((*L).data[last].next != -1) {
      beforeLast = last;
      last = (*L).data[last].next;
    }
    (*L).data[beforeLast].next = -1;
    (*L).data[last].next = -2;
  }
}

// function untuk menghapus data di akhir list
void delete_last(list *L) {
  if ((*L).first != -1) {
    if (count_elemen(*L) == 1) {
      delete_first(L);
    } else {
      int last = (*L).first;
      int beforeLast;
      while ((*L).data[last].next != -1) {
        beforeLast = last;
        last = (*L).data[last].next;
      }
      (*L).data[beforeLast].next = -1;
      (*L).data[last].next = -2;
    }
  } else {
    printf("Data kosong\n");
  }
}

// function untuk mencetak semua elemen pada list
void printElemen(list L) {
  if (L.first != -1) {
    int elmt = L.first;
    int i = 1;
    while (elmt != -1) {
      printf("Data ke : %d\n", i);
      printf("Kode mata Kuliah : %s\n", L.data[elmt].elmt.kode_matkul);
      printf("Nama mata Kuliah : %s\n", L.data[elmt].elmt.nama_matkul);
      printf("SKS : %d\n", L.data[elmt].elmt.sks);
      printf("\n=============================================\n");
      elmt = L.data[elmt].next;
      i = i + 1;
    }
  } else {
    printf("Data kosong\n");
  }
}

// function utama
int main() {
  // inisialisasi variabel
  int pilihan, tambah, hapus, sisipan, _delete, sks;
  char kode_matkul[10], nama_matkul[50];
  list L;
  // jalankan function create_list untuk membuat list baru
  create_list(&L);
  // lalukan perulangan do while
  do {
    // cetak menu
    printf("\n====================MENU MATA KULIAH=====================\n");
    printf("[1] Input data\n");
    printf("[2] Hapus Data\n");
    printf("[3] Lihat Data\n");
    printf("[4] Exit\n");
    printf("\n");
    printf("Masukkan pilihan anda : ");
    // input pilihan
    scanf("%d", &pilihan);
    // masuk ke menu sesuai pilihan
    switch (pilihan) {
      // menu 1: input data
      case 1:
      {
        system("clear");
        do {
          // cetak menu
           printf("\n====================MENU MATA KULIAH=====================\n");
          printf("Pilihan Input : \n");
          printf("[1] Input di awal\n");
          printf("[2] Input di tengah\n");
          printf("[3] Input di akhir\n");
          printf("[4] Exit\n");
          printf("\n");
          printf("Masukkan pilihan anda : ");
          // input pilihan
          scanf("%d", &tambah);
          switch (tambah) {
            // input data matkul
            case 1:
            {
              system("clear");
              printf("Masukkan data terlebih dahulu!!\n");
              printf("\n");
              printf("Kode mata kuliah : ");
              fflush(stdin);
              gets(kode_matkul);
              printf("Nama mata Kuliah : ");
              fflush(stdin);
              gets(nama_matkul);
              printf("SKS : ");
              scanf("%d", &sks);
              add_first(&L, kode_matkul, nama_matkul, sks);
              printf("Data berhasil diisi!!\n");
              system("read");
              system("clear");
            }
            break;
            case 2:
            {
              system("clear");
              printf("Masukkan pilihan sisipan : ");
              scanf("%d", &sisipan);
              printf("\n");
              printf("Masukkan data terlebih dahulu!!\n");
              printf("Kode mata kuliah : ");
              fflush(stdin);
              gets(kode_matkul);
              printf("Nama mata Kuliah : ");
              fflush(stdin);
              gets(nama_matkul);
              printf("SKS : ");
              scanf("%d", &sks);
              add_after(&L, sisipan, kode_matkul, nama_matkul, sks);
              printf("Data berhasil diisi!!\n");
              system("read");
              system("clear");
            }
            break;
            case 3:
            {
              system("clear");
              printf("Masukkan data terlebih dahulu!!\n");
              printf("Kode mata kuliah : ");
              fflush(stdin);
              gets(kode_matkul);
              printf("Nama mata Kuliah : ");
              fflush(stdin);
              gets(nama_matkul);
              printf("SKS : ");
              scanf("%d", &sks);
              add_last(&L, kode_matkul, nama_matkul,
                sks);
              printf("Data berhasil diisi!!\n");
              system("read");
              system("clear");
            }
            break;
          }
          system("clear");
        } while (tambah != 4);
      }
      break;
      // menu 2: hapus data
      case 2:
      {
        system("clear");
        do {
          // cetak menu
          printf("\n====================MENU MATA KULIAH=====================\n");
          printf("\n");
          printf("Pilihan Hapus : \n");
          printf("[1] Hapus di awal\n");
          printf("[2] Hapus di tengah\n");
          printf("[3] Hapus di akhir\n");
          printf("[4]Exit\n");
          printf("\n");
          printf("Masukkan pilihan anda : ");
          // input pilihan
          scanf("%d", &hapus);
          // pilih elemen yang akan dihapus
          switch (hapus) {
            case 1:
            {
              system("clear");
              printf("Hapus data di awal\n");
              delete_first(&L);
              printf("Berhasil dihapus\n");
              system("read");
              system("clear");
            }
            break;
            case 2:
            {
              system("clear");
              printf("Hapus data tengah\n");
              printf("masukkan elemen ke berapa : \n");
              scanf("%d", &_delete);
              delete_after(&L, _delete);
              printf("Berhasil \n");
              system("read");
            }
            break;
            case 3:
            {
              system("clear");
              delete_last(&L);
              printf("Data berhhasil dihapus\n");
              system("read");
              system("clear");
            }
            break;
          }
          system("clear");
        } while (hapus != 4);
      }
      break;
      // menu 3: tampil data
      case 3:
      {
        system("clear");
        printf("\n=====================MATA KULIAH===================\n");
        printf("\n---DATA MATA KULIAH---\n");
        // menampilkan isi list dengan menjalankan function printElemen
        printElemen(L);
        system("read");
        system("clear");
      }
      break;
    }
    system("clear");
  // ulangi perulangan jika pilihan tidak sama dengan 4
  } while (pilihan != 4);
  return 0;
}