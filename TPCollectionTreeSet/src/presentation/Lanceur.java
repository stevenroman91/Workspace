package presentation;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import domaine.Personne;


public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Comment ajouter des elements � une Set et comment on ajoute des �l�ments au SET
		
		// declarer et initialiser la collection
		SortedSet<Personne> set= new TreeSet<Personne>(new Comparator<Personne>() {

			@Override
			public int compare(Personne p1, Personne p2) {
				if(p1.getNom().toUpperCase().equals(p2.getNom().toUpperCase())) {
					return -p1.getPrenom().toUpperCase().compareTo(p2.getPrenom().toUpperCase());
				}
				else {
					return -p1.getNom().toUpperCase().compareTo(p2.getNom().toUpperCase());
				}
				
			}
			
		});
		
		Personne p1 = new Personne(1,"tata", "Eddy");
		Personne p2 = new Personne(2,"TATA", "Js");
		Personne p3 = new Personne(3,"Roman", "Steven");
		Personne p4 = new Personne(4,"Picard", "Camille");
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		
		for (Personne personne : set) {
			
			System.out.println(personne);
			
		}
		



	}

}
