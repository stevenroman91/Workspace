package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Adresse;
import model.Client;
import model.Compte;
import model.CompteCourant;
import model.CompteEpargne;
import model.ConseillerClientele;
import service.MontantNegatifException;

public class DBClientDao extends DaoUtil implements ClientDao {

	@Override
	public void save(Client c) {
		// Information d'acces a la base de donnees
		Connection cn = null;
		PreparedStatement st = null;
		try {
			cn = SeConnecter();
			// Etape 3: Creer une requete
			String sql = "INSERT INTO clients (nom) VALUES (?)";
			st = cn.prepareStatement(sql);
			st.setString(1, c.getPrenom());
			// Etape 4
			st.executeUpdate();
			cn.commit();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			try {
				cn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			SeDeconnecter(cn, st, null);
		}

	}

	@Override
	public void update(Client c, String nom, String prenom, String email, Adresse adresse) {
		// Information d'acces a la base de donnees
		Connection cn = null;
		PreparedStatement st = null;
		// PreparedStatement st1 = null;
		try {
			cn = SeConnecter();
			// Etape 3: Creer une requete
			String sql = "UPDATE clients SET nom = ?, prenom = ?, email = ?,  WHERE idClient = ? ";
			st = cn.prepareStatement(sql);
			st.setString(1, nom);
			st.setString(2, prenom);
			st.setString(3, email);
			st.setInt(4, c.getIdClient());
			st.executeUpdate();

			String sql1 = "UPDATE adresses SET adresse = ?, codePostal = ?, ville = ?,  WHERE adresses.idClient = ? ";
			st = cn.prepareStatement(sql1);
			st.setString(1, c.getAdresse().getAdresse());
			st.setInt(2, c.getAdresse().getCodePostal());
			st.setString(3, c.getAdresse().getVille());
			st.setInt(4, c.getIdClient());
			st.executeUpdate();

			// Etape 4
			cn.commit();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			try {
				cn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			SeDeconnecter(cn, st, null);
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Connection cn = null;
		PreparedStatement st = null;
		try {
			cn = SeConnecter();
			// Etape 3: Creer une requete
			String sql = "delete from clients where id = ? ";
			st = cn.prepareStatement(sql);
			st.setInt(1, id);
			// Etape 4
			st.executeUpdate();
			cn.commit();

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			try {
				cn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			SeDeconnecter(cn, st, null);
		}

	}

	@Override
	public Client FindById(int id) {
		// TODO Auto-generated method stub
		Connection cn = null;
		ResultSet rs = null;
		PreparedStatement prepst = null;

		try {

			cn = SeConnecter();

			// Etape 3: Creer une requete
			String sql = "SELECT * FROM clients where id = ?";
			prepst = cn.prepareStatement(sql);
			prepst.setInt(1, id);
			// Etape 4
			rs = prepst.executeQuery(sql);
			cn.commit();
			rs.next(); // on aurait pu faire un while
			int i = rs.getInt(1);
			String nom = rs.getString(2);
			String prenom = rs.getString(3);
			String email = rs.getString(4);
			Client c = new Client(nom, prenom, email);
			c.setIdClient(i);
			return c;

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				cn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {

			SeDeconnecter(cn, prepst, rs);

		}
		return null;

	}

	@Override
	public List<Client> FindAll() {
		// TODO Auto-generated method stub

		Connection cn = null;
		ResultSet rs = null;
		PreparedStatement prepst = null;
		List<Client> list = new ArrayList<Client>();

		try {

			cn = SeConnecter();

			// Etape 3: Creer une requete
			String sql = "SELECT * FROM clients";
			prepst = cn.prepareStatement(sql);
			// Etape 4
			rs = prepst.executeQuery();
			cn.commit();
			while (rs.next()) {
				int i = rs.getInt(1);
				String nom = rs.getString(2);
				String prenom = rs.getString(3);
				String email = rs.getString(4);
				Client c = new Client(nom, prenom, email);
				c.setIdClient(i);
				list.add(c);
			} // on aurait pu faire un while

			return list;

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				cn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} finally {

			SeDeconnecter(cn, prepst, rs);

		}

		return null;
	}

	@Override
	public List<Client> FindClients(ConseillerClientele cc) {
		// TODO Auto-generated method stub

		Connection cn = null;
		ResultSet rs = null;
		PreparedStatement prepst = null;
		List<Client> list = new ArrayList<Client>();

		try {

			cn = SeConnecter();

			// Etape 3: Creer une requete
			String sql = "SELECT * FROM clients WHERE clients.idConseillerCliente = ?";
			prepst = cn.prepareStatement(sql);
			prepst.setInt(1, cc.getIdConseillerClientele());
			// Etape 4
			rs = prepst.executeQuery();
			cn.commit();
			while (rs.next()) {
				int i = rs.getInt(1);
				String nom = rs.getString(2);
				String prenom = rs.getString(3);
				String email = rs.getString(4);
				Client c = new Client(nom, prenom, email);
				c.setIdClient(i);
				list.add(c);
			} // on aurait pu faire un while

			return list;

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				cn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} finally {

			SeDeconnecter(cn, prepst, rs);

		}

		return null;
	}

	@Override
	public List<Compte> FindComptes(Client c) {
		Connection cn = null;
		ResultSet rs = null;
		PreparedStatement prepst = null;
		PreparedStatement prepst1 = null;
		List<Compte> list = new ArrayList<Compte>();

		try {

			cn = SeConnecter();

			// Etape 3: Creer une requete
			String sql = "SELECT * FROM comptesCourants WHERE comptesCourants.idClient = ?";
			prepst = cn.prepareStatement(sql);
			prepst.setInt(1, c.getIdClient());
			// Etape 4
			rs = prepst.executeQuery();
			cn.commit();
			while (rs.next()) {
				int i = rs.getInt(1);
				int numeroDeCompte = rs.getInt(2);
				double solde = rs.getDouble(3);
				String dateOuvertureCompte = rs.getString(4);
				double decouvert = rs.getDouble(5);
				CompteCourant cl = new CompteCourant(numeroDeCompte, dateOuvertureCompte, decouvert);
				cl.setIdCompte(i);
				cl.setNumeroDeCompte(numeroDeCompte);
				list.add(cl);
			} // on aurait pu faire un while

			String sql1 = "SELECT * FROM comptesEpargnes WHERE comptesEpargnes.idClient = ?";
			prepst1 = cn.prepareStatement(sql1);
			prepst1.setInt(1, c.getIdClient());
			rs = prepst1.executeQuery();
			cn.commit();

			while (rs.next()) {
				int i = rs.getInt(1);
				int numeroDeCompte = rs.getInt(2);
				double solde = rs.getDouble(3);
				String dateOuvertureCompte = rs.getString(4);
				double taux = rs.getDouble(5);
				CompteEpargne cl = new CompteEpargne(numeroDeCompte, dateOuvertureCompte, taux);
				cl.setIdCompte(i);
				cl.setNumeroDeCompte(numeroDeCompte);
				list.add(cl);
			}

			return list;

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				cn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} finally {

			SeDeconnecter(cn, prepst, rs);

		}

		return null;
	}
	
	@Override
	public List<Compte> FindAllComptes(ConseillerClientele cc) {
		// TODO Auto-generated method stub
		List<Client> clients = this.FindClients(cc);
		List<Compte> comptes = new ArrayList<Compte>();
		
		for (Client client : clients) {
			List<Compte> comptesclient = this.FindComptes(client);
			for (Compte compte : comptesclient) {
				comptes.add(compte);
			}
		}
		
		return comptes;
	}

	

	@Override
	public void virementCC(Compte c1, Compte c2, double mt) throws MontantNegatifException {
		if(mt<0) throw new MontantNegatifException("Le montant que vous avez rentré est négatif");

		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		// PreparedStatement st1 = null;
		try {
			cn = SeConnecter();
			// Etape 3: Creer une requete

			// On commence par débiter le compte débiteur
			// Avant de débiter le compte il faut qu'on teste quel type de compte s'est
			if (c1.isTypeDeCompte() == false) {

				String sql = "SELECT solde from comptesCourants WHERE comptesCourants.idClient = ?";
				st = cn.prepareStatement(sql);
				st.setDouble(1, c1.getTitulaireduCompte().getIdClient());
				rs = st.executeQuery();
				cn.commit();

				double decouvert = 0.;

				while (rs.next()) {
					decouvert = rs.getDouble(1);
				}

				if (c1.getSolde() - mt < -decouvert) throw new MontantNegatifException(
							"Vouz ne pouvez pas effectuer ce virement car il n'y a pas assez de fonds sur le compte à debiter");

				String sql1 = "UPDATE comptesCourants SET solde = ? WHERE comptesCourants.idClient = ? ";
				st = cn.prepareStatement(sql1);
				st.setDouble(1, c1.getSolde() - mt);
				st.setInt(2, c1.getTitulaireduCompte().getIdClient());
				st.executeUpdate();
				cn.commit();

			}

			if (c1.isTypeDeCompte() == true) {

				if (c1.getSolde() - mt < 0)
					throw new MontantNegatifException(
							"Vouz ne pouvez pas changer votre decouvert car votre solde est inferieur au decouvert que vous voulez rentrer");

				String sql1 = "UPDATE comptesEpargnes SET solde = ? WHERE comptesEpargnes.idClient = ? ";
				st = cn.prepareStatement(sql1);
				st.setDouble(1, c1.getSolde() - mt);
				st.setInt(2, c1.getTitulaireduCompte().getIdClient());
				st.executeUpdate();
				cn.commit();

			}
			
			
			// Maintenant on crédite le compte recepteur
			
			if (c1.isTypeDeCompte() == false) {

				String sql1 = "UPDATE comptesCourants SET solde = ? WHERE comptesCourants.idClient = ? ";
				st = cn.prepareStatement(sql1);
				st.setDouble(1, c2.getSolde() + mt);
				st.setInt(2, c2.getTitulaireduCompte().getIdClient());
				st.executeUpdate();
				cn.commit();

			}

			if (c1.isTypeDeCompte() == true) {

				String sql1 = "UPDATE comptesEpargnes SET solde = ? WHERE comptesEpargnes.idClient = ? ";
				st = cn.prepareStatement(sql1);
				st.setDouble(1, c2.getSolde() + mt);
				st.setInt(2, c2.getTitulaireduCompte().getIdClient());
				st.executeUpdate();
				cn.commit();

			}
			
			

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			try {
				cn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			SeDeconnecter(cn, st, null);
		}

	}

	
}
