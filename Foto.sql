-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 01-12-2022 a las 16:03:10
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `test`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Foto`
--

CREATE TABLE `Foto` (
  `Id` int(11) NOT NULL,
  `Nombre` varchar(170) NOT NULL,
  `Especializacion` varchar(60) NOT NULL,
  `Informacion` longtext NOT NULL,
  `Foto` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Foto`
--

INSERT INTO `Foto` (`Id`, `Nombre`, `Especializacion`, `Informacion`, `Foto`) VALUES
(1, 'Alejandro Dorado Casado', 'Front End', 'Gran pasion por la programacion \n y por el arte digital', 'http://10.0.2.2/php/foto_alex.jpg'),
(2, 'Kilian Herrada Fernandez', 'Back End', 'Interés por el código abierto y por \nmejorar como programador.', 'http://10.0.2.2/php/foto_kilian.jpg'),
(3, 'Tigé David Ral Ramirez', 'Informe técnico', 'Me gusta expresar mi creatividad \n a través del desarrollo de software.\nY me satisface resolver problemas\n lógicos.', 'http://10.0.2.2/php/foto_tige.jpg');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Foto`
--
ALTER TABLE `Foto`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Foto`
--
ALTER TABLE `Foto`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
