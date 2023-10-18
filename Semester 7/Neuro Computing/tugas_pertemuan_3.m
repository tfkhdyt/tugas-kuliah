clc
clear

matriksA = [
  2 1 -2;
  0 1 1;
  -4 1 4
]
matriksB = [
  3 1;
  -1 2;
  1 0
]
matriksC = [
  4 0 1;
  2 -2 1
]
disp('------------------------------------------------------------------------')

disp('Soal A: 2 A')
jawabanA = 2 * matriksA
disp('------------------------------------------------------------------------')

disp('Soal B: A + B')
disp('Error: A dan B tidak dapat dijumlahkan karena memiliki ordo yang berbeda')
# jawabanB = matriksA + matriksB # error
disp('------------------------------------------------------------------------')

disp('Soal C: A B')
jawabanC = matriksA * matriksB
disp('------------------------------------------------------------------------')

disp('Soal D: B A')
disp('Error: B dan A tidak dapat dikalikan karena jumlah kolom B berbeda dengan jumlah baris A')
# jawabanD = matriksB * matriksA # error
disp('------------------------------------------------------------------------')

disp("Soal E: (C B)'")
jawabanE = (matriksC * matriksB)'
disp('------------------------------------------------------------------------')

disp('Soal F: A I')
jawabanF = matriksA * eye(3)
