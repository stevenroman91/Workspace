package model;

/**
 * 
 * @author Badr Azeri et Steven Roman
 * 
 * Cette Classe regroupe tous les elements necessaires à constituer une adresse,
 * Un numéro de rue, une rue, un code postal et une ville.
 *
 */

public class Adresse {
	
	//---------- Attributs de la Classe Adresse 
	
	protected String adresse;
	protected int codePostal;
	protected String ville;
	
	//---------- Constructeurs de la Classe Adresse
	
	public Adresse() {
		super();
	}
	
	/**
	 * 
	 * @param adresse rue et numero de rue
	 * @param codePostal le code postal
	 * @param ville la ville
	 */
	
	public Adresse(String adresse, int codePostal, String ville) {
		super();
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	//---------- Getters & Setters
	
	public String getAdresse() {
		return adresse;
	}

	/**
	 * 
	 * @param adresse rue et numero de rue
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * 
	 * @param codePostal code postal
	 */
	
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	/**
	 * 
	 * @param ville ville
	 */
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	//---------- Reecriture de la methode toString
	
	/**
	 * La methode toString retourne le numero de rue, la rue, le code postal et la vile
	 */
	
	@Override
	public String toString() {
		return "Adresse:" + adresse + "," + codePostal + "," + ville;
	}
	

}
