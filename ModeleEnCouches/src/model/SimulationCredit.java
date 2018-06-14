package model;
/**
 * 
 * @author Quentin Ussunet et Steven Roman
 *
 */
public class SimulationCredit {
	
	//---------- Attributs de la Classe SimulationCredit
	
	private double montant;
	private double taux;
	private int duree;
	private boolean typeDeCredit;
	private double mensualite;

	//---------- Constructeur de la Classe SimulationCredit
	
	/**
	 * 
	 * @param montant montant desiré
	 * @param taux taux d'interet du pret
	 * @param duree duree en mois
	 * @param typeDeCredit credit immobilier ou consomation
	 */
	public SimulationCredit(double montant, double taux, int duree, boolean typeDeCredit) {
		super();
		this.montant = montant;
		this.taux = taux;
		this.duree = duree;
		this.typeDeCredit = typeDeCredit;
	}
	
	//---------- Getters & Setters
	

	
	public double getMontant() {
		return montant;
	}

	/**
	 * 
	 * @param montant montant desiré
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	public double getTaux() {
		return taux;
	}
	/**
	 * 
	 * @param taux taux d'intérêt
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	public int getDuree() {
		return duree;
	}
	/**
	 * 
	 * @param duree duree du credit en mois
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}

	public boolean isTypeDeCredit() {
		return typeDeCredit;
	}

	/**
	 * 
	 * @param typedeCredit credit immobilier ou credit consomation
	 */
	public void setTypeDeCredit(boolean typedeCredit) {
		this.typeDeCredit = typedeCredit;
	}
	
	public double getMensualite() {
		return mensualite;
	}

	/**
	 * 
	 * @param mensualite mensualité à rembouser
	 */
	public void setMensualite(double mensualite) {
		this.mensualite = mensualite;
	}

	
	
	//---------- Reecriture de la methode toString
	
	
	@Override
	public String toString() {
		return "SimulationCredit [montant=" + montant + ", taux=" + taux + ", duree=" + duree + ", typeDeCredit="
				+ typeDeCredit + ", mensualite=" + mensualite + "]";
	}


}
