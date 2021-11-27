-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : ven. 26 nov. 2021 à 14:00
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `clinique221`
--

-- --------------------------------------------------------

--
-- Structure de la table `antecmedicaux`
--

DROP TABLE IF EXISTS `antecmedicaux`;
CREATE TABLE IF NOT EXISTS `antecmedicaux` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `antecmedicaux`
--

INSERT INTO `antecmedicaux` (`id`, `libelle`, `description`) VALUES
(1, 'Diabète', 'Description diabète'),
(2, 'Hypertension', 'Description hypertension'),
(3, 'Hépatite', 'Description Hépatite'),
(4, 'Asthme', 'Description asthme');

-- --------------------------------------------------------

--
-- Structure de la table `constantes`
--

DROP TABLE IF EXISTS `constantes`;
CREATE TABLE IF NOT EXISTS `constantes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idpatient` int(11) NOT NULL,
  `temperature` int(11) NOT NULL,
  `tension` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `constantes`
--

INSERT INTO `constantes` (`id`, `idpatient`, `temperature`, `tension`) VALUES
(1, 1, 18, 28);

-- --------------------------------------------------------

--
-- Structure de la table `medicaments`
--

DROP TABLE IF EXISTS `medicaments`;
CREATE TABLE IF NOT EXISTS `medicaments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `rendezvous`
--

DROP TABLE IF EXISTS `rendezvous`;
CREATE TABLE IF NOT EXISTS `rendezvous` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idpatient` int(11) NOT NULL,
  `idmedecin` int(11) DEFAULT NULL,
  `consouprest` varchar(255) NOT NULL,
  `typeprest` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `statut` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `rendezvous`
--

INSERT INTO `rendezvous` (`id`, `idpatient`, `idmedecin`, `consouprest`, `typeprest`, `date`, `statut`) VALUES
(6, 1, 2, 'Prestation', 'Radio', '2021-11-27 08:00', 'En attente'),
(2, 1, 2, 'Prestation', 'Analyse', '2021-11-14 14:00', 'En attente');

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  `mail` varchar(255) NOT NULL,
  `mdp` varchar(255) NOT NULL,
  `dateInscription` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `actif` int(11) NOT NULL DEFAULT '1',
  `idAntecMed` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `users`
--

INSERT INTO `users` (`id`, `nom`, `prenom`, `role`, `mail`, `mdp`, `dateInscription`, `actif`, `idAntecMed`) VALUES
(1, 'Ndiaye', 'Tidiane', 'ROLE_PATIENT', 'patient@gmail.com', '1234', '2021-11-01 17:13:58', 1, 4),
(3, 'Diop', 'Mareme', 'ROLE_SECRETAIRE', 'secretaire@gmail.com', '1234', '2021-11-07 12:23:06', 1, NULL),
(4, 'Ba', 'Amadou', 'ROLE_RESP_PREST', 'responsable@gmail.com', '1234', '2021-11-07 12:23:06', 1, NULL),
(2, 'Diouf', 'Moussa', 'ROLE_MEDECIN', 'medecin@gmail.com', '1234', '2021-11-01 17:13:58', 1, NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
