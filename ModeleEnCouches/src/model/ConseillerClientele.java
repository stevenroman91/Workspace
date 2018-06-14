package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**
 * 
 * @author Quentin Ussunet et Steven Roman
 *
 */

public class ConseillerClientele extends Personne {
	
	//---------- Attributs de la Classe ConseillerClientelle 
	
	private int idConseillerClientele;
	private String login;
	private String password;
	private Gerant gerant;
	private Collection<Client> clients = new ArrayList<Client>();
	
	//---------- Constructeur de la Classe Conseillé Clientelle
	
	public ConseillerClientele() {
		
	}
	
	/**
	 * 
	 * @param prenom prenom du conseiller clientele
	 * @param nom nom du conseiller clientele
	 * @param login login du conseiller clientele
	 * @param password password du conseiller clientele
	 */
	public ConseillerClientele(String prenom, String nom, String login, String password) {
		super.prenom = prenom;
		super.nom = nom;
		this.login = login;
		this.password = password;
	}



	//---------- Getters & Setters
	
	/**
	 * @return the idConseillerClientele
	 */
	public int getIdConseillerClientele() {
		return idConseillerClientele;
	}

	/**
	 * @param idConseillerClientele the idConseillerClientele to set
	 */
	public void setIdConseillerClientele(int idConseillerClientele) {
		this.idConseillerClientele = idConseillerClientele;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the gerant
	 */
	public Gerant getGerant() {
		return gerant;
	}

	/**
	 * @param gerant the gerant to set
	 */
	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	/**
	 * @return the clients
	 */
	public Collection<Client> getClients() {
		return clients;
	}

	/**
	 * @param clients the clients to set
	 */
	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}
	
	//---------- Reecriture de la methode toString

	@Override
	public String toString() {
		return "ConseillerClientele [idConseillerClientele=" + idConseillerClientele + ", nom="
				+ nom + ", prenom=" + prenom  + "]";
	}

	
	
}
	
