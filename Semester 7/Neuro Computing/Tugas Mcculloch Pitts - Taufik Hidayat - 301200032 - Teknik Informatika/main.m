disp('Nama  : Taufik Hidayat');
disp('NIM   : 301200032');
disp('Prodi : Teknik Informatika');
disp('Tugas : Model Mcculloch-pitts');
fprintf(newline);

input = [0 0; 0 1; 1 0; 1 1];

for i = 1:size(input, 1)
  x1 = input(i, 1);
  x2 = input(i, 2);
  y = mcculloch_pitts_and(x1, x2);
  fprintf('AND(%d, %d) = %d\n', x1, x2, y);
end
fprintf(newline);

for i = 1:size(input, 1)
  x1 = input(i, 1);
  x2 = input(i, 2);
  y = mcculloch_pitts_or(x1, x2);
  fprintf('OR(%d, %d)  = %d\n', x1, x2, y);
end
fprintf(newline);

for i = 1:size(input, 1)
  x1 = input(i, 1);
  x2 = input(i, 2);
  y = mcculloch_pitts_xor(x1, x2);
  fprintf('XOR(%d, %d) = %d\n', x1, x2, y);
end
