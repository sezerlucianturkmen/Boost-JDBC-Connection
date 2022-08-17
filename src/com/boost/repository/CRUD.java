package com.boost.repository;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUD {

	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	private final String USERNAME = "postgres";
	private final String PASSWORD = "root";
	private final String URL = "jdbc:postgresql://localhost:5432/";
	private final String databaseName;

	public CRUD(String databaseName) {
		super();
		this.databaseName = databaseName;
	}

	private boolean OpenConnection() {

		try {
			Driver.class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(URL + this.databaseName, USERNAME, PASSWORD);
			return true;

		} catch (Exception e) {
			System.out.println("Baglanti hatası..: " + e.toString());
			return false;
		}
	}

	private void CloseConnection() {
		try {
			if (!conn.isClosed())
				conn.close();
		} catch (Exception e) {
			System.out.println("Baglanti kapatma sorunu..: " + e.toString());
		}
	}

	public void ExecutiveQuery(String sql) throws SQLException {
		if (OpenConnection()) {
			ps = conn.prepareCall(sql);
			ps.executeUpdate();
			CloseConnection();
		} else {
			System.out.println("Baglanti acilamadi");
		}
	}

}
