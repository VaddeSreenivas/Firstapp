package com.pawana;

import java.sql.*;


public class MysqlPreparestmtPro {
	
public static void main(String[] args) throws SQLException {
		
		
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
			
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
			
	//PreparedStatement smt= con.prepareStatement("insert into emp values(?,?,?)");  
			
	PreparedStatement smd = con.prepareStatement("delete from emp where id=?");
	
	smd.setInt(1, 3);
	 
			/*
			 * smt.setInt(1, 8); smt.setString(2, "Sree"); smt.setString(3, "VA");
			 */
			
		//int i =smt.executeUpdate();
	
	int i =smd.executeUpdate();
		
		System.out.println(i +"Records sucussfully deleted");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
