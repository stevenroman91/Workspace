package domaine;

public class CompteSimple extends Compte {
	
	// Attributs
	
	private double decouvert;
	
	// Getters & Setters
	
	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	// To String
	
	@Override
	public String toString() {
		return "CompteSimple [decouvert=" + decouvert + ", idCompte=" + idCompte + ", solde=" + solde + "]";
	}

	// Constructeur
	
	public CompteSimple(double decouvert) {
		super();
		this.decouvert = decouvert;
	}

	public CompteSimple(int idCompte, double solde, double decouvert) {
		super.idCompte = idCompte;
		super.solde = solde;
		this.decouvert = decouvert;
	}

	public CompteSimple(int idCompte, double solde, Personne proprietaire, double decouvert) {
		super.idCompte = idCompte;
		super.solde = solde;
		super.proprietaire = proprietaire;
		this.decouvert = decouvert;
	}
	
	

	
	
}
