program parser;
uses CRT, scanner;

var is_any_error: boolean;
procedure exp_proc; forward;
procedure var_proc; forward;
procedure term_proc; forward;
procedure fact_proc; forward;
procedure factor_proc; forward;

procedure error_reporting(id: byte);
begin
  is_any_error := true;
  case id of
    1: writeln('''then'' expected');
    2: writeln(''':='' expected');
    3: writeln('''identifier'' expected');
    4: writeln(''']'' expected');
    5: writeln(''')'' expected');
  end;
  writeln('Line: ', LineNumber);
end;

procedure stat_proc;
begin
  if token = t_if
    then begin
      scan;
      exp_proc;
      if token <> t_then
        then error_reporting(1)
      else
        begin
          scan;
          stat_proc;
          if token = t_else
            then begin
              scan;
              stat_proc;
            end
        end;
    end
  else begin
    var_proc;
    if token <> t_assign
    then error_reporting(2)
    else begin
      scan;
      exp_proc;
    end;
  end;
end;

procedure var_proc;
begin
  if token <> t_id
    then error_reporting(3) 
    else begin
      scan;
      if token <> t_lbrack
        then begin
          scan;
          exp_proc;
          if token <> t_rbrack
            then error_reporting(4)
            else scan;
          end;
      end;
end;

procedure exp_proc;
begin
  term_proc;
  while token in [t_add, t_sub]
    do begin
      scan;
      term_proc;
    end;
end;

procedure term_proc;
begin
  fact_proc;
  while token in [t_mul, t_rdiv]
    do begin
      scan;
      fact_proc;
    end;
end;

procedure fact_proc;
begin
  factor_proc;
  while token = t_double_mul
    do begin
      scan;
      fact_proc;
    end;
end;

procedure factor_proc;
begin
  if token = t_lparent
    then begin
      scan;
      exp_proc;
      if token <> t_rparent
        then error_reporting(5)
      else scan
    end
  else if token = t_int
    then scan
    else var_proc;
end;

begin
  clrscr;
  initialize;
  is_any_error := false;
  scan;
  clrscr;
  terminate;
  if is_any_error
    then writeln('Parsing fail')
    else writeln('Parsing success');
  repeat until readkey = #13
end.
