package domaine;

public class ComptePayant extends Compte {

	// Attributs

	private double taux;

	// Getters & Setters 

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	//To String
	
	@Override
	public String toString() {
		return "ComptePayant [taux=" + taux + ", idCompte=" + idCompte + ", solde=" + solde + "]";
	}
	
	// Constructeur

	public ComptePayant(double taux) {
		super();
		this.taux = taux;
	}

	public ComptePayant(int idCompte, double solde, double taux) {
		super.idCompte = idCompte;
		super.solde = solde;
		this.taux = taux;
	}

	public ComptePayant(int idCompte, double solde, Personne proprietaire, double taux) {
		super.idCompte = idCompte;
		super.solde = solde;
		super.proprietaire = proprietaire;
		this.taux = taux;
	}
	
	
	

}
