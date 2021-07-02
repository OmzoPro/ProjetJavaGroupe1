package sn.EE_bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sn.EE_bank.domaine.Compte;



/**
 * AbstractDAO.java This DAO class provides CRUD database operations for the
 * table users in the database.
 * 
 * @author Ramesh Fadatare
 *
 */
public class UpdateCompte {
	private String jdbcURL = "jdbc:mysql://localhost:3306/abbank?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "";

	

	
	
	private static final String UPDATE_USERS_SQL = "UPDATE compte set solde=? WHERE numCompte=?";

	public UpdateCompte() {
	}

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	


	

	

	public boolean updateUser(Compte user) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
			statement.setString(1, user.getNumCompte());;
			statement.setInt(2, user.getSolde());
			statement.setString(3, user.getTypeCompte());
			statement.setInt(4, user.getIdClient());
			statement.setInt(5, user.getIdCompte());
			
			

			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}

	

}
