package model;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 * @author Badr Azeri et Steven Roman
 *
 */

public class Client extends Personne {
	
	//---------- Attributs de la Classe Client
	
	private int idClient;
	private int telephone;
	private Adresse adresse;
	private String email;
	//private boolean typeDeClient;
	private ConseillerClientele conseiller;
	private Collection<Compte> comptes = new ArrayList<Compte>();
	private Collection<Placement> placements = new ArrayList<Placement>();
	
	//---------- Constructeur de la Classe Personne 
	/**
	 * 
	 * @param prenom
	 * @param nom
	 * @param adresse
	 * @param email
	 */
	public Client(String prenom, String nom, String email) {
		super();
		super.prenom = prenom;
		super.nom = nom;
		this.email = email;
	}
	
	/**
	 * 
	 * @param prenom
	 * @param nom
	 * @param telephone
	 * @param adresse
	 * @param email
	 */
	public Client(String prenom, String nom,int telephone, Adresse adresse, String email) {
		super();
		super.prenom = prenom;
		super.nom = nom;
		this.telephone = telephone;
		this.adresse = adresse;
		this.email = email;
	}

	//---------- Getters & Setters
	
	/**
	 * @return the idClient
	 */
	public int getIdClient() {
		return idClient;
	}

	/**
	 * @param idClient the idClient to set
	 */
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	/**
	 * @return the telephone
	 */
	public int getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	/*
	*//**
	 * @return the typeDeClient
	 *//*
	public boolean isTypeDeClient() {
		return typeDeClient;
	}

	*//**
	 * @param typeDeClient the typeDeClient to set
	 *//*
	public void setTypeDeClient(boolean typeDeClient) {
		this.typeDeClient = typeDeClient;
	}
*/
	/**
	 * @return the conseiller
	 */
	public ConseillerClientele getConseiller() {
		return conseiller;
	}

	/**
	 * @param conseiller the conseiller to set
	 */
	public void setConseiller(ConseillerClientele conseiller) {
		this.conseiller = conseiller;
	}

	/**
	 * @return the comptes
	 */
	public Collection<Compte> getComptes() {
		return comptes;
	}

	/**
	 * @param comptes the comptes to set
	 */
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}

	/**
	 * @return the placements
	 */
	public Collection<Placement> getPlacements() {
		return placements;
	}

	/**
	 * @param placements the placements to set
	 */
	public void setPlacements(Collection<Placement> placements) {
		this.placements = placements;
	}

	
	
	//---------- Reecriture de la methode toString

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", telephone=" + telephone + ", adresse=" + adresse +/* ", typeDeClient="
				+ typeDeClient +*/ ", conseiller=" + conseiller + ", comptes=" + comptes + ", placements=" + placements
				+ "]";
	}
	

}
