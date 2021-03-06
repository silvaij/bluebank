--POPULAR TB_ENDERECO
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES ('Rua Bandeira de Melo', 164, 'bairro Monet', 'Resende', 'RJ', '23097120');
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES ('Rua Bandeira de Melo(MEMEU)', 164, 'bairro Monet', 'Resende', 'RJ', '23097120');
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES ('Rua Bandeira de Melo(BENTO)', 164, 'bairro Monet', 'Resende', 'RJ', '23097120');
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('1007 N CAYUGA ST,75 - 22 A', '75', '22 A', 'SP', 'Beaumont', 12544);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('AV Devin Ashley,2950 - APTO  68', '2950', 'APTO  68', 'SP', 'Beaumont', 42345);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('R Romanth Bolster,243', '243', NULL, 'SP', 'Jersey City', 83146);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('99 WEST FOURTH ST,29', '29', NULL, 'SP', 'Beaumont', 45008);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('32 CUTTER AVE,74 - C', '74', ' C', 'SP', 'Tempe', 23446);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('111 SACO AVE,654', '654', NULL, 'SP', 'Beaumont', 42051);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('11 OAKHURST ST,18 - 0', '18', '0', 'SP', 'Beaumont', 63000);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('105 BATES STREET,305', '305', NULL, 'SP', 'Beaumont', 45125);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('93 ETNA RD,694 - AP 5', '694', 'Ap 5 ', 'SP', 'Kent', 55345);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('93 ETNA RD,694 - AP 5', '694', 'Ap 5 ', 'SP', 'Kent', 55345);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('310 HERITAGE POINT,198', '198', NULL, 'SP', 'Beaumont', 48725);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('93 FORT AVE,166', '166', NULL, 'SP', 'Beaumont', 12544);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('R Drake Barton,11', '11', NULL, 'SP', 'Jersey City', 50505);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('AV Fabron Boscawen,455 - AP 66 TORRE1', '455', 'ap 66 torre1', 'SP', 'Tempe', 78452);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('R Romeo McFadden,499 - CASA 12', '499', 'casa 12', 'SP', 'Jersey City', 45678);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('R Damon Granger,115', '115', NULL, 'SP', 'Jersey City', 12085);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('191 THOMAS EAST BURGIN,37', '37', NULL, 'SP', 'Beaumont', 48725);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('R Rolfe Eggleston,444', '444', NULL, 'SP', 'Jersey City', 20505);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('95 COUNTRY CLUB RD,40 - AP 506 BLOCO 2', '40', 'Ap 506 bloco 2', 'SP', 'Virginia Beach', 23446);
INSERT INTO tb_endereco(rua, numero, complemento, cidade, estado, cep) VALUES('102 GROVELAND ST,3', '3', NULL, 'SP', 'Beaumont', 34345);

--POPULAR TB_CONTA
INSERT INTO tb_conta(banco, numero_agencia, numero_conta, saldo) VALUES('BlueBank', '0001', '123456', 1000.00);
INSERT INTO tb_conta(banco, numero_agencia, numero_conta, saldo) VALUES('BlueBank', '0001', '112233', 1000.00);


--POPULAR TB_CLIENTE
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id, conta_id) VALUES ('Bruno Carvalho', '00000000000', '020205203', '1982-04-30', '(24) 99991-3731', 'boakdev@gmail.com', 1, 1);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id, conta_id) VALUES ('Isaque Silva', '11111111111', '020205203', '1990-05-10', '(11) 99746-5171', 'isaque@gmail.com', 4, 2);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES ('Romeu Carvalho', '01010101010', '020205203', '2011-10-03', '(24) 99991-3731', 'memeudev@gmail.com', 2);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES ('Bento Carvalho', '22222222222', '020205203', '2020-02-27', '(24) 99991-3731', 'bentodev@gmail.com', 3);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Dale Ada', 45832916557, '27.242.111-X', TIMESTAMP '1976-12-08 00:00:00.000000', '11965552117', 'Ferdinand.Emerson@nytimes.us',4);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Ronald Ethelbert', 91616864508, '25.242.064-0', TIMESTAMP '1976-08-25 00:00:00.000000', '11985551061', 'Romanth.Aston@iol.us',5);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Dennis Herbert', 42568590556, '24.567.340-4', TIMESTAMP '1974-05-22 00:00:00.000000', '11945558675', 'Darell.Bristed@fmr.org',6);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Fletcher Richard', 80224864505, '32.219.530-5', TIMESTAMP '1980-08-11 00:00:00.000000', '11985553388', 'Dante.Brendon@aol.ie',7);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Robert Dunstan', 89373768573, '46.050.194-X', TIMESTAMP '1984-09-25 00:00:00.000000', '11995551061', 'Francis.Fulke@aol.gov',8);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Denley Andarton', 47955468511, '24.252.112-5', TIMESTAMP '1972-02-14 00:00:00.000000', '11985558675', 'Dorian.Conway@fmr.uk',9);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Reed Bunyan', 48346547536, '25.157.036-8', TIMESTAMP '1973-05-02 00:00:00.000000', '11975559890', 'Roderick.Ashley@fmr.edu',10);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Dennis Arthur', 87980080564, '28.179.727-4', TIMESTAMP '1984-03-26 00:00:00.000000', '11985552115', 'Dennis.Burr@mailhost.gov',11);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Ramon Clough', 94508288593, '32.104.833-7', TIMESTAMP '1980-11-04 00:00:00.000000', '11995559121', 'Rodney.Askew@iol.org',12);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Rodney Edmund', 92057317579, '29.724.892-3', TIMESTAMP '1978-10-25 00:00:00.000000', '11995556351', 'Reed.Alden@nytimes.ie',14);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Renwick Cutting', 88204054580, '44.389.947-2', TIMESTAMP '1986-08-29 00:00:00.000000', '11985554489', 'Robert.Ashby@mailer.edu',15);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Fletcher Burr', 94957287546, '27.369.424-8', TIMESTAMP '1975-01-07 00:00:00.000000', '11945551209', 'Floyd.Falkland@yahoo.us',16);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Damon Ainsworth', 84307420500, '288247392', TIMESTAMP '1983-06-30 00:00:00.000000', '11965559602', 'Randolph.Adlam@nytimes.uk',17);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Dwayne Bodley', 92507815558, '32.059.481-6', TIMESTAMP '1979-09-26 00:00:00.000000', '11995553502', 'Raphael.Adolphus@nytimes.org',18);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Darcy Hainsworth', 87764009563, '32.841.007-X', TIMESTAMP '1986-10-01 00:00:00.000000', '11985551061', 'Durwin.Dering@mailer.gov',19);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Derwin Herman', 83810544515, '40.019.711-X', TIMESTAMP '1987-10-14 00:00:00.000000', '11985552117', 'Daniel.Bowne@fmr.org',20);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Renfred Connell', 49550738590, '21.146.399-1', TIMESTAMP '1969-11-18 00:00:00.000000', '11975559890', 'Ross.Barclay@mailhost.us',21);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Darcy Hainsworth', 92714122574, '29.195.048-6', TIMESTAMP '1977-01-21 00:00:00.000000', '19995557007', 'Rory.Baker@msn.net',22);
INSERT INTO tb_cliente (nome_completo, cpf, rg, data_nascimento, telefone, email, endereco_id) VALUES('Dixon Keigwin', 88199380578, '35.554.953-0', TIMESTAMP '1985-03-13 00:00:00.000000', '11975554489', 'Farley.Edith@yahoo.org',23);