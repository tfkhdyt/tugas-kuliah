% Inisialisasi bobot, bias, a, dan threshold
w = zeros(1, 2);  % Bobot awal
b = 0;           % Bias awal
a = 1;           % a (learning rate)
threshold = 0;   % Threshold

% Data latih (input bipolar)
X = [-1 -1; -1 1; 1 -1; 1 1];
% Label keluaran yang diharapkan (output bipolar) untuk fungsi AND
Y = [-1; -1; -1; 1];

% Jumlah iterasi
epochs = 100;

% Training perceptron
for epoch = 1:epochs
    for i = 1:size(X, 1)
        % Hitung output
        output = hardlim(w * X(i, :).' + b);

        % Hitung error
        error = Y(i) - output;

        % Update bobot dan bias
        w = w + a * error * X(i, :);
        b = b + a * error;
    end
end

% Uji perceptron dengan data uji
test_data = [-1 -1; -1 1; 1 -1; 1 1];
predicted_output = hardlim(test_data * w.' + b);

% Tampilkan hasil
disp('Bobot akhir:');
disp(w);
disp('Bias akhir:');
disp(b);
disp('Hasil prediksi untuk data uji:');
disp(predicted_output);
