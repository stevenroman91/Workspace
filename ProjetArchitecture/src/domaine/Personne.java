package domaine;

public class Personne {
	
	//Attribus
	
	private int idPersonne, age;
	private String prenom, nom;
	
	// Constructeurs
	
	public Personne() {
		super();
	}
	
	public Personne(int idPersonne, int age, String prenom, String nom) {
		super();
		this.idPersonne = idPersonne;
		this.age = age;
		this.prenom = prenom;
		this.nom = nom;
	}

	public Personne(int age, String prenom, String nom) {
		super();
		this.age = age;
		this.prenom = prenom;
		this.nom = nom;
	}

	//Getters & Setters
	
	public int getIdPersonne() {
		return idPersonne;
	}
	
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	// Methodes
	
	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", age=" + age + ", prenom=" + prenom + ", nom=" + nom + "]";
	}
	

}
