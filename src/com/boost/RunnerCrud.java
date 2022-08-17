package com.boost;

import java.sql.SQLException;

import com.boost.repository.CRUD;

public class RunnerCrud {

	public static void main(String[] args) throws SQLException {
		CRUD crud = new CRUD("satisDB");
		crud.ExecutiveQuery(
				"INSERT INTO tblmusteri(ad,soyad,adres,telefon) VALUES ('Adi2', 'Yok','Istanbul','0 000 000 0000')");

	}

}
