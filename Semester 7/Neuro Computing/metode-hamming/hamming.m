% Vektor contoh
e1 = [1, -1, -1, -1];
e2 = [-1, -1, -1, 1];

% Vektor input
input_vectors = [
    1, 1, -1, -1;
    1, -1, -1, -1;
    -1, -1, -1, 1;
    -1, -1, 1, 1
];

% Menggunakan model Hamming untuk menentukan vektor contoh yang paling mirip
for i = 1:size(input_vectors, 1)
    % Menghitung jarak Hamming antara vektor contoh dan vektor input
    distance_e1 = sum(e1 ~= input_vectors(i, :));
    distance_e2 = sum(e2 ~= input_vectors(i, :));

    % Menentukan vektor contoh yang paling mirip
    if distance_e1 < distance_e2
        fprintf('Vektor input %d paling mirip dengan e(1)\n', i);
    else
        fprintf('Vektor input %d paling mirip dengan e(2)\n', i);
    end
end
