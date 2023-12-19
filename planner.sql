-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 19/12/2023 às 03:07
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `planner`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `compromisso`
--

CREATE TABLE `compromisso` (
  `codCompromisso` int(11) NOT NULL,
  `data` varchar(45) NOT NULL,
  `hora` varchar(45) NOT NULL,
  `descricao` varchar(45) NOT NULL,
  `codUsuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `compromisso`
--

INSERT INTO `compromisso` (`codCompromisso`, `data`, `hora`, `descricao`, `codUsuario`) VALUES
(12, '20-12-2023', '10:00', 'um pequeno teste', 1),
(13, '20-12-2023', '17:00', 'outro teste', 1),
(14, '29-12-2023', '11:00', 'PRAIA!', 1),
(15, '25-12-2023', '18:00', 'Natal com familia!', 2),
(16, '28-12-2023', '12:00', 'reuniao', 6);

-- --------------------------------------------------------

--
-- Estrutura para tabela `pessoa`
--

CREATE TABLE `pessoa` (
  `codUsuario` int(11) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `pessoa`
--

INSERT INTO `pessoa` (`codUsuario`, `usuario`, `senha`) VALUES
(1, 'moni', '123'),
(2, 'Alan', '563'),
(3, 'AnaDias', '159'),
(4, 'Carol', '1784'),
(5, 'Alan23', 'senha'),
(6, 'krugy', '666');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `compromisso`
--
ALTER TABLE `compromisso`
  ADD PRIMARY KEY (`codCompromisso`),
  ADD KEY `fk_codUsuario_idx` (`codUsuario`);

--
-- Índices de tabela `pessoa`
--
ALTER TABLE `pessoa`
  ADD PRIMARY KEY (`codUsuario`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `compromisso`
--
ALTER TABLE `compromisso`
  MODIFY `codCompromisso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de tabela `pessoa`
--
ALTER TABLE `pessoa`
  MODIFY `codUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `compromisso`
--
ALTER TABLE `compromisso`
  ADD CONSTRAINT `fk_codUsuario` FOREIGN KEY (`codUsuario`) REFERENCES `pessoa` (`codUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
