package demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {

	private static final String url = "jdbc:mysql://localhost/formation";
	private static final String login = "root";
	private static final String passwd = "";

	public static Connection SeConnecter() throws ClassNotFoundException, SQLException {

		Connection cn = null;

		// Etape 1 : Chargement du driver
		Class.forName("com.mysql.jdbc.Driver");
		// Etape 2 : Creér une connexion a la base
		cn = DriverManager.getConnection(url, login, passwd);

		return cn;
	}

	public static void SeDeconnecter(Connection cn, PreparedStatement st, ResultSet rs) {

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
