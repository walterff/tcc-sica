-- phpMyAdmin SQL Dump
-- version 3.4.10.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: 26/06/2012 às 14h40min
-- Versão do Servidor: 5.5.20
-- Versão do PHP: 5.3.10

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `bdleite`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblanimais`
--

CREATE TABLE IF NOT EXISTS `tblanimais` (
  `CodAni` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NomeAni` varchar(30) DEFAULT NULL,
  `DescricaoAni` varchar(50) DEFAULT NULL,
  `TipoAni` varchar(20) DEFAULT NULL,
  `DataNasc` date DEFAULT NULL,
  `IdadeAni` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`CodAni`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Extraindo dados da tabela `tblanimais`
--

INSERT INTO `tblanimais` (`CodAni`, `NomeAni`, `DescricaoAni`, `TipoAni`, `DataNasc`, `IdadeAni`) VALUES
(1, 'Mimosa', 'Muito Brava', 'Vaca', '1994-06-10', 18),
(2, 'Coringa', 'Inimigo do Batman', 'Boi', '1950-05-18', 62);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblclientes`
--

CREATE TABLE IF NOT EXISTS `tblclientes` (
  `CodCli` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NomeCli` varchar(30) DEFAULT NULL,
  `EnderecoCli` varchar(50) DEFAULT NULL,
  `NumCli` varchar(50) DEFAULT NULL,
  `BairroCli` varchar(20) DEFAULT NULL,
  `CidadeCli` varchar(20) DEFAULT NULL,
  `UfCli` int(2) DEFAULT NULL,
  `Fone1Cli` varchar(13) DEFAULT NULL,
  `Fone2Cli` varchar(13) DEFAULT NULL,
  `Fone3Cli` varchar(13) DEFAULT NULL,
  `Fone4Cli` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`CodCli`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `tblclientes`
--

INSERT INTO `tblclientes` (`CodCli`, `NomeCli`, `EnderecoCli`, `NumCli`, `BairroCli`, `CidadeCli`, `UfCli`, `Fone1Cli`, `Fone2Cli`, `Fone3Cli`, `Fone4Cli`) VALUES
(1, 'Henrique de Carvalho', 'Rua Espirito Santo', '102', 'Vila Nova', 'Cerqueira César', 25, '(14)9740-0493', '(  )    -', '(  )    -', '(  )    -');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblcontasrecebe`
--

CREATE TABLE IF NOT EXISTS `tblcontasrecebe` (
  `CodConta` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `DataInicial` date DEFAULT NULL,
  `DataFinal` date DEFAULT NULL,
  `NomeCli` varchar(30) DEFAULT NULL,
  `ValorTotalReceb` float DEFAULT NULL,
  PRIMARY KEY (`CodConta`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `tblcontasrecebe`
--

INSERT INTO `tblcontasrecebe` (`CodConta`, `DataInicial`, `DataFinal`, `NomeCli`, `ValorTotalReceb`) VALUES
(1, '2012-06-10', '2012-06-14', 'Henrique de Carvalho', -10.7);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblitensvacinas`
--

