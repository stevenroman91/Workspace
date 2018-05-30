package service;

import java.util.Collection;

import dao.DaoImpl;
import dao.Idao;
import domaine.Personne;

public class ServiceImpl implements Iadmin, Iutilisateur{
	
	//attribut de passage d'une couche à une autre
	
	private Idao dao = new DaoImpl();
	
	@Override
	public void ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		dao.ajouterPersonne(p);
		
	}

	@Override
	public void modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		dao.modifierPersonne(p);
		
	}

	@Override
	public void supprimerPersonne(int idPersonne) {
		// TODO Auto-generated method stub
		dao.supprimerPersonne(idPersonne);
		
	}

	@Override
	public Collection<Personne> findAll() {
		// TODO Auto-generated method stub
		dao.findAll();
		return null;
	}

}
