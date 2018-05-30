package presentation;

import domaine.Personne;
import service.PersonneImpl;


public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p = new Personne(1, "Roman", "Steven", 26);
		PersonneImpl pi = new PersonneImpl();
		
		pi.ajouter(p);
		pi.affiche(pi.findAll());


	}

}
