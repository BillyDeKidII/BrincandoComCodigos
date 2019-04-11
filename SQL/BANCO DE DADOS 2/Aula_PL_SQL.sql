Create Table FUNCIONARIO (
  NUM_MATRICULA number(8) not null PRIMARY KEY,
  NOM_FUNCIONARIO varchar2(40) not null,
  DAT_ADMISSAO date not null,
  TIP_ESTADO varchar2(1) not null,
  DAT_DEMISSAO date null,
  VAL_SALARIO number(8,2) null,
  COD_DEPTO number(3) null);
  
  EXECUTE P_INCLUI_FUNCIONARIO('José Almeida da Costa','S',100,1);
  
  select *from FUNCIONARIO;