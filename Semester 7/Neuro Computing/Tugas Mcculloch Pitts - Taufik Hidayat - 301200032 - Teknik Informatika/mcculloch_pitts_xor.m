function y = mcculloch_pitts_xor(x1, x2)
  w1 = [2, -1];
  w2 = [-1, 2];

  net1 = sum([x1 x2] .* w1);
  net2 = sum([x1 x2] .* w2);

  threshold = 2;
  if net1 >= threshold
    z1 = 1;
  else
    z1 = 0;
  end

  if net2 >= threshold
    z2 = 1;
  else
    z2 = 0;
  end

  y = z1 + z2;
end
