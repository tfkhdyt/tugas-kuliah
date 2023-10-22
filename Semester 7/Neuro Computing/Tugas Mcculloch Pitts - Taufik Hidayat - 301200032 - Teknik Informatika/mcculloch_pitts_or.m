function y = mcculloch_pitts_or(x1, x2)
  weight = 1;
  net = sum([x1 x2] .* weight);
  threshold = 1;

  if net >= threshold
    y = 1;
  else
    y = 0;
  end
end
