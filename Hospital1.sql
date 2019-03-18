-- MySQL dump 10.13  Distrib 5.7.20, for Linux (i686)
--
-- Host: localhost    Database: Hospital
-- ------------------------------------------------------
-- Server version	5.7.20-0ubuntu0.16.04.1

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
-- Table structure for table `Bill_Room`
--

DROP TABLE IF EXISTS `Bill_Room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Bill_Room` (
  `BillNo` int(25) NOT NULL AUTO_INCREMENT,
  `DischargeID` int(25) NOT NULL,
  `BillingDate` text NOT NULL,
  `NoOfDays` int(25) NOT NULL,
  `RoomCharges` double NOT NULL,
  `TotalRoomCharges` double NOT NULL,
  `ServiceCharges` double NOT NULL,
  `TotalCharges` double NOT NULL,
  `PaymentMode` text NOT NULL,
  `ChargesPaid` double NOT NULL,
  `DueCharges` double NOT NULL,
  PRIMARY KEY (`BillNo`,`DischargeID`),
  KEY `DischargeID` (`DischargeID`),
  CONSTRAINT `Bill_Room_ibfk_1` FOREIGN KEY (`DischargeID`) REFERENCES `Patient_Discharge_Room` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Bill_Room`
--

LOCK TABLES `Bill_Room` WRITE;
/*!40000 ALTER TABLE `Bill_Room` DISABLE KEYS */;
/*!40000 ALTER TABLE `Bill_Room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Bill_Ward`
--

DROP TABLE IF EXISTS `Bill_Ward`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Bill_Ward` (
  `BillNo` int(25) NOT NULL AUTO_INCREMENT,
  `DischargeID` int(25) NOT NULL,
  `BillingDate` text NOT NULL,
  `NoOfDays` int(25) NOT NULL,
  `BedCharges` double NOT NULL,
  `TotalBedCharges` double NOT NULL,
  `ServiceCharges` double NOT NULL,
  `TotalCharges` double NOT NULL,
  `PaymentMode` text NOT NULL,
  `ChargesPaid` double NOT NULL,
  `DueCharges` double NOT NULL,
  PRIMARY KEY (`BillNo`,`DischargeID`),
  KEY `DischargeID` (`DischargeID`),
  CONSTRAINT `Bill_Ward_ibfk_1` FOREIGN KEY (`DischargeID`) REFERENCES `Patient_Discharge_Ward` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Bill_Ward`
--

LOCK TABLES `Bill_Ward` WRITE;
/*!40000 ALTER TABLE `Bill_Ward` DISABLE KEYS */;
/*!40000 ALTER TABLE `Bill_Ward` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Doctor`
--

DROP TABLE IF EXISTS `Doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Doctor` (
  `DoctorID` varchar(50) NOT NULL,
  `DoctorName` text NOT NULL,
  `FathersName` text NOT NULL,
  `Address` text NOT NULL,
  `ContactNo` text NOT NULL,
  `Email` text NOT NULL,
  `Qualifications` text NOT NULL,
  `Specialization` text NOT NULL,
  `Gender` text NOT NULL,
  `Bloodgroup` text NOT NULL,
  `DateofJoining` text NOT NULL,
  PRIMARY KEY (`DoctorID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Doctor`
--

LOCK TABLES `Doctor` WRITE;
/*!40000 ALTER TABLE `Doctor` DISABLE KEYS */;
INSERT INTO `Doctor` VALUES ('D-1','Rahul','Harish','Dhamtari','992623865','rahul.harish@gmail.com','MBBS','Surgery','Male','O+','12/12/2012');
/*!40000 ALTER TABLE `Doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Nurse_WardBoy`
--

DROP TABLE IF EXISTS `Nurse_WardBoy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Nurse_WardBoy` (
  `ID` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Category` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `ContactNo` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Qualification` varchar(50) NOT NULL,
  `BloodGroup` varchar(50) NOT NULL,
  `DateofJoining` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Nurse_WardBoy`
--

LOCK TABLES `Nurse_WardBoy` WRITE;
/*!40000 ALTER TABLE `Nurse_WardBoy` DISABLE KEYS */;
/*!40000 ALTER TABLE `Nurse_WardBoy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Patient`
--

DROP TABLE IF EXISTS `Patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Patient` (
  `PatientID` varchar(50) NOT NULL,
  `PatientName` text NOT NULL,
  `FathersName` text NOT NULL,
  `Address` text NOT NULL,
  `ContactNo` text NOT NULL,
  `Email` text NOT NULL,
  `Age` int(10) NOT NULL,
  `Gender` text NOT NULL,
  `BloodGroup` text NOT NULL,
  `Remark` text NOT NULL,
  PRIMARY KEY (`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Patient`
--

LOCK TABLES `Patient` WRITE;
/*!40000 ALTER TABLE `Patient` DISABLE KEYS */;
INSERT INTO `Patient` VALUES ('P-1','Rohan','Rohit','Bilaspur','9111546228','rohan.rohit@gmail.com',21,'Male','O+','....');
/*!40000 ALTER TABLE `Patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Patient_Admit_Room`
--

DROP TABLE IF EXISTS `Patient_Admit_Room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Patient_Admit_Room` (
  `AdmitID` int(20) NOT NULL AUTO_INCREMENT,
  `PatientID` varchar(25) NOT NULL,
  `Disease` text NOT NULL,
  `AdmitDate` text NOT NULL,
  `RoomNo` varchar(25) NOT NULL,
  `DoctorID` varchar(25) NOT NULL,
  `Remarks` text NOT NULL,
  PRIMARY KEY (`AdmitID`,`PatientID`,`RoomNo`,`DoctorID`),
  KEY `Patient_Admin_Room_fk1` (`PatientID`),
  KEY `Patient_Admin_Room_fk2` (`RoomNo`),
  KEY `Patient_Admin_Room_fk3` (`DoctorID`),
  CONSTRAINT `Patient_Admin_Room_fk1` FOREIGN KEY (`PatientID`) REFERENCES `Patient` (`PatientID`),
  CONSTRAINT `Patient_Admin_Room_fk2` FOREIGN KEY (`RoomNo`) REFERENCES `Room` (`RoomNo`),
  CONSTRAINT `Patient_Admin_Room_fk3` FOREIGN KEY (`DoctorID`) REFERENCES `Doctor` (`DoctorID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Patient_Admit_Room`
--

LOCK TABLES `Patient_Admit_Room` WRITE;
/*!40000 ALTER TABLE `Patient_Admit_Room` DISABLE KEYS */;
/*!40000 ALTER TABLE `Patient_Admit_Room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Patient_Admit_Ward`
--

DROP TABLE IF EXISTS `Patient_Admit_Ward`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Patient_Admit_Ward` (
  `AdmitID` int(20) NOT NULL AUTO_INCREMENT,
  `PatientID` varchar(25) NOT NULL,
  `Disease` text NOT NULL,
  `AdmitDate` text NOT NULL,
  `WardName` varchar(25) NOT NULL,
  `DoctorID` varchar(25) NOT NULL,
  `Remarks` text NOT NULL,
  PRIMARY KEY (`AdmitID`,`PatientID`,`WardName`,`DoctorID`),
  KEY `Patient_Admin_Ward_fk1` (`PatientID`),
  KEY `Patient_Admin_Ward_fk2` (`WardName`),
  KEY `Patient_Admin_Ward_fk3` (`DoctorID`),
  CONSTRAINT `Patient_Admin_Ward_fk1` FOREIGN KEY (`PatientID`) REFERENCES `Patient` (`PatientID`),
  CONSTRAINT `Patient_Admin_Ward_fk2` FOREIGN KEY (`WardName`) REFERENCES `Ward` (`WardName`),
  CONSTRAINT `Patient_Admin_Ward_fk3` FOREIGN KEY (`DoctorID`) REFERENCES `Doctor` (`DoctorID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Patient_Admit_Ward`
--

LOCK TABLES `Patient_Admit_Ward` WRITE;
/*!40000 ALTER TABLE `Patient_Admit_Ward` DISABLE KEYS */;
/*!40000 ALTER TABLE `Patient_Admit_Ward` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Patient_Discharge_Room`
--

DROP TABLE IF EXISTS `Patient_Discharge_Room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Patient_Discharge_Room` (
  `ID` int(20) NOT NULL AUTO_INCREMENT,
  `AdmitID` int(20) NOT NULL,
  `DischargeDate` text NOT NULL,
  `Remarks` text NOT NULL,
  PRIMARY KEY (`ID`,`AdmitID`),
  KEY `AdmitID` (`AdmitID`),
  CONSTRAINT `Patient_Discharge_Room_ibfk_1` FOREIGN KEY (`AdmitID`) REFERENCES `Patient_Admit_Room` (`AdmitID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Patient_Discharge_Room`
--

LOCK TABLES `Patient_Discharge_Room` WRITE;
/*!40000 ALTER TABLE `Patient_Discharge_Room` DISABLE KEYS */;
/*!40000 ALTER TABLE `Patient_Discharge_Room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Patient_Discharge_Ward`
--

DROP TABLE IF EXISTS `Patient_Discharge_Ward`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Patient_Discharge_Ward` (
  `ID` int(20) NOT NULL AUTO_INCREMENT,
  `AdmitID` int(20) NOT NULL,
  `DischargeDate` text NOT NULL,
  `Remarks` text NOT NULL,
  PRIMARY KEY (`ID`,`AdmitID`),
  KEY `AdmitID` (`AdmitID`),
  CONSTRAINT `Patient_Discharge_Ward_ibfk_1` FOREIGN KEY (`AdmitID`) REFERENCES `Patient_Admit_Ward` (`AdmitID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Patient_Discharge_Ward`
--

LOCK TABLES `Patient_Discharge_Ward` WRITE;
/*!40000 ALTER TABLE `Patient_Discharge_Ward` DISABLE KEYS */;
/*!40000 ALTER TABLE `Patient_Discharge_Ward` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Room`
--

DROP TABLE IF EXISTS `Room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Room` (
  `RoomNo` varchar(20) CHARACTER SET utf8 NOT NULL,
  `RoomType` varchar(20) CHARACTER SET utf8 NOT NULL,
  `RoomCharges` int(20) NOT NULL,
  `RoomStatus` varchar(20) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`RoomNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Room`
--

LOCK TABLES `Room` WRITE;
/*!40000 ALTER TABLE `Room` DISABLE KEYS */;
/*!40000 ALTER TABLE `Room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Ward`
--

DROP TABLE IF EXISTS `Ward`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Ward` (
  `WardName` varchar(20) CHARACTER SET utf8 NOT NULL,
  `WardType` varchar(20) CHARACTER SET utf8 NOT NULL,
  `NoOfBeds` int(20) NOT NULL,
  `Charges` int(20) NOT NULL,
  PRIMARY KEY (`WardName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Ward`
--

LOCK TABLES `Ward` WRITE;
/*!40000 ALTER TABLE `Ward` DISABLE KEYS */;
/*!40000 ALTER TABLE `Ward` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `user` varchar(25) NOT NULL,
  `user_password` varchar(25) NOT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('',''),('dev','netam'),('devendra','netam'),('devendra007','netam');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-29  8:49:36
