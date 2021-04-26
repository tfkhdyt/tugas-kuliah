def luasSegitiga(alas, tinggi):
  return alas * tinggi / 2

alas = int(input("Masukkan alas segitiga   : "))
tinggi = int(input("Masukkan tinggi segitiga : "))

print(f"Luas segitiganya adalah {luasSegitiga(alas,tinggi)} cm²")