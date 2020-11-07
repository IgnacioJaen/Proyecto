-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-11-2020 a las 12:39:47
-- Versión del servidor: 10.1.37-MariaDB
-- Versión de PHP: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `no_appearance`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `account_type`
--

CREATE TABLE `account_type` (
  `account_type_id` int(11) NOT NULL,
  `type` varchar(100) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `status` int(11) NOT NULL,
  `tx_id` int(11) NOT NULL,
  `tx_host` varchar(100) NOT NULL,
  `tx_user_id` int(11) NOT NULL,
  `tx_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tx_update` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `account_type`
--

INSERT INTO `account_type` (`account_type_id`, `type`, `price`, `status`, `tx_id`, `tx_host`, `tx_user_id`, `tx_date`, `tx_update`) VALUES
(1, '1', '0.00', 1, 1, '192.168.1.68', 12, '2020-10-30 02:09:03', '2020-10-29'),
(2, '2', '5.00', 1, 1, '192.168.1.68', 12, '2020-10-30 02:09:03', '2020-10-29');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `category`
--

CREATE TABLE `category` (
  `category_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `status` int(11) NOT NULL,
  `tx_id` int(11) NOT NULL,
  `tx_host` varchar(100) NOT NULL,
  `tx_user` int(11) NOT NULL,
  `tx_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tx_update` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `category`
--

INSERT INTO `category` (`category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES
(1, 'Peliculas', 1, 1, '192.168.15.25', 11, '2020-10-30 02:09:59', '2020-10-29'),
(2, 'Series', 1, 1, '192.168.15.25', 11, '2020-10-30 02:09:59', '2020-10-29'),
(3, 'Deportes', 0, 1, '192.168.15.25', 11, '2020-10-30 02:09:59', '2020-10-29'),
(4, 'Musica', 1, 1, '192.168.15.25', 11, '2020-10-30 02:09:59', '2020-10-29'),
(5, 'Deportes Extremos', 0, 1, '192.168.15.25', 11, '2020-10-30 02:09:59', '2020-10-29'),
(6, 'Gastronomia', 1, 1, '192.168.15.25', 11, '2020-10-30 02:09:59', '2020-10-29'),
(7, 'Filosofia', 1, 1, '192.168.15.25', 11, '2020-10-30 02:09:59', '2020-10-29');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `chat`
--

CREATE TABLE `chat` (
  `chat_id` int(11) NOT NULL,
  `profile1_id` int(11) NOT NULL,
  `profile2_id` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `tx_id` int(11) NOT NULL,
  `tx_host` varchar(100) NOT NULL,
  `tx_user` int(11) NOT NULL,
  `tx_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tx_update` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `chat`
--

INSERT INTO `chat` (`chat_id`, `profile1_id`, `profile2_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES
(1, 1, 2, 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(2, 3, 2, 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(3, 2, 5, 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(4, 3, 10, 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(5, 8, 9, 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(6, 8, 5, 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(7, 7, 2, 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(8, 8, 7, 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(9, 1, 6, 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(10, 4, 3, 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `h_user`
--

CREATE TABLE `h_user` (
  `h_user_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `surname` varchar(100) NOT NULL,
  `birthdate` date NOT NULL,
  `gender` tinyint(1) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `user_photo` varchar(255) NOT NULL,
  `account_type_id` int(11) NOT NULL,
  `user_type_id` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `tx_id` int(11) NOT NULL,
  `tx_host` varchar(100) NOT NULL,
  `tx_user` int(11) NOT NULL,
  `tx_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tx_update` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Registered users in the app';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `match`
--

CREATE TABLE `match` (
  `match_id` int(11) NOT NULL,
  `profile1_id` int(11) NOT NULL,
  `profile2_id` int(11) NOT NULL,
  `date_matches` date NOT NULL,
  `accepted` tinyint(1) NOT NULL,
  `status` int(11) NOT NULL,
  `tx_id` int(11) NOT NULL,
  `tx_host` varchar(100) NOT NULL,
  `tx_user` int(11) NOT NULL,
  `tx_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tx_update` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `match`
--

INSERT INTO `match` (`match_id`, `profile1_id`, `profile2_id`, `date_matches`, `accepted`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES
(11, 1, 10, '2020-10-29', 1, 1, 2, '192.168.31.148', 12, '2020-10-30 02:10:19', '2020-10-29'),
(12, 2, 9, '2020-10-29', 1, 1, 2, '192.168.31.148', 12, '2020-10-30 02:10:19', '2020-10-29'),
(13, 3, 8, '2020-10-29', 0, 1, 2, '192.168.31.148', 12, '2020-10-30 02:10:19', '2020-10-29'),
(14, 4, 7, '2020-10-29', 1, 1, 2, '192.168.31.148', 12, '2020-10-30 02:10:19', '2020-10-29'),
(15, 5, 6, '2020-10-29', 1, 1, 2, '192.168.31.148', 12, '2020-10-30 02:10:19', '2020-10-29'),
(16, 6, 5, '2020-10-29', 0, 1, 2, '192.168.31.148', 12, '2020-10-30 02:10:19', '2020-10-29'),
(17, 7, 4, '2020-10-29', 1, 1, 2, '192.168.31.148', 12, '2020-10-30 02:10:19', '2020-10-29'),
(18, 8, 3, '2020-10-29', 0, 1, 2, '192.168.31.148', 12, '2020-10-30 02:10:19', '2020-10-29'),
(19, 9, 2, '2020-10-29', 0, 1, 2, '192.168.31.148', 12, '2020-10-30 02:10:19', '2020-10-29'),
(20, 10, 1, '2020-10-29', 1, 1, 2, '192.168.31.148', 12, '2020-10-30 02:10:19', '2020-10-29');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `messages`
--

CREATE TABLE `messages` (
  `message_id` int(11) NOT NULL,
  `chat_id` int(11) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `content` varchar(5000) NOT NULL,
  `status` int(11) NOT NULL,
  `tx_id` int(11) NOT NULL,
  `tx_host` varchar(100) NOT NULL,
  `tx_user` int(11) NOT NULL,
  `tx_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `tx_update` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `messages`
--

INSERT INTO `messages` (`message_id`, `chat_id`, `date`, `content`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES
(1, 1, '2020-10-30 02:12:49', 'Hello, how are you?', 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(2, 2, '2020-10-30 02:12:49', 'Hi!', 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(3, 10, '2020-10-30 02:12:49', 'What about you?', 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(4, 8, '2020-10-30 02:12:49', 'Maybe', 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(5, 9, '2020-10-30 02:12:49', 'See you then', 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(6, 2, '2020-10-30 02:12:49', 'What are you doing?', 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(7, 3, '2020-10-30 02:12:49', 'Tomorrow', 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(8, 1, '2020-10-30 02:12:49', 'I am fine, thanks', 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(9, 7, '2020-10-30 02:12:49', 'No, sorry', 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29'),
(10, 6, '2020-10-30 02:12:49', 'At 7 pm', 1, 1, '192.168.31.148', 12, '2020-10-30 02:12:49', '2020-10-29');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `photos`
--

CREATE TABLE `photos` (
  `photos_id` int(11) NOT NULL,
  `category_id` int(11) NOT NULL,
  `photo_path` varchar(200) DEFAULT NULL,
  `status` int(11) NOT NULL,
  `tx_id` int(11) NOT NULL,
  `tx_host` varchar(100) NOT NULL,
  `tx_user` int(11) NOT NULL,
  `tx_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tx_update` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `photos`
--

INSERT INTO `photos` (`photos_id`, `category_id`, `photo_path`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES
(1, 1, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 1, 192168, '13', 1, '2020-11-07 16:32:05', '2020-10-29'),
(2, 5, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 0, 192168, '11', 1, '2020-11-07 16:33:59', '2020-10-29'),
(3, 6, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 1, 192168, '14', 1, '2020-11-07 16:33:59', '2020-10-29'),
(4, 7, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 0, 192168, '14', 1, '2020-11-07 16:33:59', '2020-10-29'),
(5, 4, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 1, 192168, '11', 1, '2020-11-07 16:33:59', '2020-10-29'),
(6, 5, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 0, 192168, '14', 1, '2020-11-07 16:33:59', '2020-10-29'),
(7, 1, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 1, 192168, '12', 1, '2020-11-07 16:33:59', '2020-10-29'),
(8, 3, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 0, 192168, '11', 1, '2020-11-07 16:33:59', '2020-10-29'),
(9, 2, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 1, 192168, '12', 1, '2020-11-07 16:33:59', '2020-10-29'),
(10, 4, 'https://concepto.de/wp-content/uploads/2018/10/URL1-e1538664726127.jpg', 0, 192168, '14', 1, '2020-11-07 16:33:59', '2020-10-29');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profile`
--

CREATE TABLE `profile` (
  `profile_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `tx_id` int(11) NOT NULL,
  `tx_host` varchar(100) NOT NULL,
  `tx_user` int(11) NOT NULL,
  `tx_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tx_update` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `profile`
--

INSERT INTO `profile` (`profile_id`, `user_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES
(1, 1, 1, 1, '192.168.15.25', 11, '2020-10-30 02:09:59', '2020-10-29'),
(2, 2, 1, 1, '192.168.15.25', 11, '2020-10-30 02:09:59', '2020-10-29'),
(3, 3, 1, 1, '192.168.15.25', 11, '2020-10-30 02:09:59', '2020-10-29'),
(4, 4, 1, 1, '192.168.15.25', 11, '2020-10-30 02:09:59', '2020-10-29'),
(5, 5, 1, 1, '192.168.15.25', 11, '2020-10-30 02:10:00', '2020-10-29'),
(6, 6, 1, 1, '192.168.15.25', 11, '2020-10-30 02:10:00', '2020-10-29'),
(7, 7, 1, 1, '192.168.15.25', 11, '2020-10-30 02:10:00', '2020-10-29'),
(8, 8, 1, 1, '192.168.15.25', 11, '2020-10-30 02:10:00', '2020-10-29'),
(9, 9, 1, 1, '192.168.15.25', 11, '2020-10-30 02:10:00', '2020-10-29'),
(10, 10, 1, 1, '192.168.15.25', 11, '2020-10-30 02:10:00', '2020-10-29');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profile_subcategory`
--

CREATE TABLE `profile_subcategory` (
  `profile_sub_id` int(11) NOT NULL,
  `profile_id` int(11) NOT NULL,
  `subcategory_id` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `tx_id` int(11) NOT NULL,
  `tx_host` varchar(100) NOT NULL,
  `tx_user` int(11) NOT NULL,
  `tx_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tx_update` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `profile_subcategory`
--

INSERT INTO `profile_subcategory` (`profile_sub_id`, `profile_id`, `subcategory_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES
(1, 1, 1, 1, 10, '192.168.15.25', 11, '2020-10-30 02:12:41', '2020-10-29'),
(2, 2, 2, 1, 9, '192.168.15.25', 11, '2020-10-30 02:12:41', '2020-10-29'),
(3, 3, 3, 1, 8, '192.168.15.25', 11, '2020-10-30 02:12:41', '2020-10-29'),
(4, 4, 4, 1, 7, '192.168.15.25', 11, '2020-10-30 02:12:41', '2020-10-29'),
(5, 5, 5, 1, 6, '192.168.15.25', 11, '2020-10-30 02:12:41', '2020-10-29'),
(6, 6, 6, 1, 5, '192.168.15.25', 11, '2020-10-30 02:12:41', '2020-10-29'),
(7, 7, 7, 1, 4, '192.168.15.25', 11, '2020-10-30 02:12:41', '2020-10-29'),
(8, 8, 8, 1, 3, '192.168.15.25', 11, '2020-10-30 02:12:41', '2020-10-29'),
(9, 9, 9, 1, 2, '192.168.15.25', 11, '2020-10-30 02:12:41', '2020-10-29'),
(10, 10, 10, 1, 1, '192.168.15.25', 11, '2020-10-30 02:12:41', '2020-10-29');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `report`
--

CREATE TABLE `report` (
  `report_id` int(11) NOT NULL,
  `chat_id` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `tx_id` int(11) NOT NULL,
  `tx_host` varchar(100) NOT NULL,
  `tx_user` int(11) NOT NULL,
  `tx_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tx_update` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Registered users in the app';

--
-- Volcado de datos para la tabla `report`
--

INSERT INTO `report` (`report_id`, `chat_id`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES
(1, 1, 1, 13, '192.168.1.1', 1, '2020-11-07 16:36:27', '2020-10-29'),
(2, 5, 0, 11, '192.168.1.1', 1, '2020-11-07 16:36:43', '2020-10-29'),
(3, 6, 1, 14, '192.168.1.1', 1, '2020-11-07 16:36:43', '2020-10-29'),
(4, 8, 0, 14, '192.168.1.1', 1, '2020-11-07 16:36:43', '2020-10-29'),
(5, 9, 1, 11, '192.168.1.1', 1, '2020-11-07 16:36:43', '2020-10-29'),
(6, 10, 0, 14, '192.168.1.1', 1, '2020-11-07 16:36:43', '2020-10-29'),
(7, 1, 1, 12, '192.168.1.1', 1, '2020-11-07 16:36:43', '2020-10-29'),
(8, 3, 0, 11, '192.168.1.1', 1, '2020-11-07 16:36:43', '2020-10-29'),
(9, 2, 1, 12, '192.168.1.1', 1, '2020-11-07 16:36:43', '2020-10-29'),
(10, 4, 0, 14, '192.168.1.1', 1, '2020-11-07 16:36:43', '2020-10-29');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `report_options`
--

CREATE TABLE `report_options` (
  `report_op_id` int(11) NOT NULL,
  `report_id` int(11) NOT NULL,
  `message_id` int(11) NOT NULL,
  `description` varchar(150) NOT NULL,
  `status` int(11) NOT NULL,
  `tx_id` int(11) NOT NULL,
  `tx_host` varchar(100) NOT NULL,
  `tx_user` int(11) NOT NULL,
  `tx_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tx_update` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `report_options`
--

INSERT INTO `report_options` (`report_op_id`, `report_id`, `message_id`, `description`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES
(1, 1, 5, '5', 1, 13, '192.168.1.1', 1, '2020-11-07 16:37:37', '2020-10-29'),
(2, 5, 6, '4', 0, 11, '192.168.1.1', 1, '2020-11-07 16:38:10', '2020-10-29'),
(3, 6, 4, '7', 1, 14, '192.168.1.1', 1, '2020-11-07 16:38:26', '2020-10-29'),
(4, 8, 2, '6', 0, 14, '192.168.1.1', 1, '2020-11-07 16:38:26', '2020-10-29'),
(5, 9, 3, '3', 1, 11, '192.168.1.1', 1, '2020-11-07 16:38:26', '2020-10-29'),
(6, 10, 8, '1', 0, 14, '192.168.1.1', 1, '2020-11-07 16:38:26', '2020-10-29'),
(7, 1, 6, '2', 1, 12, '192.168.1.1', 1, '2020-11-07 16:38:26', '2020-10-29'),
(8, 3, 7, '6', 0, 11, '192.168.1.1', 1, '2020-11-07 16:38:26', '2020-10-29'),
(9, 2, 4, '7', 1, 12, '192.168.1.1', 1, '2020-11-07 16:38:26', '2020-10-29'),
(10, 4, 2, '5', 0, 14, '192.168.1.1', 1, '2020-11-07 16:38:26', '2020-10-29');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `subcategory`
--

CREATE TABLE `subcategory` (
  `subcategory_id` int(11) NOT NULL,
  `category_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `status` int(11) NOT NULL,
  `tx_id` int(11) NOT NULL,
  `tx_host` varchar(100) NOT NULL,
  `tx_user` int(11) NOT NULL,
  `tx_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tx_update` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `subcategory`
--

INSERT INTO `subcategory` (`subcategory_id`, `category_id`, `name`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES
(1, 1, 'Terror', 1, 1, '192.168.15.25', 11, '2020-10-30 02:10:00', '2020-10-29'),
(2, 2, 'Familiares', 1, 1, '192.168.15.25', 11, '2020-10-30 02:10:00', '2020-10-29'),
(3, 3, 'Futbol', 1, 1, '192.168.15.25', 11, '2020-10-30 02:10:00', '2020-10-29'),
(4, 4, 'Rock', 1, 1, '192.168.15.25', 11, '2020-10-30 02:10:00', '2020-10-29'),
(5, 5, 'Parkour', 1, 1, '192.168.15.25', 11, '2020-10-30 02:10:00', '2020-10-29'),
(6, 6, 'Italiana', 1, 1, '192.168.15.25', 11, '2020-10-30 02:10:00', '2020-10-29'),
(7, 7, 'Dante', 1, 1, '192.168.15.25', 11, '2020-10-30 02:10:00', '2020-10-29'),
(8, 1, 'Comedia', 1, 1, '192.168.15.25', 11, '2020-10-30 02:10:00', '2020-10-29'),
(9, 2, 'Juveniles', 1, 1, '192.168.15.25', 11, '2020-10-30 02:10:00', '2020-10-29'),
(10, 3, 'Basquet', 1, 1, '192.168.15.25', 11, '2020-10-30 02:10:00', '2020-10-29');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `account_type_id` int(11) NOT NULL,
  `user_type_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `surname` varchar(100) NOT NULL,
  `birthdate` date NOT NULL,
  `gender` tinyint(1) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `user_photo` varchar(255) NOT NULL,
  `status` int(11) NOT NULL,
  `tx_id` int(11) NOT NULL,
  `tx_host` varchar(100) NOT NULL,
  `tx_user` int(11) NOT NULL,
  `tx_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tx_update` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Registered users in the app';

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`user_id`, `account_type_id`, `user_type_id`, `name`, `surname`, `birthdate`, `gender`, `email`, `password`, `user_photo`, `status`, `tx_id`, `tx_host`, `tx_user`, `tx_date`, `tx_update`) VALUES
(1, 1, 1, 'Jose', 'Chura', '1998-10-10', 0, 'jc@gmail.com', '12345', 'URL', 1, 1, '192.168.15.25', 13, '2020-10-30 02:09:03', '2020-10-29'),
(2, 2, 1, 'Andres', 'Roque', '1997-09-03', 0, 'ar@gmail.com', '48944', 'URL', 1, 1, '192.168.15.25', 13, '2020-10-30 02:09:03', '2020-10-29'),
(3, 1, 1, 'Manuel', 'Melez', '1996-08-04', 0, 'mmg@gmail.com', 'ewa456', 'URL', 1, 1, '192.168.15.25', 13, '2020-10-30 02:09:03', '2020-10-29'),
(4, 2, 1, 'Sophia', 'Rich', '1995-07-05', 0, 'sr@gmail.com', 'fas489', 'URL', 1, 1, '192.168.15.25', 13, '2020-10-30 02:09:03', '2020-10-29'),
(5, 1, 1, 'Rene', 'Menji', '1994-06-11', 0, 'rm@gmail.com', 'ee1264', 'URL', 1, 1, '192.168.15.25', 13, '2020-10-30 02:09:03', '2020-10-29'),
(6, 2, 1, 'Alejandra', 'Savedra', '2000-05-09', 0, 'as@gmail.com', 'das451', 'URL', 1, 1, '192.168.15.25', 13, '2020-10-30 02:09:03', '2020-10-29'),
(7, 1, 1, 'Maria', 'Avaroa', '2001-10-05', 0, 'ma@gmail.com', 'vcx56', 'URL', 1, 1, '192.168.15.25', 13, '2020-10-30 02:09:03', '2020-10-29'),
(8, 2, 1, 'Jhon', 'Perez', '1998-09-04', 0, 'jps@gmail.com', 'vdsvds44', 'URL', 1, 1, '192.168.15.25', 13, '2020-10-30 02:09:03', '2020-10-29'),
(9, 1, 1, 'Ibonne', 'Chon', '1998-11-03', 0, 'df@gmail.com', 'bea56', 'URL', 1, 1, '192.168.15.25', 13, '2020-10-30 02:09:03', '2020-10-29'),
(10, 2, 1, 'Tania', 'Dumphy', '1997-10-02', 0, 'jtdg@gmail.com', 'feacs55', 'URL', 1, 1, '192.168.15.25', 13, '2020-10-30 02:09:03', '2020-10-29'),
(11, 1, 2, 'Ignacio', 'Jaen', '1996-01-01', 0, 'ignajaen@gmail.com', 'sacvasv99', 'URL', 1, 1, '192.168.15.25', 13, '2020-10-30 02:09:03', '2020-10-29'),
(12, 1, 2, 'Marioly', 'Vargas', '1990-02-12', 0, 'mollyv@gmail.com', 'vasvas54', 'URL', 1, 1, '192.168.15.25', 13, '2020-10-30 02:09:03', '2020-10-29'),
(13, 1, 2, 'Rodrigo', 'Saravia', '1980-03-11', 0, 'rodriSa@gmail.com', '12sfs345', 'URL', 1, 1, '192.168.15.25', 13, '2020-10-30 02:09:03', '2020-10-29'),
(14, 1, 2, 'Ximena', 'Cruz', '1988-04-05', 0, 'ximenaC@gmail.com', 'mbrewq48', 'URL', 1, 1, '192.168.15.25', 13, '2020-10-30 02:09:03', '2020-10-29');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user_type`
--

CREATE TABLE `user_type` (
  `user_type_id` int(11) NOT NULL,
  `type` varchar(100) NOT NULL,
  `status` int(11) NOT NULL,
  `tx_id` int(11) NOT NULL,
  `tx_host` varchar(100) NOT NULL,
  `tx_user_id` int(11) NOT NULL,
  `tx_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tx_update` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `user_type`
--

INSERT INTO `user_type` (`user_type_id`, `type`, `status`, `tx_id`, `tx_host`, `tx_user_id`, `tx_date`, `tx_update`) VALUES
(1, '1', 1, 1, '192.168.1.65', 11, '2020-10-30 02:09:02', '2020-10-29'),
(2, '2', 1, 1, '192.168.1.65', 11, '2020-10-30 02:09:02', '2020-10-29');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `account_type`
--
ALTER TABLE `account_type`
  ADD PRIMARY KEY (`account_type_id`);

--
-- Indices de la tabla `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`category_id`);

--
-- Indices de la tabla `chat`
--
ALTER TABLE `chat`
  ADD PRIMARY KEY (`chat_id`),
  ADD KEY `Chat_Profile_1` (`profile1_id`),
  ADD KEY `Chat_Profile_2` (`profile2_id`);

--
-- Indices de la tabla `h_user`
--
ALTER TABLE `h_user`
  ADD PRIMARY KEY (`h_user_id`);

--
-- Indices de la tabla `match`
--
ALTER TABLE `match`
  ADD PRIMARY KEY (`match_id`),
  ADD UNIQUE KEY `profile_one_id` (`profile1_id`),
  ADD UNIQUE KEY `profile_two_id` (`profile2_id`);

--
-- Indices de la tabla `messages`
--
ALTER TABLE `messages`
  ADD PRIMARY KEY (`message_id`),
  ADD KEY `Messages_Chat` (`chat_id`);

--
-- Indices de la tabla `photos`
--
ALTER TABLE `photos`
  ADD PRIMARY KEY (`photos_id`),
  ADD KEY `photos_Category` (`category_id`);

--
-- Indices de la tabla `profile`
--
ALTER TABLE `profile`
  ADD PRIMARY KEY (`profile_id`),
  ADD KEY `Profile_User` (`user_id`);

--
-- Indices de la tabla `profile_subcategory`
--
ALTER TABLE `profile_subcategory`
  ADD PRIMARY KEY (`profile_sub_id`),
  ADD KEY `Profile_Subcategory_Profile` (`profile_id`),
  ADD KEY `Profile_Subcategory_Subcategory` (`subcategory_id`);

--
-- Indices de la tabla `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`report_id`),
  ADD KEY `Report_Chat` (`chat_id`);

--
-- Indices de la tabla `report_options`
--
ALTER TABLE `report_options`
  ADD PRIMARY KEY (`report_op_id`),
  ADD KEY `Report_options_Messages` (`message_id`),
  ADD KEY `Report_options_Report` (`report_id`);

--
-- Indices de la tabla `subcategory`
--
ALTER TABLE `subcategory`
  ADD PRIMARY KEY (`subcategory_id`),
  ADD KEY `Subcategory_Category` (`category_id`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`),
  ADD KEY `User_Account_type` (`account_type_id`),
  ADD KEY `User_User_type` (`user_type_id`);

--
-- Indices de la tabla `user_type`
--
ALTER TABLE `user_type`
  ADD PRIMARY KEY (`user_type_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `account_type`
--
ALTER TABLE `account_type`
  MODIFY `account_type_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `category`
--
ALTER TABLE `category`
  MODIFY `category_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `chat`
--
ALTER TABLE `chat`
  MODIFY `chat_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `h_user`
--
ALTER TABLE `h_user`
  MODIFY `h_user_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `match`
--
ALTER TABLE `match`
  MODIFY `match_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `messages`
--
ALTER TABLE `messages`
  MODIFY `message_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `profile`
--
ALTER TABLE `profile`
  MODIFY `profile_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `report`
--
ALTER TABLE `report`
  MODIFY `report_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `report_options`
--
ALTER TABLE `report_options`
  MODIFY `report_op_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `subcategory`
--
ALTER TABLE `subcategory`
  MODIFY `subcategory_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `user_type`
--
ALTER TABLE `user_type`
  MODIFY `user_type_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `chat`
--
ALTER TABLE `chat`
  ADD CONSTRAINT `Chat_Profile_1` FOREIGN KEY (`profile1_id`) REFERENCES `profile` (`profile_id`),
  ADD CONSTRAINT `Chat_Profile_2` FOREIGN KEY (`profile2_id`) REFERENCES `profile` (`profile_id`);

--
-- Filtros para la tabla `match`
--
ALTER TABLE `match`
  ADD CONSTRAINT `Log_match_Profile1` FOREIGN KEY (`profile2_id`) REFERENCES `profile` (`profile_id`),
  ADD CONSTRAINT `Match_Profile` FOREIGN KEY (`profile1_id`) REFERENCES `profile` (`profile_id`);

--
-- Filtros para la tabla `messages`
--
ALTER TABLE `messages`
  ADD CONSTRAINT `Messages_Chat` FOREIGN KEY (`chat_id`) REFERENCES `chat` (`chat_id`);

--
-- Filtros para la tabla `photos`
--
ALTER TABLE `photos`
  ADD CONSTRAINT `photos_Category` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`);

--
-- Filtros para la tabla `profile`
--
ALTER TABLE `profile`
  ADD CONSTRAINT `Profile_User` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);

--
-- Filtros para la tabla `profile_subcategory`
--
ALTER TABLE `profile_subcategory`
  ADD CONSTRAINT `Profile_Subcategory_Profile` FOREIGN KEY (`profile_id`) REFERENCES `profile` (`profile_id`),
  ADD CONSTRAINT `Profile_Subcategory_Subcategory` FOREIGN KEY (`subcategory_id`) REFERENCES `subcategory` (`subcategory_id`);

--
-- Filtros para la tabla `report`
--
ALTER TABLE `report`
  ADD CONSTRAINT `Report_Chat` FOREIGN KEY (`chat_id`) REFERENCES `chat` (`chat_id`);

--
-- Filtros para la tabla `report_options`
--
ALTER TABLE `report_options`
  ADD CONSTRAINT `Report_options_Messages` FOREIGN KEY (`message_id`) REFERENCES `messages` (`message_id`),
  ADD CONSTRAINT `Report_options_Report` FOREIGN KEY (`report_id`) REFERENCES `report` (`report_id`);

--
-- Filtros para la tabla `subcategory`
--
ALTER TABLE `subcategory`
  ADD CONSTRAINT `Subcategory_Category` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`);

--
-- Filtros para la tabla `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `User_Account_type` FOREIGN KEY (`account_type_id`) REFERENCES `account_type` (`account_type_id`),
  ADD CONSTRAINT `User_User_type` FOREIGN KEY (`user_type_id`) REFERENCES `user_type` (`user_type_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
