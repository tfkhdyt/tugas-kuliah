function y = mcculloch_pitts_xor(x1, x2)
  z1 = x1 && ~x2;
  z2 = ~x1 && x2;
  y = z1 || z2;
end