CREATE TABLE IF NOT EXISTS `tblitensvacinas` (
  `TblAnimais_CodAni` int(10) unsigned NOT NULL,
  `TblVacinas_CodVacina` int(10) unsigned NOT NULL,
  `CodItemVacina` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NomeItemVacina` varchar(20) DEFAULT NULL,
  `DataAplic` date DEFAULT NULL,
  `DescrUltVacina` varchar(40) DEFAULT NULL,
  `DataProxAplic` date DEFAULT NULL,
  `DescrProxVacina` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`CodItemVacina`),
  KEY `TblAnimais_has_TblVacinas_FKIndex1` (`TblAnimais_CodAni`),
  KEY `TblAnimais_has_TblVacinas_FKIndex2` (`TblVacinas_CodVacina`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Extraindo dados da tabela `tblitensvacinas`
--

INSERT INTO `tblitensvacinas` (`TblAnimais_CodAni`, `TblVacinas_CodVacina`, `CodItemVacina`, `NomeItemVacina`, `DataAplic`, `DescrUltVacina`, `DataProxAplic`, `DescrProxVacina`) VALUES
(1, 1, 1, 'Febre Aftose', '2012-05-13', 'Febre Aftose', '2012-05-20', 'Febre Aftose'),
(2, 2, 2, 'Brucelose', '2012-05-13', 'Contra Brucelose', '2012-05-20', 'Contra Brucelose'),
(3, 3, 3, 'Aspirina', '2012-05-13', 'Aspirina', '2012-05-13', 'Aspirina'),
(2, 1, 4, 'Febre Aftose', '2012-05-13', 'Febre Aftose', '2012-05-27', 'Febre Aftose'),
(3, 1, 5, 'Febre Aftose', '2012-05-14', 'Febre Aftose', '2012-05-15', 'Febre Aftose'),
(3, 3, 6, 'Aspirina', '2012-05-14', 'Aspirina', '2012-05-28', 'Aspirina'),
(1, 1, 7, 'Febre Aftose', '2012-06-07', 'Febre Aftose', '2012-06-30', 'Febre Aftose'),
(2, 1, 8, 'Febre Aftose', '2012-06-07', 'Febre Aftose', '2012-06-14', 'Febre Aftose'),
(1, 2, 9, 'Brucelose', '2012-06-07', 'Contra Brucelose', '2012-06-14', 'Contra Brucelose'),
(1, 1, 10, 'Febre Aftose', '2012-06-07', 'Febre Aftose', '2012-06-14', 'Febre Aftose'),
(2, 3, 11, 'Aspirina', '2012-06-07', 'Aspirina', '2012-06-30', 'Aspirina'),
(2, 2, 12, 'Brucelose', '2012-06-26', 'Contra Brucelose', '2012-06-26', 'Contra Brucelose'),
(1, 1, 13, 'Febre Aftose', '2012-06-26', 'Febre Aftose', '2012-06-26', 'Febre Aftose');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblitensvendas`
--

CREATE TABLE IF NOT EXISTS `tblitensvendas` (
  `CodItemVenda` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `TblVendas_CodVenda` int(10) unsigned NOT NULL,
  `TblProdutos_CodProd` int(10) unsigned NOT NULL,
  `TipoProdVenda` varchar(20) DEFAULT NULL,
  `TotalVendaProd` float DEFAULT NULL,
  `QuantidadeProd` float DEFAULT NULL,
  `PrecoUniProd` float DEFAULT NULL,
  `TipoUni` varchar(10) DEFAULT NULL,
  `DataVendaProd` date DEFAULT NULL,
  PRIMARY KEY (`CodItemVenda`),
  KEY `TblItensVendas_FKIndex1` (`TblProdutos_CodProd`),
  KEY `TblItensVendas_FKIndex2` (`TblVendas_CodVenda`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Extraindo dados da tabela `tblitensvendas`
--

INSERT INTO `tblitensvendas` (`CodItemVenda`, `TblVendas_CodVenda`, `TblProdutos_CodProd`, `TipoProdVenda`, `TotalVendaProd`, `QuantidadeProd`, `PrecoUniProd`, `TipoUni`, `DataVendaProd`) VALUES
(1, 1, 1, 'Leite', 1, 1, 1, 'Litros', '2012-06-08'),
(2, 1, 1, 'Leite', 8.5, 5, 1.7, 'Litros', '2012-06-11'),
(3, 1, 1, 'Leite', 18, 10, 1.8, 'Litros', '2012-06-12'),
(4, 1, 1, 'Leite', 18, 10, 1.8, 'Litros', '2012-06-12'),
(5, 1, 1, 'Leite', 20, 10, 2, 'Litros', '2012-06-12'),
(6, 2, 1, 'Leite', 250, 100, 2.5, 'Litros', '2012-06-11'),
(7, 4, 1, 'Leite', 17.5, 10, 1.75, 'Litros', '2012-06-12'),
(8, 3, 1, 'Leite', 10, 5, 2, 'Litros', '2012-06-12'),
(9, 5, 1, 'Leite', 1.7, 1, 1.7, 'Litros', '2012-06-12'),
(10, 1, 1, 'Leite', 37.5, 15, 2.5, 'Litros', '2012-06-13');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblleite`
--

CREATE TABLE IF NOT EXISTS `tblleite` (
  `CodLeite` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `DataTiradoLeite` date DEFAULT NULL,
  `QuantidadeLeite` float DEFAULT NULL,
  PRIMARY KEY (`CodLeite`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblprodutos`
--

CREATE TABLE IF NOT EXISTS `tblprodutos` (
  `CodProd` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `TipoProd` varchar(20) DEFAULT NULL,
  `DescricaoProd` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`CodProd`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `tblprodutos`
--

INSERT INTO `tblprodutos` (`CodProd`, `TipoProd`, `DescricaoProd`) VALUES
(1, 'Leite', 'Leite'),
(2, 'Ovo', 'Ovo');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbltema`
--

CREATE TABLE IF NOT EXISTS `tbltema` (
  `CodTema` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NomeTema` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`CodTema`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `tbltema`
--

INSERT INTO `tbltema` (`CodTema`, `NomeTema`) VALUES
(1, 'BlackEye');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblvacinas`
--

CREATE TABLE IF NOT EXISTS `tblvacinas` (
  `CodVacina` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NomeVacina` varchar(20) DEFAULT NULL,
  `DescricaoVacina` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`CodVacina`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Extraindo dados da tabela `tblvacinas`
--

INSERT INTO `tblvacinas` (`CodVacina`, `NomeVacina`, `DescricaoVacina`) VALUES
(1, 'Febre Aftose', 'Febre Aftose'),
(2, 'Brucelose', 'Contra Brucelose'),
(3, 'Aspirina', 'Aspirina');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblvendas`
--

CREATE TABLE IF NOT EXISTS `tblvendas` (
  `CodVenda` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `TblClientes_CodCli` int(10) unsigned NOT NULL,
  `TotalVenda` float DEFAULT NULL,
  `NomeCli` varchar(20) DEFAULT NULL,
  `VencimentoVenda` date DEFAULT NULL,
  `PagoVenda` float DEFAULT NULL,
  `SaldoVenda` float DEFAULT NULL,
  PRIMARY KEY (`CodVenda`),
  KEY `TblVendas_FKIndex1` (`TblClientes_CodCli`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Extraindo dados da tabela `tblvendas`
--

INSERT INTO `tblvendas` (`CodVenda`, `TblClientes_CodCli`, `TotalVenda`, `NomeCli`, `VencimentoVenda`, `PagoVenda`, `SaldoVenda`) VALUES
(1, 1, 103, 'Henrique de Carvalho', '2012-06-30', 100, -3),
(2, 1, 250, 'Henrique de Carvalho', '2012-06-30', 250, 0),
(3, 1, 10, 'Henrique de Carvalho', '2012-06-13', 0, -10),
(4, 1, 17.5, 'Henrique de Carvalho', '2012-06-13', 17, -0.5),
(5, 1, 1.7, 'Henrique de Carvalho', '2012-06-13', 1.5, -0.2),
(6, 1, 0, 'Henrique de Carvalho', NULL, 0, 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
