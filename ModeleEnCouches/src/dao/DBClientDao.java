package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Client;

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
			st.setString(1, c.getName());
			// Etape 4
			st.executeUpdate();
			cn.commit();

		} catch (SQLException |ClassNotFoundException e) {
			// TODO Auto-generated catch block
			try {
				cn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}  finally {
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
			
		} catch (SQLException | ClassNotFoundException  e) {
			// TODO Auto-generated catch block
			try {
				cn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}  finally {
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
			Client c = new Client(nom);
			c.setId(i);
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
				Client c = new Client(nom);
				c.setId(i);
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
			
		}  finally {

			SeDeconnecter(cn, prepst, rs);

		}

		return null;
	}

}
