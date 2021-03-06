package domaine;

import java.util.ArrayList;
import java.util.Collection;

public class Personne {
	
	protected int personneId;
	private int age;
	private String nom, prenom;
	private Collection<Club> clubs = new ArrayList<Club>();;
	private Login login;
	
	private Collection<Compte> compte = new ArrayList<Compte>();
	
	public Personne(int personneId, int age, String nom, String prenom, Collection<Club> clubs, Login login) {
		super();
		this.personneId = personneId;
		this.age = age;
		this.nom = nom;
		this.prenom = prenom;
		this.clubs = clubs;
		this.login = login;
	}

	public Personne(int personneId, String nom, String prenom, int age) {
		super();
		// TODO Auto-generated constructor stub
		this.personneId = personneId;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		
	}

	public Collection<Compte> getCompte() {
		return compte;
	}

	public void setCompte(Collection<Compte> compte) {
		this.compte = compte;
	}

	public int getPersonneId() {
		return personneId;
	}

	public void setPersonneId(int personneId) {
		this.personneId = personneId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public Collection<Club> getClubs() {
		return clubs;
	}

	public void setClubs(Collection<Club> clubs) {
		this.clubs = clubs;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@Override
	public String toString() {

		return "Personne [personneId=" + personneId + ", age=" + age + ", nom=" + nom + ", prenom=" + prenom
				+ ", compte=" + compte + "]";
	}
	
	
}
