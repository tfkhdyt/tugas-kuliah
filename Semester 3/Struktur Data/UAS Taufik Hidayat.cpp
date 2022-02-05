// import library yang dibutuhkan
#include <stdlib.h>
#include <stdio.h>
#include <string>
#include <conio.h>
#include <queue>
#include <iostream>

using namespace std;

void cetakGaris()
{
    printf(
        "=====================================\n");
}

void cetakNama()
{
    printf(
        "Saya berjanji akan menyelesaikan UAS ini sendiri tanpa bantuan dari orang lain\n"
        "                                                                Taufik Hidayat\n");
}

string cetakNamaBarang(int i)
{
    switch (i)
    {
    case 3:
        return "Teks Hitam";
    case 2:
        return "Teks Warna";
    case 1:
        return "Gambar HT/W";
    default:
        return "\t";
    }
}

void cetakAntrian(priority_queue<int> _kom1, priority_queue<int> _kom2, priority_queue<int> _kom3)
{
    priority_queue<int> kom1 = _kom1;
    priority_queue<int> kom2 = _kom2;
    priority_queue<int> kom3 = _kom3;
    printf(
        "\t Antrian yang akan dicetak \n"
        "Komputer 1 \tKomputer 2 \tKomputer 3 \n");
    int i = 0;
    string x[10];
    while (!kom1.empty())
    {
        x[i] = cetakNamaBarang(kom1.top());
        kom1.pop();
        i++;
    }
    i = 0;
    string y[10];
    while (!kom2.empty())
    {
        y[i] = cetakNamaBarang(kom2.top());
        kom2.pop();
        i++;
    }
    i = 0;
    string z[10];
    while (!kom3.empty())
    {
        z[i] = cetakNamaBarang(kom3.top());
        kom3.pop();
        i++;
    }
    i = 0;
    while (i < 3)
    {
        cout << x[i] << "\t" << y[i] << "\t" << z[i] << endl;
        i++;
    }
}

void hapusAntrian(priority_queue<int> kom1, priority_queue<int> kom2, priority_queue<int> kom3)
{
  kom1.pop();
  kom2.pop();
  kom3.pop();
}

int main()
{
    // deklarasi variabel
    int umur, pil;
    char nama[20];
    priority_queue<int> kom1, kom2, kom3;
    kom1.push(3);
    kom1.push(1);
    kom1.push(0);
    kom2.push(3);
    kom2.push(2);
    kom2.push(1);
    kom3.push(1);

menu:
    // membersihkan layar
    system("clear");
    // cetak nama
    cetakNama();
    // cetak antrian
    cetakAntrian(kom1, kom2, kom3);
    // menampilkan menu
    printf("\nMenu : \n");
    printf("1. Tambah Antrian\n");
    printf("2. Cetak\n");
    printf("7. Exit\n");
    printf("Pilihan : ");
    scanf("%d", &pil);

    // masuk ke menu sesuai dengan pilihan user
    switch (pil)
    {
    // masuk antrian
    case 1:
        int pilKom, input;
        // membersihkan layar
        system("clear");
        // cetak nama
        cetakNama();
        cetakAntrian(kom1, kom2, kom3);
        printf(
            "\nTambah Antrian pada : \n"
            "1. Komputer 1 \n"
            "2. Komputer 2 \n"
            "3. Komputer 3 \n"
            "Pilihan : ");
        scanf("%d", &pilKom);
        switch (pilKom)
        {
        case 1:
            system("clear");
            cetakNama();
            cetakAntrian(kom1, kom2, kom3);
            printf("\nTambah antrian pada komputer %d berupa : \n", pilKom);
            printf(
                "1. Teks Hitam\n"
                "2. Teks Warna\n"
                "3. Gambar HT/W\n"
                "Pilihan : ");
            scanf("%d", &input);
            switch (input)
            {
            case 1:
                kom1.push(3);
                break;
            case 2:
                kom1.push(2);
                break;
            case 3:
                kom1.push(1);
                break;
            }
            break;
        case 2:
            // int input;
            system("clear");
            cetakNama();
            cetakAntrian(kom1, kom2, kom3);
            printf("\nTambah antrian pada komputer %d berupa : \n", pilKom);
            printf(
                "1. Teks Hitam\n"
                "2. Teks Warna\n"
                "3. Gambar HT/W\n"
                "Pilihan : ");
            scanf("%d", &input);
            switch (input)
            {
            case 1:
                kom2.push(3);
                break;
            case 2:
                kom2.push(2);
                break;
            case 3:
                kom2.push(1);
                break;
            }
            break;
        case 3:
            // int input;
            system("clear");
            cetakNama();
            cetakAntrian(kom1, kom2, kom3);
            printf("\nTambah antrian pada komputer %d berupa : \n", pilKom);
            printf(
                "1. Teks Hitam\n"
                "2. Teks Warna\n"
                "3. Gambar HT/W\n"
                "Pilihan : ");
            scanf("%d", &input);
            switch (input)
            {
            case 1:
                kom3.push(3);
                break;
            case 2:
                kom3.push(2);
                break;
            case 3:
                kom3.push(1);
                break;
            }
            break;
        }
        system("read");
        break;
    // cetak antrian
    case 2:
        // printf("Berhasil dicetak");
        hapusAntrian(kom1, kom2, kom3);
        system("read");
        goto menu;
        break;
    // keluar program
    case 7:
        return 0;
    }
    // kembali ke label menu
    goto menu;
}