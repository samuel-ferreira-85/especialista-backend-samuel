INSERT
INTO jogo
  (nome, desenvolvedora, plataforma)
VALUES
  ('Chrono Trigger', 'Squaresoft', 'SNES'),
  ('Final Fantasy VII', 'Squaresoft', 'Playstation'),
  ('Xenoblade Chronicles 3', 'Monolithsoft', 'Nintendo Switch');

INSERT
INTO usuario
  (nome, login, idade)
VALUES
  ('Samuel', 'fsam', 38);

INSERT
INTO usuario_jogo
  (usuario_id, jogo_id)
VALUES
  (1, 1);