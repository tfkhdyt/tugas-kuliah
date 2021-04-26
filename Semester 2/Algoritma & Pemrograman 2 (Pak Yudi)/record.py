dataDiri = {
  1 : {
    "Nama" : "Taufik Hidayat",
    "NIM" : 301200032,
    "Prodi" : "Teknik Informatika"
  },
  2 : {
    'Nama' : "Teja Kusumah",
    "NIM" : 301200033,
    "Prodi" : "Teknik Informatika"
  }
}

print("Data Diri Mahasiswa")

for i in dataDiri:
  print(i)
  for key, value in dataDiri[i].items():
    print(f"{key} : {value}")
  print()
