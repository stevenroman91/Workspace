package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DaoUtil {

	private static final String url = "jdbc:mysql://localhost/proxibanquedb";
	private static final String login = "root";
	private static final String passwd = "";

	protected Connection SeConnecter() throws ClassNotFoundException, SQLException {

		Connection cn = null;

		// Etape 1 : Chargement du driver
		Class.forName("com.mysql.jdbc.Driver");
		// Etape 2 : Creér une connexion a la base
		cn = DriverManager.getConnection(url, login, passwd);
		cn.setAutoCommit(false);
		return cn;
	}

	protected void SeDeconnecter(Connection cn, PreparedStatement st, ResultSet rs) {

		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			if (st != null)
				st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {

			if (cn != null)
				cn.close();
			;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
