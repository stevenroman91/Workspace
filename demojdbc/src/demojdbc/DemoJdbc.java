package demojdbc;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DemoJdbc {

	public static void sauverEnBase(String personne) {

		// Information d'acces a la base de donnees
		Connection cn = null;
		PreparedStatement st = null;

		try {


			cn = JDBCUtil.SeConnecter();
			// Etape 3: Creer une requete
			String sql = "INSERT INTO `javadb` (`personne`) VALUES ('" + personne + "')";
			st = cn.prepareStatement(sql);			
			// Etape 4
			st.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.SeDeconnecter(cn, st, null);
		}

	}
	
	public static void lireEnBase() {
		
		// Information d'acces a la base de donnees

		Connection cn = null;
		ResultSet rs = null;
		PreparedStatement prepst = null;
		
		try {
		
			cn=JDBCUtil.SeConnecter();
			
			// Etape 3: Creer une requete
			String sql = "SELECT * FROM javadb";
			prepst = cn.prepareStatement(sql);
			
			// Etape 4
			rs = prepst.executeQuery(sql);
			while(rs.next()) {
				
				System.out.println(rs.getString("personne"));
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			JDBCUtil.SeDeconnecter(cn, prepst, rs);
		
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sauverEnBase("Steven ROMAN");
		lireEnBase();
	}

}
