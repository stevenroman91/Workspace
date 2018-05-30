package domaine;

public class Login {

		private int Id;
		private String pseudo, password;
		private Personne personne;
		
		public Personne getPersonne() {
			return personne;
		}

		public void setPersonne(Personne personne) {
			this.personne = personne;
		}

		public Login(int id, String pseudo, String password) {
			super();
			Id = id;
			this.pseudo = pseudo;
			this.password = password;
		}

		public Login(int id, String pseudo, String password, Personne personne) {
			super();
			Id = id;
			this.pseudo = pseudo;
			this.password = password;
			this.personne = personne;
		}

		public Login() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}

		public String getPseudo() {
			return pseudo;
		}

		public void setPseudo(String pseudo) {
			this.pseudo = pseudo;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
}