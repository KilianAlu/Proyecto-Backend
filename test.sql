-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 28-11-2022 a las 15:43:17
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
(1, 'Alejandro Dorado Casado', 'Front End', 'Gran pasion por la programacion \n y por el arte digital', ''),
(2, 'Kilian Herrada Fernandez', 'Back End', 'Interés por el código abierto y por \nmejorar como programador.', ''),
(3, 'Tigé David Ral Ramirez', 'Informe técnico', 'Me gusta expresar mi creatividad \n a través del desarrollo de software.\nY me satisface resolver problemas\n lógicos.', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paginaInicial`
--

CREATE TABLE `paginaInicial` (
  `id` int(11) NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `email` varchar(40) NOT NULL,
  `Integrantes` varchar(160) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `paginaInicial`
--

INSERT INTO `paginaInicial` (`id`, `telefono`, `email`, `Integrantes`) VALUES
(1, 9322312345, 'Alu2019068@Stucom.com', 'Kilian, Alejandro y tigé');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Foto`
--
ALTER TABLE `Foto`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `paginaInicial`
--
ALTER TABLE `paginaInicial`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Foto`
--
ALTER TABLE `Foto`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `paginaInicial`
--
ALTER TABLE `paginaInicial`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
