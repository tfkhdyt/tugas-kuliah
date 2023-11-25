masukan = [
    -1 -1 1 -1 -1;
    -1 -1 1 -1 -1;
    1 1 1 1 1;
    -1 -1 1 -1 -1;
    -1 -1 1 -1 -1
];
bias = [1 1 1 1 1];
target = [-1 -1 -1 -1 -1];

perubahanBobot = [];
for i = 1:size(masukan, 1)
  deltaW1 = masukan(i, 1) * bias(i);
  deltaW2 = masukan(i, 2) * bias(i);
  deltaW3 = masukan(i, 3) * bias(i);
  deltaW4 = masukan(i, 4) * bias(i);
  deltaW5 = masukan(i, 5) * bias(i);
  deltaB = target(i);

  perubahanBobot(i, :) = [deltaW1 deltaW2 deltaW3 deltaW4 deltaW5 deltaB];
end

bobotBaru = [];
inisialisasi = [0 0 0 0 0 0];
for i = 1:size(perubahanBobot, 1)
  w1 = perubahanBobot(i, 1) + inisialisasi(1);
  w2 = perubahanBobot(i, 2) + inisialisasi(2);
  w3 = perubahanBobot(i, 3) + inisialisasi(3);
  w4 = perubahanBobot(i, 4) + inisialisasi(4);
  w5 = perubahanBobot(i, 5) + inisialisasi(5);
  b = perubahanBobot(i, 6) + inisialisasi(6);

  inisialisasi = [w1 w2 w3 w4 w5 b];
  bobotBaru(i, :) = inisialisasi;
end

net = [];
for i = 1:size(masukan, 1)
  n = (masukan(i, 1) * bobotBaru(5, 1)) + (masukan(i, 2) * bobotBaru(5, 2)) + (masukan(i, 3) * bobotBaru(5, 3)) + (masukan(i, 4) * bobotBaru(5, 4)) + (masukan(i, 5) * bobotBaru(5, 5)) + bobotBaru(5, 6);

  net(i) = n;
end

for i = 1:5
  fprintf('%d. Masukan:\n', i);
  fprintf('    P1 = %d, ', masukan(i, 1));
  fprintf('P2 = %d, ', masukan(i, 2));
  fprintf('P3 = %d, ', masukan(i, 3));
  fprintf('P4 = %d, ', masukan(i, 4));
  fprintf('P5 = %d, ', masukan(i, 5));
  fprintf('Bias = %d, ', bias(i));
  fprintf('Target = %d\n', target(i));

  fprintf('   Perubahan bobot:\n');
  fprintf('   Δw1 = %d, ', perubahanBobot(i, 1));
  fprintf('Δw2 = %d, ', perubahanBobot(i, 2));
  fprintf('Δw3 = %d, ', perubahanBobot(i, 3));
  fprintf('Δw4 = %d, ', perubahanBobot(i, 4));
  fprintf('Δw5 = %d, ', perubahanBobot(i, 5));
  fprintf('Δb = %d\n', perubahanBobot(i, 6));

  fprintf('   Bobot baru:\n');
  fprintf('   w1 = %d, ', bobotBaru(i, 1));
  fprintf('w2 = %d, ', bobotBaru(i, 2));
  fprintf('w3 = %d, ', bobotBaru(i, 3));
  fprintf('w4 = %d, ', bobotBaru(i, 4));
  fprintf('w5 = %d, ', bobotBaru(i, 5));
  fprintf('b  = %d\n', bobotBaru(i, 6));

  fprintf('   Net = %d\n', net(i));

  if net(i) >= 0
    fn = 1;
  else
    fn = -1;
  end
  fprintf('   f(n) = %d\n', fn);

  if fn == target(i)
    valid = 'Valid';
  else
    valid = 'Tidak Valid';
  end
  fprintf('   Valid? = %s\n\n', valid);
end
