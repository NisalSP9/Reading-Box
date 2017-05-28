CREATE DATABASE  IF NOT EXISTS `dmcmslk` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `dmcmslk`;
-- MySQL dump 10.13  Distrib 5.7.16, for Linux (x86_64)
--
-- Host: localhost    Database: dmcmslk
-- ------------------------------------------------------
-- Server version	5.7.16-0ubuntu0.16.04.1

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
-- Table structure for table `hotels`
--

DROP TABLE IF EXISTS `hotels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hotels` (
  `hotel_id` int(11) NOT NULL AUTO_INCREMENT,
  `hotel_name` varchar(100) NOT NULL,
  `hotel_name_cn` varchar(45) DEFAULT NULL,
  `city_id` varchar(45) NOT NULL,
  `hotel_category` varchar(45) NOT NULL,
  `hotel_type` varchar(45) DEFAULT NULL,
  `hotel_chain` varchar(100) DEFAULT NULL,
  `hotel_address` varchar(200) DEFAULT NULL,
  `hotel_gps_location` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`hotel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hotels`
--

LOCK TABLES `hotels` WRITE;
/*!40000 ALTER TABLE `hotels` DISABLE KEYS */;
INSERT INTO `hotels` VALUES (61,'Hilton','Holton - Colombo','Colombo','Five Star','400 to 700 Rooms','Other','Colombo, Sri Lanka','6.890989, 45.783648'),(62,'Galadari','Galadari - Colombo','Colombo','Five Star','More than 700 Rooms','Other','Colombo, Sri Lanka','6.890948, 65.893758'),(63,'Laya','Laya - Kalutara','Kalutara','Three Star','Under 200 Rooms','Laya','Kukuleganga, Kalutara, Sri Lanka','8.893748, 47.783958'),(64,'Taj Samudra','Taj - Colombo','Colombo','Five Star','400 to 700 Rooms','Taj','Colombo, Sri Lanka','4.785867, 80.564749'),(65,'Cinnemon','Cinnemon - Colombo','Colombo','Four Star','200 to 399 Rooms','JKH','Colombo, Sri Lanka','4.895859, 89.465487'),(66,'Araliya Villa','Araliya Villa - Matara','Matara','One Star','200 to 399 Rooms','Araliya','Gall Rd, Matara, Sri Lanka','46.895768, 90.785948'),(67,'Gall Fort','Gall Fort - Galle','Galle','Three Star','400 to 700 Rooms','Other','Galle, Sri Lanka','4.894995, 89.758494'),(68,'Queens','Queens - Kandy','Kandy','Five Star','200 to 399 Rooms','Other','Kandy, Sri Lanka','4.8930494, 56.894038'),(69,'Avani','Avani - Kaluta','Kalutara','Three Star','Under 200 Rooms','Other','Kalutara, Sri Lanka','4.873948, 80.758493'),(70,'Amaya','Amaya - Kandy','Kandy','Three Star','400 to 700 Rooms','Amaya','Kandy, Sri Lanka','3.895049, 80.758494'),(71,'Belihiloya Rest House','Belihuloya - Sri Lanka','Rathnapura','Two Star','Under 200 Rooms','Other','Belihuloya, Sri Lanka','4.875869, 56.784938'),(72,'Jet Wing','Jet Wing - Panadura','Kalutara','Four Star','200 to 399 Rooms','Jet Wing','Panadura, Sri Lanka','6.904894, 60.895950'),(73,'Jet Wing','Jet Wing - Panadura','Kalutara','Other','Under 200 Rooms','Jet Wing','Panadura Sri lanka','4.99988 45.99888');
/*!40000 ALTER TABLE `hotels` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-12 22:46:14
