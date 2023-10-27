-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-10-2023 a las 01:01:27
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vacuna23`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `centrovacunacion`
--

CREATE TABLE `centrovacunacion` (
  `IDcentro` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `provincia` varchar(50) NOT NULL,
  `ciudad` varchar(50) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `centrovacunacion`
--

INSERT INTO `centrovacunacion` (`IDcentro`, `nombre`, `direccion`, `provincia`, `ciudad`, `estado`) VALUES
(2, 'Marcelo', 'Los Fresnos', 'Catamarca', 'Recreo', 1),
(3, 'Pablo', 'Piedra Blanca', 'Buenos Aires', 'Tigre', 1),
(5, 'Juanjo', 'Los Almendros', 'Catamarca', 'Valle Viejo', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citavacunacion`
--

CREATE TABLE `citavacunacion` (
  `codCita` int(11) DEFAULT NULL,
  `persona` int(11) DEFAULT NULL,
  `codRefuerzo` int(11) DEFAULT NULL,
  `fechaHoraCita` date DEFAULT NULL,
  `centroVacunacion` int(11) DEFAULT NULL,
  `fechaHoraColoca` datetime DEFAULT NULL,
  `dosis` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--

CREATE TABLE `ciudadano` (
  `DNI` int(11) NOT NULL,
  `nombreCompleto` varchar(120) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `patologia` varchar(255) DEFAULT NULL,
  `ambitoTrabajo` varchar(255) DEFAULT NULL,
  `ciudad` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--

CREATE TABLE `laboratorio` (
  `CUIT` int(11) DEFAULT NULL,
  `nomLaboratorio` varchar(255) DEFAULT NULL,
  `pais` varchar(30) DEFAULT NULL,
  `domComercial` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

CREATE TABLE `vacuna` (
  `nroSerieDosis` int(11) DEFAULT NULL,
  `marca` varchar(255) DEFAULT NULL,
  `medida` double DEFAULT NULL,
  `fechaCaduca` date DEFAULT NULL,
  `colocada` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `centrovacunacion`
--
ALTER TABLE `centrovacunacion`
  ADD PRIMARY KEY (`IDcentro`);

--
-- Indices de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD UNIQUE KEY `codCita` (`codCita`),
  ADD UNIQUE KEY `persona` (`persona`),
  ADD UNIQUE KEY `dosis` (`dosis`),
  ADD KEY `centroVacunacion` (`centroVacunacion`);

--
-- Indices de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  ADD UNIQUE KEY `DNI` (`DNI`),
  ADD UNIQUE KEY `DNI_2` (`DNI`);

--
-- Indices de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  ADD UNIQUE KEY `CUIT` (`CUIT`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD UNIQUE KEY `nroSerieDosis` (`nroSerieDosis`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `centrovacunacion`
--
ALTER TABLE `centrovacunacion`
  MODIFY `IDcentro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD CONSTRAINT `citavacunacion_ibfk_1` FOREIGN KEY (`codCita`) REFERENCES `ciudadano` (`DNI`),
  ADD CONSTRAINT `citavacunacion_ibfk_2` FOREIGN KEY (`centroVacunacion`) REFERENCES `centrovacunacion` (`IDcentro`);

--
-- Filtros para la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD CONSTRAINT `vacuna_ibfk_1` FOREIGN KEY (`nroSerieDosis`) REFERENCES `laboratorio` (`CUIT`),
  ADD CONSTRAINT `vacuna_ibfk_2` FOREIGN KEY (`nroSerieDosis`) REFERENCES `citavacunacion` (`codCita`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
