-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2019 at 10:50 AM
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
-- Database: `quanlythuvien`
--
CREATE DATABASE IF NOT EXISTS `quanlythuvien` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `quanlythuvien`;

-- --------------------------------------------------------

--
-- Table structure for table `docgia`
--

CREATE TABLE IF NOT EXISTS `docgia` (
  `sothe` varchar(10) NOT NULL,
  `ten` varchar(500) DEFAULT NULL,
  `khoa` varchar(500) DEFAULT NULL,
  `khoahoc` varchar(500) DEFAULT NULL,
  `thoihanthe` datetime DEFAULT NULL,
  PRIMARY KEY (`sothe`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `docgia`
--

INSERT INTO `docgia` (`sothe`, `ten`, `khoa`, `khoahoc`, `thoihanthe`) VALUES
('', 'Anh', 'cntt', '2017-2022', '2019-11-01 00:00:00'),
('2', 'uyen', 'cntt', '2017-2022', '2020-12-01 00:00:00'),
('3', 'manh', 'ky thuat dien tu', '2017-2022', '2019-11-03 00:00:00'),
('4', 'mai', 'an toan thong tin', '2017-2023', '2019-11-01 00:00:00'),
('5', 'anh', 'cntt', '2017-2022', '2019-11-01 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `phieumuon`
--

CREATE TABLE IF NOT EXISTS `phieumuon` (
  `masach` varchar(10) NOT NULL,
  `sothe` varchar(500) NOT NULL,
  `ngaymuon` date DEFAULT NULL,
  `ngaytra` date DEFAULT NULL,
  `note` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`masach`,`sothe`),
  KEY `sothe` (`sothe`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `phieumuon`
--

INSERT INTO `phieumuon` (`masach`, `sothe`, `ngaymuon`, `ngaytra`, `note`) VALUES
('B0001', '', '2017-12-25', '2018-01-01', 'tot'),
('B0002', '', '2018-01-02', '2018-01-12', 'tot'),
('B0003', '', '2019-02-19', '2019-03-01', 'tot'),
('B0004', '', '2019-02-19', '2019-03-01', 'tot');

-- --------------------------------------------------------

--
-- Table structure for table `sach`
--

CREATE TABLE IF NOT EXISTS `sach` (
  `masach` varchar(10) NOT NULL,
  `ten` varchar(500) DEFAULT NULL,
  `tacgia` varchar(500) DEFAULT NULL,
  `nxb` varchar(500) DEFAULT NULL,
  `soluong` int(11) DEFAULT NULL,
  PRIMARY KEY (`masach`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sach`
--

INSERT INTO `sach` (`masach`, `ten`, `tacgia`, `nxb`, `soluong`) VALUES
('B0001', 'Dai so', 'Nguyen Binh', 'Kim Dong', 22),
('B0002', 'Toan', 'Bui Thac', 'Quoc Gia', 13),
('B0003', 'Van hoc', 'Nguyen Du', 'Van Hoa', 33),
('B0004', 'Dia ly', 'Tran Binh', 'Kim Dong', 12),
('B0005', 'Giai thich', 'Le Dinh', 'Van Hoa', 14),
('B0006', 'Hoa hoc', 'Nguyen Van Anh', 'Quoc Gia', 51),
('B0007', 'Lich su', 'Tran Van Lan', 'Kim Dong', 15);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `phieumuon`
--
ALTER TABLE `phieumuon`
  ADD CONSTRAINT `phieumuon_ibfk_1` FOREIGN KEY (`masach`) REFERENCES `sach` (`masach`),
  ADD CONSTRAINT `phieumuon_ibfk_2` FOREIGN KEY (`sothe`) REFERENCES `docgia` (`sothe`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
