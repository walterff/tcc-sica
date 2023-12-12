-- MySQL dump 10.13  Distrib 5.5.20, for Win32 (x86)
--
-- Host: localhost    Database: bdleite
-- ------------------------------------------------------
-- Server version	5.5.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tblanimais`
--

DROP TABLE IF EXISTS `tblanimais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblanimais` (
  `CodAni` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NomeAni` varchar(30) DEFAULT NULL,
  `DescricaoAni` varchar(50) DEFAULT NULL,
  `TipoAni` varchar(20) DEFAULT NULL,
  `DataNasc` date DEFAULT NULL,
  `IdadeAni` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`CodAni`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblanimais`
--

LOCK TABLES `tblanimais` WRITE;
/*!40000 ALTER TABLE `tblanimais` DISABLE KEYS */;
INSERT INTO `tblanimais` VALUES (1,'Mimosa','Muito Brava','Vaca','1994-06-10',17),(2,'Coringa','Inimigo do Batman','Boi','1957-05-01',55),(4,'a','a','Vaca','1999-05-08',13);
/*!40000 ALTER TABLE `tblanimais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblclientes`
--

DROP TABLE IF EXISTS `tblclientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblclientes` (
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
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblclientes`
--

LOCK TABLES `tblclientes` WRITE;
/*!40000 ALTER TABLE `tblclientes` DISABLE KEYS */;
INSERT INTO `tblclientes` VALUES (1,'Henrique de Carvalho','Rua Espirito Santo','102','Vila Nova','Cerqueira César',25,'(14)9740-0493','(  )    -','(  )    -','(  )    -');
/*!40000 ALTER TABLE `tblclientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblcontasrecebe`
--

DROP TABLE IF EXISTS `tblcontasrecebe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblcontasrecebe` (
  `CodConta` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `DataInicial` date DEFAULT NULL,
  `DataFinal` date DEFAULT NULL,
  `TipoProd` varchar(20) DEFAULT NULL,
  `ValorTotalReceb` float DEFAULT NULL,
  PRIMARY KEY (`CodConta`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblcontasrecebe`
--

LOCK TABLES `tblcontasrecebe` WRITE;
/*!40000 ALTER TABLE `tblcontasrecebe` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblcontasrecebe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblitensvacinas`
--

DROP TABLE IF EXISTS `tblitensvacinas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblitensvacinas` (
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
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblitensvacinas`
--

LOCK TABLES `tblitensvacinas` WRITE;
/*!40000 ALTER TABLE `tblitensvacinas` DISABLE KEYS */;
INSERT INTO `tblitensvacinas` VALUES (1,1,1,'Febre Aftose','2012-05-13','Febre Aftose','2012-05-20','Febre Aftose'),(2,2,2,'Brucelose','2012-05-13','Contra Brucelose','2012-05-20','Contra Brucelose'),(3,3,3,'Aspirina','2012-05-13','Aspirina','2012-05-13','Aspirina'),(2,1,4,'Febre Aftose','2012-05-13','Febre Aftose','2012-05-27','Febre Aftose'),(3,1,5,'Febre Aftose','2012-05-14','Febre Aftose','2012-05-15','Febre Aftose'),(3,3,6,'Aspirina','2012-05-14','Aspirina','2012-05-28','Aspirina'),(1,2,7,'Brucelose','2012-05-14','Contra Brucelose','2012-05-01','Contra Brucelose'),(2,1,8,'Febre Aftose','2012-05-14','Febre Aftose','2012-05-17','Febre Aftose'),(4,1,9,'Febre Aftose','2012-05-26','Febre Aftose','2012-05-26','Febre Aftose'),(1,3,10,'Aspirina','2012-05-27','Aspirina','2012-05-27','Aspirina'),(4,2,11,'Brucelose','2012-05-27','Contra Brucelose','2012-05-30','Contra Brucelose'),(4,3,12,'Aspirina','2012-05-27','Aspirina','2012-05-29','Aspirina'),(4,1,13,'Febre Aftose','2012-05-27','Febre Aftose','2012-05-31','Febre Aftose'),(4,3,14,'Aspirina','2012-05-27','Aspirina','2012-05-30','Aspirina');
/*!40000 ALTER TABLE `tblitensvacinas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblitensvendas`
--

DROP TABLE IF EXISTS `tblitensvendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblitensvendas` (
  `CodItemVenda` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `TblVendas_CodVenda` int(10) unsigned NOT NULL,
  `TblProdutos_CodProd` int(10) unsigned NOT NULL,
  `TipoProdVenda` varchar(20) DEFAULT NULL,
  `TotalVendaProd` float DEFAULT NULL,
  `QuantidadeProd` float DEFAULT NULL,
  `PrecoUniProd` float DEFAULT NULL,
  `TipoUni` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`CodItemVenda`),
  KEY `TblItensVendas_FKIndex1` (`TblProdutos_CodProd`),
  KEY `TblItensVendas_FKIndex2` (`TblVendas_CodVenda`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblitensvendas`
--

LOCK TABLES `tblitensvendas` WRITE;
/*!40000 ALTER TABLE `tblitensvendas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblitensvendas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblleite`
--

DROP TABLE IF EXISTS `tblleite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblleite` (
  `CodLeite` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `DataTiradoLeite` date DEFAULT NULL,
  `QuantidadeLeite` float DEFAULT NULL,
  PRIMARY KEY (`CodLeite`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblleite`
--

LOCK TABLES `tblleite` WRITE;
/*!40000 ALTER TABLE `tblleite` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblleite` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblprodutos`
--

DROP TABLE IF EXISTS `tblprodutos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblprodutos` (
  `CodProd` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `TipoProd` varchar(20) DEFAULT NULL,
  `DescricaoProd` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`CodProd`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblprodutos`
--

LOCK TABLES `tblprodutos` WRITE;
/*!40000 ALTER TABLE `tblprodutos` DISABLE KEYS */;
INSERT INTO `tblprodutos` VALUES (1,'Leite','Leite');
/*!40000 ALTER TABLE `tblprodutos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbltema`
--

DROP TABLE IF EXISTS `tbltema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbltema` (
  `CodTema` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NomeTema` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`CodTema`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbltema`
--

LOCK TABLES `tbltema` WRITE;
/*!40000 ALTER TABLE `tbltema` DISABLE KEYS */;
INSERT INTO `tbltema` VALUES (1,'BlackStar');
/*!40000 ALTER TABLE `tbltema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblvacinas`
--

DROP TABLE IF EXISTS `tblvacinas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblvacinas` (
  `CodVacina` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NomeVacina` varchar(20) DEFAULT NULL,
  `DescricaoVacina` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`CodVacina`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblvacinas`
--

LOCK TABLES `tblvacinas` WRITE;
/*!40000 ALTER TABLE `tblvacinas` DISABLE KEYS */;
INSERT INTO `tblvacinas` VALUES (1,'Febre Aftose','Febre Aftose'),(2,'Brucelose','Contra Brucelose'),(3,'Aspirina','Aspirina');
/*!40000 ALTER TABLE `tblvacinas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblvendas`
--

DROP TABLE IF EXISTS `tblvendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblvendas` (
  `CodVenda` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `TblClientes_CodCli` int(10) unsigned NOT NULL,
  `TotalVenda` float DEFAULT NULL,
  `NomeCli` varchar(20) DEFAULT NULL,
  `DataVenda` date DEFAULT NULL,
  `PagoVenda` float DEFAULT NULL,
  `SaldoVenda` float DEFAULT NULL,
  PRIMARY KEY (`CodVenda`),
  KEY `TblVendas_FKIndex1` (`TblClientes_CodCli`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblvendas`
--

LOCK TABLES `tblvendas` WRITE;
/*!40000 ALTER TABLE `tblvendas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblvendas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2012-05-27 18:53:22
