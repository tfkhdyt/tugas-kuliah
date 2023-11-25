% Definisikan pola huruf dalam bentuk matriks biner
pola1 = [
    -1 -1  1  1 -1 -1 -1;
    -1 -1 -1  1 -1 -1 -1;
    -1 -1 -1  1 -1 -1 -1;
    -1 -1  1 -1  1 -1 -1;
    -1 -1  1 -1  1 -1 -1;
    -1  1  1  1  1  1 -1;
    -1  1 -1 -1 -1  1 -1;
    -1  1 -1 -1 -1  1 -1;
     1  1  1 -1  1  1  1;
];
pola2 = [
     1  1  1  1  1  1 -1;
    -1  1 -1 -1 -1 -1  1;
    -1  1 -1 -1 -1 -1  1;
    -1  1 -1 -1 -1 -1  1;
    -1  1  1  1  1  1 -1;
    -1  1 -1 -1 -1 -1  1;
    -1  1 -1 -1 -1 -1  1;
    -1  1 -1 -1 -1 -1  1;
     1  1  1  1  1  1 -1;
];
pola3 = [
    -1 -1  1  1  1  1  1;
    -1  1 -1 -1 -1 -1  1;
     1 -1 -1 -1 -1 -1 -1;
     1 -1 -1 -1 -1 -1 -1;
     1 -1 -1 -1 -1 -1 -1;
     1 -1 -1 -1 -1 -1 -1;
     1 -1 -1 -1 -1 -1 -1;
    -1  1 -1 -1 -1 -1  1;
    -1 -1  1  1  1  1 -1;
];
pola4 = [
    -1 -1 -1  1 -1 -1 -1;
    -1 -1 -1  1 -1 -1 -1;
    -1 -1 -1  1 -1 -1 -1;
    -1 -1  1 -1  1 -1 -1;
    -1 -1  1 -1  1 -1 -1;
    -1  1 -1 -1 -1  1 -1;
    -1  1  1  1  1  1 -1;
    -1  1 -1 -1 -1  1 -1;
    -1  1 -1 -1 -1  1 -1;
];
pola5 = [
     1  1  1  1  1  1 -1;
     1 -1 -1 -1 -1 -1  1;
     1 -1 -1 -1 -1 -1  1;
     1 -1 -1 -1 -1 -1  1;
     1  1  1  1  1  1 -1;
     1 -1 -1 -1 -1 -1  1;
     1 -1 -1 -1 -1 -1  1;
     1 -1 -1 -1 -1 -1  1;
     1  1  1  1  1  1 -1;
];

% Menyusun data pola huruf menjadi matriks data latih
data_latih = [pola1; pola2; pola3; pola4; pola5];
label_latih = [1; 1; 1; 1; -1]; % Label untuk setiap pola

% Inisialisasi bobot dan bias
bobot = zeros(size(data_latih, 2), 1);
bias = 0;

alpha = 1; % Learning rate
threshold = 0.1; % Threshold

% Fungsi aktivasi (binary threshold)
activation = @(x) (x >= threshold) * 1 + (x < threshold) * -1;

epochs = 10;

% Training Perceptron
for epoch = 1:epochs
    for i = 1:size(data_latih, 1)
        prediction = activation(dot(bobot, data_latih(i, :)') + bias);
        bobot = bobot + alpha * (label_latih(i) - prediction) * data_latih(i, :)';
        bias = bias + alpha * (label_latih(i) - prediction);
    end
    
    disp(['Epoch ', num2str(epoch), ': Bobot = ', mat2str(bobot'), ', Bias = ', num2str(bias)]);
end

% Hasil prediksi
disp('Hasil prediksi:');
% ... (Pola uji dan prediksi di sini)
