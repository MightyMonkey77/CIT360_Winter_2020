-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 14, 2020 at 05:52 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `charactercreation`
--

-- --------------------------------------------------------

--
-- Table structure for table `characters`
--

CREATE TABLE `characters` (
  `characterId` int(10) UNSIGNED NOT NULL,
  `characterFirstName` varchar(25) NOT NULL,
  `characterLastName` varchar(30) NOT NULL,
  `characterRace` varchar(15) NOT NULL,
  `characterClass` varchar(15) NOT NULL,
  `characterStr` int(10) NOT NULL,
  `characterDex` int(10) NOT NULL,
  `characterWis` int(10) NOT NULL,
  `characterInt` int(10) NOT NULL,
  `characterCon` int(10) NOT NULL,
  `characterCha` int(10) NOT NULL,
  `characterAC` int(10) NOT NULL,
  `characterInitiative` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `characters`
--

INSERT INTO `characters` (`characterId`, `characterFirstName`, `characterLastName`, `characterRace`, `characterClass`, `characterStr`, `characterDex`, `characterWis`, `characterInt`, `characterCon`, `characterCha`, `characterAC`, `characterInitiative`) VALUES
(6, 'Rog', 'Tully', 'Half-Orc', 'Barbarian', 18, 15, 11, 16, 17, 10, 21, 12);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `characters`
--
ALTER TABLE `characters`
  ADD PRIMARY KEY (`characterId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `characters`
--
ALTER TABLE `characters`
  MODIFY `characterId` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
