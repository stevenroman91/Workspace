package service;

import domaine.Personne;

public interface Iadmin extends Iutilisateur{
	
	public void ajouterPersonne(Personne p);
	public void modifierPersonne(Personne p);
	public void supprimerPersonne (int idPersonne);

}
