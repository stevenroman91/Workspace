package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**
 * 
 * @author Quentin Ussunet et Steven Roman
 *
 */
public class Gerant extends Personne {
	
	//---------- Attributs de la Classe Gerant
	
	private int idGerant;
	private Agence agence;
	private Collection<ConseillerClientele> conseillers = new ArrayList<ConseillerClientele>();

	//---------- Constructeurs de la Classe Gerant
	
	/**
	 * Constructeur
	 * @param idGerant identifiant du conseiller
	 */
	public Gerant(int idGerant) {
		super();
		this.idGerant = idGerant;
	}
	/**
	 * 
	 * @param nom nom du conseiller
	 * @param prenom prenom du conseiller
	 * @param idGerant identifiant du conseiller
	 */
	public Gerant(String nom, String prenom, int idGerant) {
		super.nom = nom;
		super.prenom = prenom;
		this.idGerant = idGerant;
	}
	
	//---------- Getters & Setters
	
	public int getIdGerant() {
		return idGerant;
	}
	/**
	 * 
	 * @param idGerant identifiant gerant
	 */
	public void setIdGerant(int idGerant) {
		this.idGerant = idGerant;
	}

	public Collection<ConseillerClientele> getConseillers() {
		return conseillers;
	}
	/**
	 * 
	 * @param conseillers liste des conseillers sous la responsabilite du gerant
	 */
	public void setConseillers(Collection<ConseillerClientele> conseillers) {
		this.conseillers = conseillers;
	}
	public Agence getAgence() {
		return agence;
	}
	/**
	 * 
	 * @param agence agence que gere le gerant
	 */
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	
	//---------- Reecriture de la methode toString
	
	@Override
	public String toString() {
		return "Gerant [idGerant=" + idGerant + ", conseillers=" + conseillers + "]";
	}
	
	
	
	
}
