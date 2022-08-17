package com.boost;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Runner {

	public static void main(String[] args) throws Exception {
		// 1-Driver -> DB ile connection içim driver ihitiyacı vardır
		// hangi DB kullanacak isek onun sağlanması gerekir.
		// 2-Driver eklenir.
		// 3-Connection.Driver Manage edilmeli.
		// Eğer kendi pc bağlanılacak ise localhost yazılmalı
		// SYNTAX jdbc:postgresql://host:port/database
		// 4-SQL cumlesini hazırlıyoruz.
		Driver.class.forName("org.postgresql.Driver");

		String address = "jdbc:postgresql://localhost:5432/satisDB";
		String userName = "postgres";
		String password = "root";

		Connection connection = DriverManager.getConnection(address, userName, password);

		String sqlString = "INSERT INTO tblmusteri(ad,soyad,adres,telefon) VALUES ('Java', 'User','Istanbul','0 000 000 0000')";
		PreparedStatement pr = connection.prepareCall(sqlString);
		pr.executeUpdate();
		connection.close();
	}

}
