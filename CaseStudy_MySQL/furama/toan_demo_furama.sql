CREATE DATABASE  IF NOT EXISTS `toan_demo_furama` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `toan_demo_furama`;
-- MySQL dump 10.13  Distrib 8.0.20, for Linux (x86_64)
--
-- Host: localhost    Database: toan_demo_furama
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `addition_services`
--

DROP TABLE IF EXISTS `addition_services`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `addition_services` (
  `id` int NOT NULL AUTO_INCREMENT,
  `service_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `service_fee` decimal(13,4) NOT NULL,
  `status` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `service_name` (`service_name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `addition_services`
--

LOCK TABLES `addition_services` WRITE;
/*!40000 ALTER TABLE `addition_services` DISABLE KEYS */;
INSERT INTO `addition_services` VALUES (1,'Massage',49.9900,1),(2,'Karaoke',39.9900,1),(3,'Thức ăn',19.9900,1),(4,'Nước uống',4.9900,1),(5,'Thuê xe tham quan Resort',19.9900,1);
/*!40000 ALTER TABLE `addition_services` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contract_addition_services`
--

DROP TABLE IF EXISTS `contract_addition_services`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contract_addition_services` (
  `contract_id` int NOT NULL,
  `addition_service_id` int NOT NULL,
  `quantity` int DEFAULT '1',
  PRIMARY KEY (`contract_id`,`addition_service_id`),
  KEY `addition_service_id` (`addition_service_id`),
  CONSTRAINT `contract_addition_services_ibfk_1` FOREIGN KEY (`contract_id`) REFERENCES `contracts` (`id`),
  CONSTRAINT `contract_addition_services_ibfk_2` FOREIGN KEY (`addition_service_id`) REFERENCES `addition_services` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contract_addition_services`
--

LOCK TABLES `contract_addition_services` WRITE;
/*!40000 ALTER TABLE `contract_addition_services` DISABLE KEYS */;
INSERT INTO `contract_addition_services` VALUES (1,1,1),(2,3,1),(2,4,1),(3,3,2),(3,4,2),(3,5,1),(4,5,1),(14,4,1),(14,5,1),(15,3,2);
/*!40000 ALTER TABLE `contract_addition_services` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contracts`
--

DROP TABLE IF EXISTS `contracts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contracts` (
  `id` int NOT NULL AUTO_INCREMENT,
  `employee_id` int NOT NULL,
  `customer_id` int NOT NULL,
  `service_id` int NOT NULL,
  `created_date` date NOT NULL,
  `check_in_date` date NOT NULL,
  `check_out_date` date NOT NULL,
  `deposit` decimal(13,4) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `employee_id` (`employee_id`),
  KEY `customer_id` (`customer_id`),
  KEY `service_id` (`service_id`),
  CONSTRAINT `contracts_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`id`),
  CONSTRAINT `contracts_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`id`),
  CONSTRAINT `contracts_ibfk_3` FOREIGN KEY (`service_id`) REFERENCES `services` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contracts`
--

LOCK TABLES `contracts` WRITE;
/*!40000 ALTER TABLE `contracts` DISABLE KEYS */;
INSERT INTO `contracts` VALUES (1,5,2,2,'2010-12-20','2010-12-22','2010-12-23',29.9900),(2,5,3,3,'2010-12-20','2010-12-23','2010-12-24',49.9900),(3,6,1,2,'2010-12-21','2010-12-25','2010-12-26',29.9900),(4,6,5,3,'2010-12-22','2010-12-25','2010-12-26',49.9900),(5,6,2,3,'2011-01-22','2011-01-27','2011-01-28',49.9900),(8,8,1,3,'2011-02-09','2011-02-11','2011-02-11',49.9900),(10,8,5,2,'2019-01-08','2019-01-10','2019-01-11',29.9900),(11,5,2,2,'2018-04-05','2018-04-08','2018-04-09',29.9900),(12,6,1,3,'2018-06-08','2018-06-10','2018-06-11',49.9900),(13,9,5,1,'2018-09-23','2018-09-27','2018-09-28',0.0000),(14,9,8,2,'2019-10-01','2019-10-02','2019-10-03',29.9900),(15,9,9,3,'2019-10-02','2019-10-03','2019-10-04',49.9900),(16,9,6,3,'2019-10-10','2019-10-20','2019-10-21',49.9900),(17,9,6,3,'2019-11-10','2019-11-15','2019-11-16',49.9900);
/*!40000 ALTER TABLE `contracts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_types`
--

DROP TABLE IF EXISTS `customer_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_types` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `type` (`type`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_types`
--

LOCK TABLES `customer_types` WRITE;
/*!40000 ALTER TABLE `customer_types` DISABLE KEYS */;
INSERT INTO `customer_types` VALUES (1,'Diamond'),(3,'Gold'),(5,'Member'),(2,'Platinum'),(4,'Silver');
/*!40000 ALTER TABLE `customer_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type_id` int NOT NULL,
  `first_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `middle_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `birthday` date NOT NULL,
  `identifier` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `phone` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `address` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `status` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `identifier` (`identifier`),
  UNIQUE KEY `phone` (`phone`),
  UNIQUE KEY `email` (`email`),
  KEY `type_id` (`type_id`),
  CONSTRAINT `customers_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `customer_types` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,1,'Duy','Phúc','Huỳnh','2000-11-09','163163963','0762123456','druschel@hotmail.com','Đà Nẵng',0),(2,1,'Giang','Thùy','Hồ','1998-08-12','124495633','0762654321','miltchev@outlook.com','Quảng Trị',0),(3,1,'Vi','Uyên','Kim','1960-01-12','106500190','0762654123','petersen@yahoo.com','Đà Nẵng',0),(4,1,'Duyên','Linh','Hoàng','1969-12-05','127426786','0762654323','monopole@optonline.net','Quảng Trị',1),(5,1,'Nguyệt','Ánh','Hoàng','1992-09-08','127426787','0762654565','weazelman@yahoo.ca','Huế',0),(6,2,'Giang','Nguyệt','Phạm','1990-12-01','127426009','0762654555','giang@gmail.com','Hà Nội',1),(8,1,'Mai','Kiều','Lâm','1992-05-18','127426087','0762654666','mai@yahoo.com','Quảng Ngãi',1),(9,1,'Oanh','Kim','Tôn','1991-09-12','127426088','0762654667','oanh667@gmail.com','Vinh',1);
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_departments`
--

DROP TABLE IF EXISTS `employee_departments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_departments` (
  `id` int NOT NULL AUTO_INCREMENT,
  `department` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `department` (`department`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_departments`
--

LOCK TABLES `employee_departments` WRITE;
/*!40000 ALTER TABLE `employee_departments` DISABLE KEYS */;
INSERT INTO `employee_departments` VALUES (2,'Hành chính'),(3,'Phục vụ'),(4,'Quản lý'),(1,'Sale – Marketing');
/*!40000 ALTER TABLE `employee_departments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_levels`
--

DROP TABLE IF EXISTS `employee_levels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_levels` (
  `id` int NOT NULL AUTO_INCREMENT,
  `level` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `level` (`level`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_levels`
--

LOCK TABLES `employee_levels` WRITE;
/*!40000 ALTER TABLE `employee_levels` DISABLE KEYS */;
INSERT INTO `employee_levels` VALUES (2,'Cao đẳng'),(3,'Đại học'),(4,'Sau đại học'),(1,'Trung cấp');
/*!40000 ALTER TABLE `employee_levels` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_positions`
--

DROP TABLE IF EXISTS `employee_positions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_positions` (
  `id` int NOT NULL AUTO_INCREMENT,
  `position` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `position` (`position`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_positions`
--

LOCK TABLES `employee_positions` WRITE;
/*!40000 ALTER TABLE `employee_positions` DISABLE KEYS */;
INSERT INTO `employee_positions` VALUES (3,'Chuyên viên'),(6,'Giám đốc'),(4,'Giám sát'),(1,'Lễ tân'),(2,'Phục vụ'),(5,'Quản lý');
/*!40000 ALTER TABLE `employee_positions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `middle_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `position_id` int NOT NULL,
  `level_id` int NOT NULL,
  `department_id` int NOT NULL,
  `birthday` date NOT NULL,
  `identifier` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `salary` decimal(13,4) NOT NULL,
  `phone` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `address` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `status` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `identifier` (`identifier`),
  UNIQUE KEY `phone` (`phone`),
  UNIQUE KEY `email` (`email`),
  KEY `position_id` (`position_id`),
  KEY `level_id` (`level_id`),
  KEY `department_id` (`department_id`),
  CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`position_id`) REFERENCES `employee_positions` (`id`),
  CONSTRAINT `employees_ibfk_2` FOREIGN KEY (`level_id`) REFERENCES `employee_levels` (`id`),
  CONSTRAINT `employees_ibfk_3` FOREIGN KEY (`department_id`) REFERENCES `employee_departments` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,'Hòa','Quang','Đặng',2,1,3,'2000-02-15','157453884',300.0000,'710 727 4525','kgove0@biblegateway.com','Quảng Trị',0),(2,'Hùng','Mạnh','Đoàn',2,1,3,'1999-01-05','157453344',300.0000,'541 445 3431','clepiscopio1@gravatar.com','Quảng Trị',0),(3,'Dũng','Chí','Hồ',3,3,1,'1996-11-08','157450099',500.0000,'165 412 6994','fhewertson3@myspace.com','Đà Nẵng',0),(5,'Hùng','Duy','Trầm',3,3,1,'1992-04-06','157458912',500.0000,'793 419 7369','ejaggs4@yellowpages.com','Quảng Trị',1),(6,'An','Thiên','Dương',3,3,1,'1990-04-06','157458865',600.0000,'815 742 4467','wcoronas5@apache.org','Đà Nẵng',1),(8,'Vinh','Trọng','Nguyễn',3,3,1,'1991-05-24','157458965',550.0000,'854 840 6103','bast6@marketwatch.com','Huế',1),(9,'Khoa','Tân','Quyền',3,3,1,'1993-09-24','157458915',600.0000,'854 840 1234','icarty8@sogou.com','Quảng Ngãi',1),(10,'Trung','Quốc','Ngư ',3,3,1,'1990-07-09','157450915',650.0000,'854 840 1235','cdobrowlski7@bizjournals.com','Đà Lạt',0);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `months`
--

DROP TABLE IF EXISTS `months`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `months` (
  `name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `value` int DEFAULT NULL,
  PRIMARY KEY (`name`),
  UNIQUE KEY `value_UNIQUE` (`value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `months`
--

LOCK TABLES `months` WRITE;
/*!40000 ALTER TABLE `months` DISABLE KEYS */;
INSERT INTO `months` VALUES ('Tháng 1',1),('Tháng 2',2),('Tháng 3',3),('Tháng 4',4),('Tháng 5',5),('Tháng 6',6),('Tháng 7',7),('Tháng 8',8),('Tháng 9',9),('Tháng 10',10),('Tháng 11',11),('Tháng 12',12);
/*!40000 ALTER TABLE `months` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rental_types`
--

DROP TABLE IF EXISTS `rental_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rental_types` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `type` (`type`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rental_types`
--

LOCK TABLES `rental_types` WRITE;
/*!40000 ALTER TABLE `rental_types` DISABLE KEYS */;
INSERT INTO `rental_types` VALUES (1,'Giờ'),(4,'Năm'),(2,'Ngày'),(3,'Tháng');
/*!40000 ALTER TABLE `rental_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_types`
--

DROP TABLE IF EXISTS `service_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service_types` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `type` (`type`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_types`
--

LOCK TABLES `service_types` WRITE;
/*!40000 ALTER TABLE `service_types` DISABLE KEYS */;
INSERT INTO `service_types` VALUES (2,'House'),(1,'Room'),(3,'Villa');
/*!40000 ALTER TABLE `service_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `services`
--

DROP TABLE IF EXISTS `services`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `services` (
  `id` int NOT NULL AUTO_INCREMENT,
  `service_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `area` int NOT NULL,
  `number_of_floors` int NOT NULL,
  `max_guest` int NOT NULL,
  `rental_fee` decimal(13,4) NOT NULL,
  `rental_type_id` int NOT NULL,
  `service_type_id` int NOT NULL,
  `status` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `service_name` (`service_name`),
  KEY `rental_type_id` (`rental_type_id`),
  KEY `service_type_id` (`service_type_id`),
  CONSTRAINT `services_ibfk_1` FOREIGN KEY (`rental_type_id`) REFERENCES `rental_types` (`id`),
  CONSTRAINT `services_ibfk_2` FOREIGN KEY (`service_type_id`) REFERENCES `service_types` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `services`
--

LOCK TABLES `services` WRITE;
/*!40000 ALTER TABLE `services` DISABLE KEYS */;
INSERT INTO `services` VALUES (1,'Room 01',50,1,2,100.0000,2,1,1),(2,'House 01',100,2,4,199.9900,2,2,1),(3,'Villa 01',200,1,4,399.9900,2,3,1);
/*!40000 ALTER TABLE `services` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-03 13:46:46
