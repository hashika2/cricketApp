-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 04, 2019 at 07:27 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cricketapp`
--

-- --------------------------------------------------------

--
-- Table structure for table `batting`
--

CREATE TABLE `batting` (
  `matchid` int(11) NOT NULL,
  `inning` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Out` varchar(20) NOT NULL,
  `Runs` int(11) NOT NULL,
  `4s` int(11) NOT NULL,
  `6s` int(11) NOT NULL,
  `Balls` int(11) NOT NULL,
  `Strike` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `batting`
--

INSERT INTO `batting` (`matchid`, `inning`, `Name`, `Out`, `Runs`, `4s`, `6s`, `Balls`, `Strike`) VALUES
(1, 1, 'K Sangakkara', 'c.Dhoni', 65, 4, 1, 50, 120.65),
(1, 2, 'V Kholi', 'c.Sangakkara', 12, 0, 0, 20, 60),
(1, 1, 'S Jayasooriya', 'b Kumble', 56, 4, 1, 45, 124.44),
(1, 1, 'M Jayawardana', 'lbw Kumble', 34, 2, 0, 40, 85),
(1, 1, 'C Silva', 'Bawled Kumar', 25, 1, 0, 34, 73.52),
(1, 2, 'R Sharma', 'B Vaas', 45, 4, 1, 46, 97.82),
(1, 2, 'S Dhawan', 'c. Sangakkara b Mali', 45, 5, 1, 35, 128.57),
(2, 1, 'Babar', 'c Wade Bretlee', 104, 10, 1, 110, 94.54),
(2, 1, 'S Malik', 'b Bretlee', 25, 2, 0, 36, 69.44);

-- --------------------------------------------------------

--
-- Table structure for table `bawler`
--

CREATE TABLE `bawler` (
  `matchid` int(11) NOT NULL,
  `inning` int(11) NOT NULL,
  `Playerid` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Wickets` int(11) NOT NULL,
  `Overs` int(11) NOT NULL,
  `Runs` int(11) NOT NULL,
  `Maidens` int(11) NOT NULL,
  `Economy` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bawler`
--

INSERT INTO `bawler` (`matchid`, `inning`, `Playerid`, `Name`, `Wickets`, `Overs`, `Runs`, `Maidens`, `Economy`) VALUES
(1, 2, 2, 'C Vaas', 2, 10, 50, 1, 5),
(1, 2, 8, 'D Fernando', 1, 8, 45, 0, 5.63),
(1, 2, 10, 'L Malinga', 4, 10, 45, 1, 4.5),
(1, 1, 21, 'Z Khan', 3, 10, 65, 0, 6.5),
(1, 1, 22, 'Shami', 1, 9, 55, 1, 6.11),
(2, 1, 25, 'M Stark', 3, 10, 50, 1, 5),
(2, 1, 26, 'P Cummins', 2, 9, 55, 1, 6.11);

-- --------------------------------------------------------

--
-- Table structure for table `matches`
--

CREATE TABLE `matches` (
  `Mid` int(11) NOT NULL,
  `Match` varchar(20) NOT NULL,
  `inningOne` varchar(20) NOT NULL,
  `inningTwo` varchar(20) NOT NULL,
  `Most_runs` varchar(20) NOT NULL,
  `Most_wickets` varchar(20) NOT NULL,
  `Winning` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `matches`
--

INSERT INTO `matches` (`Mid`, `Match`, `inningOne`, `inningTwo`, `Most_runs`, `Most_wickets`, `Winning`) VALUES
(1, 'Sri Lanka vs India', 'Sri Lanka', 'India', 'K Sangakkara 78(65)', 'C Vass 2-45', 'SL won by 32 runs'),
(2, 'Pakistan vs Australi', 'Australia', 'Pakistan', 'Babar 102(104)', 'Wahab 50/3', 'PK won by 3 wickets');

-- --------------------------------------------------------

--
-- Table structure for table `players`
--

CREATE TABLE `players` (
  `Playerid` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `players`
--

INSERT INTO `players` (`Playerid`, `Name`) VALUES
(1, 'K Sangakkara'),
(2, 'C Vaas'),
(3, 'S Jayasooriya'),
(4, 'M Jayawardana'),
(5, 'C Silva'),
(6, 'U Tharanga'),
(7, 'C Vaas'),
(8, 'D Fernando'),
(9, 'M Muralidaran'),
(10, 'L Malinga'),
(11, 'L Perera'),
(12, 'R Sharma'),
(13, 'S Dhawan'),
(14, 'V Kholi'),
(15, 'Ms Dhoni'),
(16, 'K Yadev'),
(17, 'S Raina');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bawler`
--
ALTER TABLE `bawler`
  ADD PRIMARY KEY (`Playerid`);

--
-- Indexes for table `matches`
--
ALTER TABLE `matches`
  ADD PRIMARY KEY (`Mid`);

--
-- Indexes for table `players`
--
ALTER TABLE `players`
  ADD PRIMARY KEY (`Playerid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `matches`
--
ALTER TABLE `matches`
  MODIFY `Mid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `players`
--
ALTER TABLE `players`
  MODIFY `Playerid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
