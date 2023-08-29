package com.amdocs;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc_Connection {
	
	public static Connection getConnection() {
		Connection con;
		
		try {
			con= DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/pet_db","root","Admin@123");
			return con;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
		
	}

}
