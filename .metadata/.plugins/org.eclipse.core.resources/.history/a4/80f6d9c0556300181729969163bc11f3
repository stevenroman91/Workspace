package service;

import java.util.Collection;
import java.util.Map;

import domaine.Club;
import domaine.Compte;
import domaine.Login;
import domaine.Personne;

public interface Iservice {
	
	// CRUD pour l'objet Personne()
	public Map<Integer, Personne> createPersonne(Personne p);
	public void readPersonne(Personne p);
	public void updatePersonne(Personne p);
	public void deletePersonne(Personne p);
	
	public void affilierClub(Personne p, Club c);
	public void listePersonne(Map<Integer, Personne> personnes);
	
	// CRUD pour l'objet Compte()
	//public void createCompte(Compte c);
	public Map<Integer, Compte> createCompte(Compte c); //new
	public void readCompte();
	public void updateCompte(Compte c);
	public void deleteCompte(Compte c);
	
	public void listeCompte(Map<Integer, Compte> comptes); //new
	
	public void attribuerCompte(Personne p, Compte c);
	public void crediterCompte(Compte c, double montant);
	public void debiterCompte(Compte c, double montant);
	public void createTitulaire(Compte c, Personne p);
	public void ajouterTitulaire(Compte c, Personne p);
	public void updateTitulaire(Compte c, Personne p);
	
	
	// Pour l'objet Club
	public void createClub(Club club);
	public void readClub(Club club);
	public void updateClub(Club club);
	public void deleteClub(Club club);
	
	public void ajouterMembreClub(Personne p, Club c);
	public void listeDeClubParUtilisateur(Personne p);
	public void updateClubName(String nom, Club club);
	public void readClubs();
	
	
	// Pour l'objet Login
	public void createLogin(Login log);
	public void readLogin(Login log);
	public void updateLogin(Login log);
	public void deleteLogin(Login log);
	void createLogin();
	
}
