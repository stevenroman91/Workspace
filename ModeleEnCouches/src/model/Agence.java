package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 
 * @author Badr Azeri et Steven Roman
 *
 * Cette classe agence est caracterisée par son idAgence et sa date de creation
 * Chaque agence a un gérant et une adresse
 */

public class Agence {
	
	//---------- Attributs de la Classe Agence

	private String idAgence;
	private String dateDeCreation;
	private Gerant gerant;
	private Adresse adresse;
	
	//---------- Constructeur de la Classe Agence
	
	public Agence() {
		super();
	}
	
	/**
	 * 
	 * @param idAgence identifiant de l'agence qui doit être une liste de caractères alpha numeriques avec 5 caracteres.
	 * @param dateF date de creation de l'agence
	 */
	public Agence(String idAgence, String dateF) {
		super();
		this.idAgence = idAgence;
		this.dateDeCreation = dateF;
;
	}

	//---------- Getters & Setters

	public String getIdAgence() {
		return idAgence;
	}

	/**
	 * 
	 * @param idAgence identifiant de l'agence
	 */
	public void setIdAgence(String idAgence) {
		this.idAgence = idAgence;
	}

	public String getDateDeCreation() {
		return dateDeCreation;
	}
	
	/**
	 * 
	 * @param dateDeCreation date de creation de l'agence
	 */

	public void setDateDeCreation(String dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	public Gerant getGerant() {
		return gerant;
	}

	/**
	 * 
	 * @param gerant est le gerant de l'agence
	 */
	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	public Adresse getAdresse() {
		return adresse;
	}
    
	/**
	 * 
	 * @param adresse est l'adresse de l'agence
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	//---------- Reecriture de la methode toString pour la classe Agence
	
	@Override
	public String toString() {
		return "Agence [idAgence=" + idAgence + ", dateDeCreation=" + dateDeCreation + ", gerant=" + gerant
				+ ", adresse=" + adresse + "]";
	}
	
}
