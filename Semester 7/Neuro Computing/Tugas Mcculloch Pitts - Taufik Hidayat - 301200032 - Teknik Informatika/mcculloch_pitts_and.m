function y = mcculloch_pitts_and(x1, x2)
  weight = 1;
  threshold = 2;
  net = x1 * weight + x2 * weight;

  if net >= threshold
    y = 1;
  else
    y = 0;
  end
end
