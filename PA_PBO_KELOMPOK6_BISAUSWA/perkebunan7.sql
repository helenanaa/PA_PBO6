-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 03 Nov 2023 pada 13.30
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perkebunan7`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `ID_USER` char(5) NOT NULL,
  `Nama_Admin` varchar(25) NOT NULL,
  `Password` varchar(15) NOT NULL,
  `ADMIN_ID_USER` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`ID_USER`, `Nama_Admin`, `Password`, `ADMIN_ID_USER`) VALUES
('A0001', 'Uswatun', 'admin', 'A0001');

-- --------------------------------------------------------

--
-- Struktur dari tabel `dataproduk`
--

CREATE TABLE `dataproduk` (
  `ID_Produk` int(11) NOT NULL,
  `Nama_Produk` varchar(25) NOT NULL,
  `Jenis_Produk` varchar(25) NOT NULL,
  `Tanggal_Panen` date NOT NULL,
  `Stok_Kg` int(11) NOT NULL,
  `ADMIN_ID_USER` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `dataproduk`
--

INSERT INTO `dataproduk` (`ID_Produk`, `Nama_Produk`, `Jenis_Produk`, `Tanggal_Panen`, `Stok_Kg`, `ADMIN_ID_USER`) VALUES
(6, 'Semangka', 'Buah', '2023-11-02', 50, 'A0001'),
(7, 'Jamur', 'Sayur', '2023-11-01', 98, 'A0001'),
(8, 'Stroberry', 'Buah', '2023-11-02', 34, 'A0001'),
(9, 'Kangkung', 'Sayur', '2023-11-01', 52, 'A0001');

-- --------------------------------------------------------

--
-- Struktur dari tabel `owner`
--

CREATE TABLE `owner` (
  `ID_USER` char(5) NOT NULL,
  `Password` varchar(15) NOT NULL,
  `SIK_Kepemilikan` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `owner`
--

INSERT INTO `owner` (`ID_USER`, `Password`, `SIK_Kepemilikan`) VALUES
('O0001', 'owneraja', 'USWA070820025/VII');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `ID_USER` char(5) NOT NULL,
  `Password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`ID_USER`, `Password`) VALUES
('A0001', 'admin'),
('O0001', 'owneraja');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`ID_USER`),
  ADD KEY `ADMIN_ADMIN_FK` (`ADMIN_ID_USER`);

--
-- Indeks untuk tabel `dataproduk`
--
ALTER TABLE `dataproduk`
  ADD PRIMARY KEY (`ID_Produk`),
  ADD KEY `ADMIN_ID_USER` (`ADMIN_ID_USER`);

--
-- Indeks untuk tabel `owner`
--
ALTER TABLE `owner`
  ADD PRIMARY KEY (`ID_USER`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID_USER`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `dataproduk`
--
ALTER TABLE `dataproduk`
  MODIFY `ID_Produk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD CONSTRAINT `ADMIN_ADMIN_FK` FOREIGN KEY (`ADMIN_ID_USER`) REFERENCES `admin` (`ID_USER`) ON DELETE CASCADE ON UPDATE NO ACTION,
  ADD CONSTRAINT `ADMIN_USER_FK` FOREIGN KEY (`ID_USER`) REFERENCES `user` (`ID_USER`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ketidakleluasaan untuk tabel `dataproduk`
--
ALTER TABLE `dataproduk`
  ADD CONSTRAINT `dataproduk_ibfk_1` FOREIGN KEY (`ADMIN_ID_USER`) REFERENCES `admin` (`ID_USER`);

--
-- Ketidakleluasaan untuk tabel `owner`
--
ALTER TABLE `owner`
  ADD CONSTRAINT `OWNER_USER_FK` FOREIGN KEY (`ID_USER`) REFERENCES `user` (`ID_USER`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
