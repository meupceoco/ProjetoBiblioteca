# ProjetoBiblioteca

Primeira coisa, tem que dar um create databases superbiblioteca e arrumar as tabelas, são essas aqui (se der problema só dar drop databases)

Aluno: 
CREATE TABLE `aluno` (
  `cpf` varchar(255) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `sobrenome` varchar(255) NOT NULL,
  `matricula` varchar(20) NOT NULL,
  PRIMARY KEY (`cpf`)

Professor: 
CREATE TABLE `professor` (
  `cpf` varchar(255) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `sobrenome` varchar(255) NOT NULL,
  `siape` varchar(7) NOT NULL,
  PRIMARY KEY (`cpf`)

Livro:
  CREATE TABLE `livros` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)

Emprestimos:
  CREATE TABLE `emprestimos` (
  `cpfpessoa` varchar(255) DEFAULT NULL,
  `cpfprofessor` varchar(255) DEFAULT NULL,
  `idlivro` int DEFAULT NULL,
  KEY `cpfpessoa` (`cpfpessoa`),
  KEY `cpfprofessor` (`cpfprofessor`),
  KEY `idlivro` (`idlivro`),
  CONSTRAINT `emprestimos_ibfk_1` FOREIGN KEY (`cpfpessoa`) REFERENCES `aluno` (`cpf`),
  CONSTRAINT `emprestimos_ibfk_2` FOREIGN KEY (`cpfprofessor`) REFERENCES `professor` (`cpf`),
  CONSTRAINT `emprestimos_ibfk_3` FOREIGN KEY (`idlivro`) REFERENCES `livros` (`id`)

na classe do conector.java, na linha 10, "DriverManager.getConnection("jdbc:mysql://localhost:3306/superbiblioteca", "root", "euamothaumcraft1!"
  tem que trocar o localhost:3306 pro que for na sua máquina, superbiblioteca é o nome do database, root é o nome do usuário e _euamothaumcraft1!_ a senha

  depois disso confere se tá tudo nas pasta certa, Menu e View na pasta view, Modelo na models, Controller e ICrud na controller e Banco na banco, o main fica fora disso e depois é pra rodar tranquilo. 

  O único problema se encontra na funcão de listagem do aluno e professor, na delimitação de empréstimo e na checagem de empréstimo pra não fazer aquela coisa de emprestar livro emprestado (não consegui implementar e nem sabia como).

