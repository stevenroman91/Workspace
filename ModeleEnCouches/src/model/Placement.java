package model;
/**
 * 
 * @author Quentin Ussunet et Steven Roman
 *
 */
public class Placement {
	
	//---------- Attributs de la Classe Placement
	
	private double montant;
	private String villeDePlacement;
	private Client client;
	
	//---------- Constructeur de la Classe Placement
	/**
	 * Constructeur
	 * @param montant montant du placement à effectuer
	 * @param villeDePlacement ville où on veut investir
	 */
	public Placement(double montant, String villeDePlacement) {
		super();
		this.montant=montant;
		this.villeDePlacement=villeDePlacement;
	}
	
	//---------- Getters & Setters
	
	public double getMontant() {
		return montant;
	}
	/**
	 * 
	 * @param montant montant a placer
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Client getClient() {
		return client;
	}
	/**
	 * 
	 * @param client client qui veut faire le placement
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	public String getVilleDePlacement() {
		return villeDePlacement;
	}
	/**
	 * 
	 * @param villeDePlacement ville où on veut investir
	 */
	public void setVilleDePlacement(String villeDePlacement) {
		this.villeDePlacement = villeDePlacement;
	}
	
	//---------- Reecriture de la methode toString
	
	@Override
	public String toString() {
		return "Placement [client=" + client + ", villeDePlacement=" + villeDePlacement + "]";
	}
	

}
