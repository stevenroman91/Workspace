package presentation;

import domaine.Personne;
import service.Iadmin;
import service.Iutilisateur;
import service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iadmin admin = new ServiceImpl();
		Iutilisateur utilisateur = new ServiceImpl();
		admin.findAll();
		utilisateur.findAll();		
		

	}

}
