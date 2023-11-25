% Inisialisasi bobot, bias, alpha, dan threshold
w = zeros(1, 3);  % Bobot awal
b = 0;           % Bias awal
alpha = 1;       % Alpha (learning rate)
theta = 0.1;     % Threshold

% Data latih (input biner)
X = [1 1 1; 1 1 0; 1 0 1; 0 1 1];
% Label keluaran yang diharapkan (output bipolar)
Y = [1; -1; -1; -1];

% Jumlah iterasi
epochs = 100;

% Training perceptron
for epoch = 1:epochs
    for i = 1:size(X, 1)
        % Hitung output
        output = hardlim(w * X(i, :).' + b - theta);
        
        % Hitung error
        error = Y(i) - output;
        
        % Update bobot dan bias
        w = w + alpha * error * X(i, :);
        b = b + alpha * error;
    end
end

% Uji perceptron dengan data uji
test_data = [1 1 1; 1 1 0; 1 0 1; 0 1 1];
predicted_output = hardlim(test_data * w.' + b - theta);

% Tampilkan hasil
disp('Bobot akhir:');
disp(w);
disp('Bias akhir:');
disp(b);
disp('Hasil prediksi untuk data uji:');
disp(predicted_output);
