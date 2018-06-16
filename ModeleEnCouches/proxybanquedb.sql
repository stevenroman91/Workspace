--
-- Base de données :  `proxibanquedb`
--
CREATE DATABASE IF NOT EXISTS `proxibanquedb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `proxibanquedb`;


-- --------------------------------------------------------

--
-- Structure de la table `conseillerClientele`
--

CREATE TABLE `conseillerClientele` (
  `idConseillerClientele` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `password` varchar(255) NOT NULL,
  `idAgence` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `idClient` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `email` varchar(255) NOT NULL,
  `telephone` int(15) NOT NULL,
  `idAdresse` int(11) NOT NULL,
  `idConseillerClientele` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `adresse`
--

CREATE TABLE `adresse` (
  `idAdresse` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `adresse` varchar(45) NOT NULL,
  `codePostal` varchar(45) NOT NULL,
  `ville` varchar(255) NOT NULL,
  `idClient` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `CompteCourant`
--

CREATE TABLE `comptecourant` (
  `idCompteCourant` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `numeroDeCompte` varchar(45) NOT NULL,
  `solde` double(7,2) NOT NULL,
  `decouvert` double(5;2) NOT NULL,
  `typeDeCompte`   BOOLEAN NOT NULL DEFAULT FALSE,  
  `dateOuvertureCompte` date DEFAULT NULL
  `idClient` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `CompteEpargne`
--

CREATE TABLE `compteEpargne` (
  `idCompteEpargne` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `numeroDeCompte` varchar(45) NOT NULL,
  `solde` double(7,2) NOT NULL,
  `typeDeCompte`  BOOLEAN NOT NULL DEFAULT TRUE,  
  `taux` double(5,2) NOT NULL,
 `dateOuvertureCompte`  date DEFAULT NULL
  `idClient` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

/*--
-- Structure de la table `virement`
--

CREATE TABLE `virement` (
  `id_virement` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `id_compteDebiteur` int(11) NOT NULL,
  `id_CompteCrediteur` int(11) NOT NULL,
  `montant` double(7,2) NOT NULL,
  `description` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1*/


-- --------------------------------------------------------
-- Contraintes pour les tables 
-- --------------------------------------------------------

--
-- Contraintes pour la table `client`
--
ALTER TABLE `CompteCourant`
  ADD CONSTRAINT `fk_conseiller` FOREIGN KEY (`idConseillerClientele`) REFERENCES `conseiller` (`idConseillerClientele`) ON DELETE NO ACTION ON UPDATE NO ACTION;
  ADD CONSTRAINT `fk_adresse` FOREIGN KEY (`idAdresse`) REFERENCES `adresse` (`idAdresse`) ON DELETE NO ACTION ON UPDATE NO ACTION;


-- Contraintes pour la table `adresse`
--
ALTER TABLE `adresse`
  ADD CONSTRAINT `fk_client` FOREIGN KEY (`idClient`) REFERENCES `client` (`idClient`) ON DELETE NO ACTION ON UPDATE NO ACTION;


--
-- Contraintes pour la table `compteCourant`
--
ALTER TABLE `compte`
  ADD CONSTRAINT `fk_client` FOREIGN KEY (`idClient`) REFERENCES `client` (`idClient`) ON DELETE NO ACTION ON UPDATE NO ACTION,
 

--
-- Contraintes pour la table `compteEpargne`
--
ALTER TABLE `compteEpargne`
  ADD CONSTRAINT `fk_client` FOREIGN KEY (`idClient`) REFERENCES `client` (`idClient`) ON DELETE NO ACTION ON UPDATE NO ACTION,

