-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 27-02-2023 a las 15:48:00
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
-- Base de datos: `basketball_coach`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Equipo`
--

CREATE TABLE `Equipo` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(60) NOT NULL,
  `idEntrenador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Equipo`
--

INSERT INTO `Equipo` (`id`, `Nombre`, `idEntrenador`) VALUES
(1, 'CuernoTrayomones', 1);

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
-- Estructura de tabla para la tabla `Jugador`
--

CREATE TABLE `Jugador` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(60) NOT NULL,
  `Apellido` varchar(60) NOT NULL,
  `Salud` enum('Lesionado','Sano') NOT NULL,
  `Rol` varchar(60) NOT NULL,
  `ManoDominante` enum('Diestro','zurdo','ambidiestro') NOT NULL,
  `Foto` longtext NOT NULL,
  `Posicion` enum('Base','Escolta','Alero','Ala-pivot','Pivot') NOT NULL,
  `Dorsal` int(11) NOT NULL,
  `Altura` int(11) NOT NULL,
  `idEquipo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Jugador`
--

INSERT INTO `Jugador` (`id`, `Nombre`, `Apellido`, `Salud`, `Rol`, `ManoDominante`, `Foto`, `Posicion`, `Dorsal`, `Altura`, `idEquipo`) VALUES
(1, 'Stephen', 'Curry', 'Sano', 'Jugador Franquicia', 'Diestro', 'a', 'Base', 30, 193, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Partido`
--

CREATE TABLE `Partido` (
  `id` int(11) NOT NULL,
  `Fecha` date NOT NULL,
  `NombreEquipo1` varchar(60) NOT NULL,
  `idEquipo` int(11) NOT NULL,
  `NombreEquipo2` varchar(60) NOT NULL,
  `PuntuacionEquipo1` int(11) NOT NULL,
  `PuntuacionEquipo2` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Usuario`
--

CREATE TABLE `Usuario` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(60) NOT NULL,
  `Contraseña` varchar(60) NOT NULL,
  `Email` varchar(60) NOT NULL,
  `FechaNacimiento` date NOT NULL,
  `Foto` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Usuario`
--

INSERT INTO `Usuario` (`id`, `Nombre`, `Contraseña`, `Email`, `FechaNacimiento`, `Foto`) VALUES
(1, 'Cuernotrayomon', '1', 'a@a.com', '2015-02-05', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Equipo`
--
ALTER TABLE `Equipo`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `Nombre` (`Nombre`),
  ADD KEY `equipoEntrenador` (`idEntrenador`);

--
-- Indices de la tabla `foto`
--
ALTER TABLE `foto`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `Jugador`
--
ALTER TABLE `Jugador`
  ADD PRIMARY KEY (`id`),
  ADD KEY `jugadorEquipo` (`idEquipo`);

--
-- Indices de la tabla `Partido`
--
ALTER TABLE `Partido`
  ADD PRIMARY KEY (`id`),
  ADD KEY `partidoEquipo` (`idEquipo`);

--
-- Indices de la tabla `Usuario`
--
ALTER TABLE `Usuario`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `Email` (`Email`),
  ADD UNIQUE KEY `Nombre` (`Nombre`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Equipo`
--
ALTER TABLE `Equipo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `foto`
--
ALTER TABLE `foto`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `Jugador`
--
ALTER TABLE `Jugador`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `Partido`
--
ALTER TABLE `Partido`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Usuario`
--
ALTER TABLE `Usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Equipo`
--
ALTER TABLE `Equipo`
  ADD CONSTRAINT `equipoEntrenador` FOREIGN KEY (`idEntrenador`) REFERENCES `Usuario` (`id`);

--
-- Filtros para la tabla `Jugador`
--
ALTER TABLE `Jugador`
  ADD CONSTRAINT `jugadorEquipo` FOREIGN KEY (`idEquipo`) REFERENCES `Equipo` (`id`);

--
-- Filtros para la tabla `Partido`
--
ALTER TABLE `Partido`
  ADD CONSTRAINT `partidoEquipo` FOREIGN KEY (`idEquipo`) REFERENCES `Equipo` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
