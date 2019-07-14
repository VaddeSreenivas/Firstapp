package com.pawana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql1 {
	
	public static void main(String[] args) throws SQLException {
		
		
		//	Class.forName("com.mysql.cj.jdbd.Driver");
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			
			Statement st = con.createStatement();
			
			ResultSet rs =st.executeQuery("select * from emp");
			
			while(rs.next())
				System.out.println(rs.getInt(1) + " " +rs.getString(2)+ " " +rs.getString(3));
				
			
			con.close();
	//	} catch (ClassNotFoundException e) {
		
	//		e.printStackTrace();
		}
		
		
	}


