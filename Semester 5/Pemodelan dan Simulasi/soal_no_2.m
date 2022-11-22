x1 = 123 >= bin2dec('1110111');
x2 = 21 >= hex2dec('21');
x3 = bin2dec('11110001') >= 164;
x4 = bin2dec('1110101') == hex2dec('ac');
x5 = or(x1, x3);
x6 = xor(x2, x4);
x7 = and(x3, x2);
x8 = xor(x5, x6);
xR = and(x8, x7);

fprintf('xR: %d\n', xR);
