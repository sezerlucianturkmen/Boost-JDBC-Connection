package com.boost;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Runner2 {

	public static void main(String[] args) throws Exception {
		Driver.class.forName("org.postgresql.Driver");

		String address = "jdbc:postgresql://ec2-35-180-234-243.eu-west-3.compute.amazonaws.com:5432/TblOgrenciDB";
		String userName = "postgres";
		String password = "root";

		Connection connection = DriverManager.getConnection(address, userName, password);

		String sqlString = "INSERT INTO tblogrenci(adsoyad) VALUES ('Sezer Turkmen')";
		PreparedStatement pr = connection.prepareCall(sqlString);
		pr.executeUpdate();
		connection.close();

	}

}
