package model;
/**
 * 
 * @author Badr Azeri et Steven Roman
 *
 */
public class CompteEpargne extends Compte {

	// ---------- Attributs de la Classe Adresse

	private double taux = 0.03;

	// ---------- Constructeurs de la Classe Adresse
	
	/**
	 * Constructeur du compteEpargne
	 * @param numeroDeCompte numero de compte
	 * @param dateOuvertureCompte date d'ouverture du compte
	 * @param taux taux du compte
	 */
	public CompteEpargne(int numeroDeCompte, String dateOuvertureCompte, double taux) {
		super();
		super.numeroDeCompte = numeroDeCompte;
		super.dateOuvertureCompte = dateOuvertureCompte;
		this.taux = taux;
		super.typeDeCompte = true;
	}

	// ---------- Getters & Setters

	public double getTaux() {
		return taux;
	}

	/**
	 * 
	 * @param taux taux d'interet du compte
	 */

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	// ---------- Methode toString

	@Override
	public String toString() {
		return "CompteEpargne [numeroDeCompte = " + numeroDeCompte + " ; dateOuvertureCompte = "+dateOuvertureCompte + " ; taux=" + taux + "]";
	}
}
