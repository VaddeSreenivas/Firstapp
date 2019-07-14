package com.pawana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mysql2 {
	
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			
			PreparedStatement smt =con.prepareStatement("Select * from emp");
			
			ResultSet rs = smt.executeQuery();
			
			while (rs.next())
				
				System.out.println(rs.getInt(1)+ " " +rs.getString(2)+ "" +rs.getString(3));
			System.out.println("records getting done");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
