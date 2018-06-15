package model;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 * @author Badr Azeri et Steven Roman
 *
 */

public abstract class Compte {
	
	//---------- Attributs de la Classe Adresse 
	
	

	protected int numeroDeCompte;
	protected double solde=0.;
	protected Client titulaireduCompte;
	protected String dateOuvertureCompte;
	protected CarteBancaire carte;
	/* cette variable nous permet de de pas demander le type de compte
	pour faire une operation du type verser ou retirer, on demande juste un
	compte et un mt*/
	protected boolean typeDeCompte; 
	/* 0 = Compte Courant
	 * 1 = Compte Epargne
	 */
	
	//---------- Getters & Setters
	protected int idCompte;
	/**
	 * @return the idCompte
	 */
	public int getIdCompte() {
		return idCompte;
	}
	/**
	 * @param idCompte the idCompte to set
	 */
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	public int getNumeroDeCompte() {
		return numeroDeCompte;
	}
	/**
	 * 
	 * @param numeroDeCompte nous permet d'identifier le compte
	 */
	public void setNumeroDeCompte(int numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}
	public double getSolde() {
		return solde;
	}
	/**
	 * 
	 * @param solde quantite de resources dans le compte
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Client getTitulaireduCompte() {
		return titulaireduCompte;
	}
	/**
	 * 
	 * @param titulaireduCompte client titulaire du compre
	 */
	public void setTitulaireduCompte(Client titulaireduCompte) {
		this.titulaireduCompte = titulaireduCompte;
	}
	public String getDateOuvertureCompte() {
		return dateOuvertureCompte;
	}
	/**
	 * 
	 * @param dateOuvertureCompte date d'ouverture du compte
	 */
	public void setDateOuvertureCompte(String dateOuvertureCompte) {
		this.dateOuvertureCompte = dateOuvertureCompte;
	}
	public CarteBancaire getCarte() {
		return carte;
	}
	/**
	 * 
	 * @param carte carte associée au compte
	 */
	public void setCarte(CarteBancaire carte) {
		this.carte = carte;
	}
	public boolean isTypeDeCompte() {
		return typeDeCompte;
	}
	/**
	 * 
	 * @param typeDeCompte epargne ou courant
	 */
	public void setTypeDeCompte(boolean typeDeCompte) {
		this.typeDeCompte = typeDeCompte;
	}
	
	// ---------- Reecriture de la methode toString
	
	@Override
	public String toString() {
		return "Compte [numeroDeCompte=" + numeroDeCompte + ", solde=" + solde + ", dateOuvertureCompte="
				+ dateOuvertureCompte + "]";
	}
	
}
