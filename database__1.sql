-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2019 at 07:23 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qlythuvien`
--

-- --------------------------------------------------------

--
-- Table structure for table `docgia`
--

DROP TABLE IF EXISTS `docgia`;
CREATE TABLE `docgia` (
  `sothe` int(11) NOT NULL,
  `ten` varchar(40) NOT NULL,
  `khoa` varchar(40) NOT NULL,
  `khoakhoc` tinytext,
  `thoihanthe` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `docgia`
--

INSERT INTO `docgia` (`sothe`, `ten`, `khoa`, `khoakhoc`, `thoihanthe`) VALUES
(1, 'uyen', 'cntt', '2017-2022', 10),
(3, 'manh', 'ky thuat dien tu', '2017-2022', 10),
(4, 'mai', 'an toan thong tin', '2017-2023', 10),
(5, 'anh', 'cntt', '2017-2022', 10);

-- --------------------------------------------------------

--
-- Table structure for table `phieumuon`
--

DROP TABLE IF EXISTS `phieumuon`;
CREATE TABLE `phieumuon` (
  `masach` int(11) NOT NULL,
  `sothe` int(11) NOT NULL,
  `ngaymuon` date DEFAULT NULL,
  `ngaytra` date DEFAULT NULL,
  `ghichu` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `phieumuon`
--

INSERT INTO `phieumuon` (`masach`, `sothe`, `ngaymuon`, `ngaytra`, `ghichu`) VALUES
(1, 0, '2017-12-25', '2018-01-01', 'tot'),
(2, 0, '2019-02-19', '2019-03-01', 'tot'),
(3, 0, '2018-01-02', '2018-01-12', 'tot'),
(4, 0, '2019-02-19', '2019-03-01', 'tot'),
(5, 0, '2019-02-19', '2019-03-01', 'tot');

-- --------------------------------------------------------

--
-- Table structure for table `sach`
--

DROP TABLE IF EXISTS `sach`;
CREATE TABLE `sach` (
  `masach` int(11) NOT NULL,
  `ten` varchar(40) NOT NULL,
  `tacgia` varchar(40) DEFAULT NULL,
  `nxb` int(11) DEFAULT NULL,
  `soluong` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sach`
--

INSERT INTO `sach` (`masach`, `ten`, `tacgia`, `nxb`, `soluong`) VALUES
(1, 'KHOA HOC', 'NAM', 2001, 2),
(3, 'anh', 'tacgia3', 1999, 3),
(4, 'ly', 'tacgia4', 2002, 4),
(5, 'hoa', 'tacgia5', 2001, 1),
(6, 'toan', 'tacgia1', 2001, 2),
(7, 'van', 'tacgia2', 2000, 1),
(8, 'anh', 'tacgia3', 1999, 3),
(9, 'ly', 'tacgia4', 2002, 4),
(10, 'hoa', 'tacgia5', 2001, 1),
(11, 'toan', 'tacgia1', 2001, 2),
(12, 'van', 'tacgia2', 2000, 1),
(13, 'anh', 'tacgia3', 1999, 3),
(14, 'ly', 'tacgia4', 2002, 4),
(15, 'hoa', 'tacgia5', 2001, 1),
(16, 'toan', 'tacgia1', 2001, 2),
(17, 'van', 'tacgia2', 2000, 1),
(18, 'anh', 'tacgia3', 1999, 3),
(19, 'ly', 'tacgia4', 2002, 4),
(20, 'hoa', 'tacgia5', 2001, 1),
(39, 'nam', 'aaaa', 2019, 100),
(40, 'nam', 'aaaa', 2019, 100),
(41, 'nam', 'aaaa', 2019, 100),
(42, 'nam', 'aaaa', 2019, 100),
(43, 'nam', 'aaaa', 2019, 100),
(44, 'nam', 'aaaa', 2019, 100),
(45, 'nam', 'aaaa', 2019, 100),
(46, 'nam', 'aaaa', 2019, 100),
(47, 'nam', 'aaaa', 2019, 100),
(48, 'nam', 'aaaa', 2019, 100),
(49, 'nam', 'aaaa', 2019, 100),
(50, 'nam', 'aaaa', 2019, 100),
(51, 'nam', 'aaaa', 2019, 100),
(52, 'nam', 'aaaa', 2019, 100),
(53, 'nam', 'aaaa', 2019, 100);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `docgia`
--
ALTER TABLE `docgia`
  ADD PRIMARY KEY (`sothe`);

--
-- Indexes for table `phieumuon`
--
ALTER TABLE `phieumuon`
  ADD PRIMARY KEY (`masach`,`sothe`);

--
-- Indexes for table `sach`
--
ALTER TABLE `sach`
  ADD PRIMARY KEY (`masach`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `docgia`
--
ALTER TABLE `docgia`
  MODIFY `sothe` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `phieumuon`
--
ALTER TABLE `phieumuon`
  MODIFY `masach` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `sach`
--
ALTER TABLE `sach`
  MODIFY `masach` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
