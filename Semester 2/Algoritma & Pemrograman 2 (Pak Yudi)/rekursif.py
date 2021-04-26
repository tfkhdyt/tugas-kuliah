def faktorial(x):
    if x == 1:
        return 1
    else:
        return (x * faktorial(x-1))

num = int(input("Masukkan angka : "))
print("Faktorial dari", num, "adalah", faktorial(num))