package dao;

import java.util.Collection;

import domaine.Personne;

public interface Idao {

	public void ajouterPersonne(Personne p);
	public void modifierPersonne(Personne p);
	public void supprimerPersonne (int idPersonne);
	public Collection<Personne> findAll();
	
}
