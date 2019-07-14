import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySql {
	
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			
			Statement st =con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from emp");
			
			while(rs.next()) 
				
				System.out.println(rs.getInt(1)+ " " + rs.getString(2) +" " +rs.getString(3));
			
			
			con.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
