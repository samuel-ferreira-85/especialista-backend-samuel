INSERT
INTO
  funcionario
  (nome)
VALUES
  ('Samuel'),
  ('Avila'),
  ('Levy');

INSERT
INTO
  animal
  (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, porte, data_adocao, funcionario_id, tipo)
VALUES
    ('Naruto', 5, 'Fila brasileiro', current_date -254, 'pulguento', 'Grande', current_date - 35, 1, 'CACHORRO'),
    ('Goku', 2, 'Angorá', current_date -25, 'machucado', 'pequeno', current_date - 3, 2, 'GATO'),
    ('Luffy', 3, 'Labrador retriever', current_date -5, 'magro', 'Médio', NULL, 3, 'CACHORRO'),
    ('Totó', 2, 'Pinscher', current_date -368, 'Desnutrido', 'Médio', NULL, 1, 'CACHORRO'),
    ('Lia', 4, 'Siamês', current_date -408, 'Magra', 'Pequena', current_date -7, 2, 'GATO'),
    ('Sil', 2, 'Persa', current_date - 32, 'Bem', 'Pequena', current_date - 30, 3, 'GATO');

