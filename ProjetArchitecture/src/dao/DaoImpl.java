package dao;

import java.util.Collection;

import domaine.Personne;

public class DaoImpl implements Idao {

	@Override
	public void ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		
		System.out.println("J'ajoute une personne");
		
	}

	@Override
	public void modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		System.out.println("Je modifie une personne");
		
	}

	@Override
	public void supprimerPersonne(int idPersonne) {
		// TODO Auto-generated method stub
		System.out.println("Je supprime une personne");
		
	}

	@Override
	public Collection<Personne> findAll() {
		// TODO Auto-generated method stub
		System.out.println("Je liste les une personne");
		return null;
	}

}
