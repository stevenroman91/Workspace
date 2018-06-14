package model;

/**
 * 
 * @author Badr Azeri et Steven Roman
 *
 */

public class CarteBancaire {
	
	//---------- Attributs de la Classe Carte Bancaire
	
	private Compte compte;
	private boolean typeDeCarte;
	private int codeCarte;
	private String dateCreation;
	private String dateExpiration;
	private int cryptogramme;
	private boolean etatCarte;
	
	//---------- Constructeur de la classe carte
	
	public CarteBancaire() {
		super();
	}
	
	/**
	 * 
	 * @param compte on associe une carte à un compte
	 * @param typeDeCarte et on type la carte car ça pourrait être une carte Premium ou Electron
	 */
	
	public CarteBancaire(Compte compte, boolean typeDeCarte) {
		super();
		this.compte = compte;
		this.typeDeCarte = typeDeCarte;
	}
	
	//---------- Getters & Setters
	
	
	public int getCodeCarte() {
		return codeCarte;
	}
	
	/**
	 * 
	 * @param codeCarte code de la carte qui peut eventuellment etre changé
	 */
	public void setCodeCarte(int codeCarte) {
		this.codeCarte = codeCarte;
	}
	public Compte getCompte() {
		return compte;
	}
	/**
	 * 
	 * @param compte compte au quel la carte est rataché
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public boolean isTypeDeCarte() {
		return typeDeCarte;
	}
	/**
	 * 
	 * @param typeDeCarte Electron ou Premium
	 */
	public void setTypeDeCarte(boolean typeDeCarte) {
		this.typeDeCarte = typeDeCarte;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	/**
	 * 
	 * @param dateCreation date de creation
	 */
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getDateExpiration() {
		return dateExpiration;
	}
	/**
	 * 
	 * @param dateExpiration date d'expiration qui peut etre changé
	 */
	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	public int getCryptogramme() {
		return cryptogramme;
	}
	/**
	 * 
	 * @param cryptogramme crypto de la carte
	 */
	public void setCryptogramme(int cryptogramme) {
		this.cryptogramme = cryptogramme;
	}
	
	public boolean isEtatCarte() {
		return etatCarte;
	}

	/**
	 * 
	 * @param etatCarte nous permet de savoir si la carte est active ou pas
	 */
	public void setEtatCarte(boolean etatCarte) {
		this.etatCarte = etatCarte;
	}
	
	//---------- Reecriture de la methode toString
	
	@Override
	public String toString() {
		return "CarteBancaire [compte=" + compte + ", typeDeCarte=" + typeDeCarte + ", dateExpiration=" + dateExpiration
				+ "]";
	}
	
}
