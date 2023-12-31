-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 02-11-2023 a las 17:41:09
-- Versión del servidor: 8.0.34
-- Versión de PHP: 8.1.10

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
  `IDcentro` int NOT NULL,
  `nombre` varchar(120) COLLATE utf8mb4_general_ci NOT NULL,
  `direccion` varchar(120) COLLATE utf8mb4_general_ci NOT NULL,
  `provincia` varchar(120) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `ciudad` varchar(120) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `estado` tinyint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `centrovacunacion`
--

INSERT INTO `centrovacunacion` (`IDcentro`, `nombre`, `direccion`, `provincia`, `ciudad`, `estado`) VALUES
(1, 'Cualquiera', 'nose 123', 'Catamarca', 'Valle Viejo', 1),
(2, 'otro', 'nose 234', 'Catamarca', 'Valle Viejo', 1),
(3, 'dssdf', 'dsfsdf', 'Catamarca', 'Santa María', 1),
(4, 'dssdf', 'dsfsdf', 'Catamarca', 'Santa María', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citavacunacion`
--

CREATE TABLE `citavacunacion` (
  `codCita` int DEFAULT NULL,
  `persona` int DEFAULT NULL,
  `codRefuerzo` int DEFAULT NULL,
  `fechaHoraCita` varchar(16) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `centroVacunacion` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `fechaHoraColoca` datetime DEFAULT NULL,
  `dosis` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `citavacunacion`
--

/*INSERT INTO `citavacunacion` (`codCita`, `persona`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`) VALUES
(NULL, 34434322, 1, '2023-9-24 17:52', '1', '2023-10-24 17:52:06', 2);*/

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--

CREATE TABLE `ciudadano` (
  `DNI` int NOT NULL,
  `nombreCompleto` varchar(120) COLLATE utf8mb4_general_ci NOT NULL,
  `email` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `celular` varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
  `patologia` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `ambitoTrabajo` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `provincia` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `localidad` varchar(60) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudadano`
--

INSERT INTO `ciudadano` (`DNI`, `nombreCompleto`, `email`, `celular`, `patologia`, `ambitoTrabajo`, `provincia`, `localidad`) VALUES
(22000999, 'sadsadas', 'dsda@gmail.com', '323213', 'Ninguna', 'Medico', 'Corrientes', 'Esquina'),
(23534535, 'fdsdfsd', 'fsdfs@gmail.com', '23231', 'Cancer', 'Cancer', 'Ciudad Autonoma de Buenos Aires', 'San Nicolas'),
(32321345, 'J Monroe', 'jm@gmail.com', '213231', 'Gripe seca', 'Arquitecto', 'Catamarca', 'Santa María'),
(34090879, 'Jasmin Pereyra', 'jp@gmail.com', '42324234', 'tos grave', 'Enfermera', 'Catamarca', 'Valle Viejo'),
(34234345, 'Cristina Jaime', 'CJ@gmail.com', '13243634', 'Gripe', 'Medico', 'Ciudad Autonoma de Buenos Aires', 'San Nicolas'),
(34258457, 'Viviana Caceres', 'VV@gmail.com', '1212121323', 'Tos grave', 'Arquitecto', 'Corrientes', 'Curuzú Cuatiá'),
(34434322, 'Juaqui Medina', 'jm@gamil.com', '2312312312', 'gripe', 'Cantate', 'Catamarca', 'San Fernando del Valle de Catamarca'),
(34565787, 'Juana de Arco', 'jn@gmail.com', '34244545', 'ningua', 'Contadora', 'Entre Ríos', 'Federal'),
(34567834, 'Gladis Barrios', 'GB@gmail.com', '2324234423', NULL, 'Doctora', 'Ciudad Autonoma de Buenos Aires', 'Puerto Maderos'),
(34756980, 'Juanito Carriso', 'JAC@gmail.com', '2346732423', NULL, 'Medico', 'Catamarca', 'Tinogasta'),
(34867998, 'Maria Paz', 'MP@GMAIL.COM', '2323233', NULL, 'Contadora', 'Ciudad Autonoma de Buenos Aires', 'San Nicolas'),
(34876570, 'Juan Carlos Git', 'CG@yahoo.com', '23422765', 'colera', 'Abogado', 'Buenos Aires', 'Berazategui'),
(34876900, 'Juana Marin', 'JM@hotmail.com', '23232332', 'Ninguna', 'Ninguna', 'Chaco', 'Comandante Fernandez'),
(34987687, 'dfsdfdsfsd', '3232@gmail.com', '33243232432', 'tos', 'medico', 'Santa Fe', 'General López'),
(35243435, 'Carlos Paz', 'CO@gmail.com', '2342342345', 'Asma', 'Medico', 'Ciudad Autonoma de Buenos Aires', 'Retiro'),
(45000000, 'efweeff', 'sdsd@hotmail.com', '321312312', 'niguna', 'medico', 'Chaco', 'Doce De Octubre'),
(45123908, 'Marta Dominguez', 'MD@hotmail.com', '34257575', 'Fiebre', 'Medica', 'Río Negro', 'San Antonio'),
(45687989, 'dgdggfdfs', 'sdf@gmail.com', '3423423432', 'Ninguna', 'Medico', 'Catamarca', 'Valle Viejo'),
(45786234, 'J Monroe', 'jm@gmail.com', '213231', 'ninguna', 'Doctora', 'Catamarca', 'Santa María'),
(53453433, 'HJFFLHFF', 'cg@gmail.com', '23423423', 'tos', 'Medico', 'Buenos Aires', 'Almirante Brown'),
(56476876, 'Juan Diaz', 'jdm@gmail.com', '23434553', 'tos', 'Medico', 'Neuquén', 'Catán Lil');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--

CREATE TABLE `laboratorio` (
  `idLaboratorio` int NOT NULL,
  `CUIT` varchar(11) COLLATE utf8mb4_general_ci NOT NULL,
  `nomLaboratorio` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pais` varchar(30) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `domComercial` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `laboratorio`
--

INSERT INTO `laboratorio` (`idLaboratorio`, `CUIT`, `nomLaboratorio`, `pais`, `domComercial`) VALUES
(1, '30364653340', 'Astra', 'USA', 'ASTRASENEKA'),
(2, '67454564569', 'Astras', 'USA', 'AStraP');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

CREATE TABLE `vacuna` (
  `nroSerieDosis` int NOT NULL,
  `marca` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `medida` double NOT NULL,
  `fechaCaduca` date NOT NULL,
  `colocada` tinyint DEFAULT NULL
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
  ADD UNIQUE KEY `dosis` (`dosis`);

--
-- Indices de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  ADD UNIQUE KEY `DNI` (`DNI`);

--
-- Indices de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  ADD PRIMARY KEY (`idLaboratorio`),
  ADD UNIQUE KEY `CUIT_UNIQUE` (`CUIT`);

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
  MODIFY `IDcentro` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  MODIFY `idLaboratorio` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD CONSTRAINT `citavacunacion_ibfk_1` FOREIGN KEY (`persona`) REFERENCES `ciudadano` (`DNI`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `citavacunacion_ibfk_2` FOREIGN KEY (`codCita`) REFERENCES `centrovacunacion` (`IDcentro`);

--
-- Filtros para la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD CONSTRAINT `vacuna_ibfk_1` FOREIGN KEY (`nroSerieDosis`) REFERENCES `laboratorio` (`idLaboratorio`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `vacuna_ibfk_2` FOREIGN KEY (`nroSerieDosis`) REFERENCES `citavacunacion` (`dosis`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
