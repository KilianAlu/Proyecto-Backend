-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-12-2022 a las 23:01:42
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 7.4.18

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
-- Estructura de tabla para la tabla `foto`
--

CREATE TABLE `foto` (
  `Id` int(11) NOT NULL,
  `Nombre` varchar(170) NOT NULL,
  `Especializacion` varchar(60) NOT NULL,
  `Informacion` longtext NOT NULL,
  `Foto` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `foto`
--

INSERT INTO `foto` (`Id`, `Nombre`, `Especializacion`, `Informacion`, `Foto`) VALUES
(1, 'Alejandro Dorado Casado', 'Front End', 'Gran pasion por la programacion \n y por el arte digital', 'http://10.0.2.2/php/foto_alex.jpg'),
(2, 'Kilian Herrada Fernandez', 'Back End', 'Interés por el código abierto y por \nmejorar como programador.', 'http://10.0.2.2/php/foto_kilian.jpg'),
(3, 'Tigé David Ral Ramirez', 'Informe técnico', 'Me gusta expresar mi creatividad \n a través del desarrollo de software.\nY me satisface resolver problemas\n lógicos.', 'http://10.0.2.2/php/foto_tige.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paginainicial`
--

CREATE TABLE `paginainicial` (
  `id` int(11) NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `email` varchar(40) NOT NULL,
  `Integrantes` varchar(160) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `paginainicial`
--

INSERT INTO `paginainicial` (`id`, `telefono`, `email`, `Integrantes`) VALUES
(1, 9322312345, 'Alu2019068@Stucom.com', 'Kilian, Alejandro y tigé');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `contraseña` varchar(40) NOT NULL,
  `correo` varchar(90) NOT NULL,
  `fechaNacimiento` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `nombre`, `contraseña`, `correo`, `fechaNacimiento`) VALUES
(1, 'b', 'b', 'b', 'b'),
(2, 'a', 'a', 'a@a.com', 'a');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `foto`
--
ALTER TABLE `foto`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `paginainicial`
--
ALTER TABLE `paginainicial`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `foto`
--
ALTER TABLE `foto`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `paginainicial`
--
ALTER TABLE `paginainicial`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
