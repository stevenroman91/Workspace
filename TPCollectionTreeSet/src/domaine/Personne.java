package domaine;

public class Personne {
	private int idPersonne;
	private String nom, prenom;
	
	public Personne() {
		super();
	}

	public Personne(int idPersonne, String nom, String preom) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = preom;
	}

	public int getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	

}
