package contactManagement;
import java.sql.*;
public class DBConnection {

	 private static final String url="jdbc:mysql://localhost:3306/contactManagement";
	 private static final String userName="root";
	 private static final String password="Priya@2004";
	 
	 public static Connection getConnection() throws SQLException {
		 return DriverManager.getConnection(url,userName,password);
	 }
}
